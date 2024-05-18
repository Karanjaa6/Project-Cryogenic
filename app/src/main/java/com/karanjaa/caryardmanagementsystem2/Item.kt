package com.karanjaa.caryardmanagementsystem2

import androidx.annotation.DrawableRes

data class Item(
    val title:String,
    @DrawableRes val image:Int,
    val Route :String,
    val Value:Int
)
