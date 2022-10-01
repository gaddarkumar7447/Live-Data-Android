package com.example

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.math.log

class ModelView : ViewModel(){
   var count = 0

    fun getData() : Int{
        return count++
    }
}