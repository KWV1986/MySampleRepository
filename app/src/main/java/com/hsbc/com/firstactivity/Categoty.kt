package com.hsbc.com.firstactivity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Categoty(val id:Int,val name:String): Parcelable
