package com.example

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.math.log

class ModelView(var lateIni : Int) : ViewModel(){
   var count = lateIni

    fun getData() : Int{
        return count++
    }

    fun decrement() : Int{
        return count--
    }

}