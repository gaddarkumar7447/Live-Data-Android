package com.example

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ModeViewFactory(var valInit : Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ModelView(valInit) as T
    }
}
