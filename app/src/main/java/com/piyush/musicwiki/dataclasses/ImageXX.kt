package com.piyush.musicwiki.dataclasses


import com.google.gson.annotations.SerializedName

data class ImageXX(
    val size: String,
    @SerializedName("#text")
    val text: String
)