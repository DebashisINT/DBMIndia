package com.breezedbmindia.features.dailyPlan.model

import com.breezedbmindia.features.addAttendence.model.UpdatePlanListModel
import java.io.Serializable

/**
 * Created by Saikat on 24-12-2019.
 */
class UpdatePlanListInputParamsModel : Serializable {
    var session_token = ""
    var user_id = ""
    var update_plan_list: ArrayList<UpdatePlanListModel>? = null
}