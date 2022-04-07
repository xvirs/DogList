package com.example.doglist

import com.google.gson.annotations.SerializedName

data class DogsResponse(
    @SerializedName(value = "status") var status:String,
    @SerializedName(value = "message") var images:List<String>
    )