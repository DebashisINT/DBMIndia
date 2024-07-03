package com.breezedbmindia.features.mylearning
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.media.ThumbnailUtils
import android.provider.MediaStore
import android.util.Log
import android.util.LruCache
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.breezedbmindia.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class VideoGridAdapter(private val context: Context, private val videoList: List<GridViewAllVideoModal>) : BaseAdapter() {

    private val memoryCache: LruCache<String, Bitmap> by lazy {
        val cacheSize = (Runtime.getRuntime().maxMemory() / 1024 / 8).toInt()
        LruCache<String, Bitmap>(cacheSize)
    }

    override fun getCount(): Int = videoList.size

    override fun getItem(position: Int): Any = videoList[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.gridview_item_all_vdo, parent, false)
            viewHolder = ViewHolder(view, context)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val videoData = videoList[position]
        viewHolder.bind(videoData, memoryCache)

        return view
    }

    class ViewHolder(private val view: View, private val context: Context) {
        private val imageView: ImageView = view.findViewById(R.id.iv_thumnail)
        private val textView: TextView = view.findViewById(R.id.tv_videoname)

        fun bind(videoData: GridViewAllVideoModal, memoryCache: LruCache<String, Bitmap>) {
            textView.text = videoData.videoName



            val cachedBitmap = memoryCache.get(videoData.videoImg)
            if (cachedBitmap != null) {
                imageView.setImageBitmap(cachedBitmap)
            } else {
                CoroutineScope(Dispatchers.Main).launch {
                    val bitmap = retrieveVideoThumbnail(videoData.videoImg)
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap)
                        memoryCache.put(videoData.videoImg, bitmap)
                    } else {
                        Log.e("VideoGridAdapter", "Failed to retrieve thumbnail for ${videoData.videoImg}")
                        imageView.setImageBitmap(BitmapFactory.decodeResource(context.resources, R.drawable.ic_default_reimbursement_icon))

                    }
                }
            }

        }

        private suspend fun retrieveVideoThumbnail(videoPath: String): Bitmap? {
            return withContext(Dispatchers.IO) {
                try {
                    ThumbnailUtils.createVideoThumbnail(
                        videoPath,
                        MediaStore.Video.Thumbnails.MINI_KIND
                    )
                } catch (e: Exception) {
                    e.printStackTrace()
                    Log.e("VideoGridAdapter", "Error retrieving thumbnail: ${e.message}")
                    null
                }
            }
        }
    }
}
