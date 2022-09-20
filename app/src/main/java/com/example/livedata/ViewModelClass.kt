package com.example.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelClass : ViewModel(){

    var total = MutableLiveData<Int>()
    init {
        total.value  = 0
    }
    fun getTotal(input : Int){
        total.value = total.value?.plus(input)
    }

}