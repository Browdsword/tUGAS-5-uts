package com.mobile.utsmusicapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Music(
    val imageMusic : Int,
    val nameMusic: String,
    val descMusic: String
) : Parcelable
