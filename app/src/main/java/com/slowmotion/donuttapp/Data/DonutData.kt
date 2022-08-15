package com.slowmotion.donuttapp.Data
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DonutData(
    var name: String = "",
    var flavor: String = "",
    var price: String = "",
    var detail: String = "",
    var photo: Int = 0,
):Parcelable
