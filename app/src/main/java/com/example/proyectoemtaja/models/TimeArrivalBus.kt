package com.example.projectemt.models

import com.google.gson.annotations.SerializedName
import java.util.ArrayList

data class TimeArrivalBus(var code:String ,var description:String,var datetime:String,@SerializedName("data")var data :ArrayList<Data>) {
}

