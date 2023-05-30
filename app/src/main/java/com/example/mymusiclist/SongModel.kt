package com.example.mymusiclist

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SongModel(val name: String, val author: String, val image: Int, val about: String): Parcelable