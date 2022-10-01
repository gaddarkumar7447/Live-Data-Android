package com.example

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class LifeObserber : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun obserber(){
        Log.d("TAG", "Observer On create")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun obserber1(){
        Log.d("TAG", "Observer On Resume")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun obserber2(){
        Log.d("TAG", "Observer On pause")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun obserber3(){
        Log.d("TAG", "Observer On stop")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun obserber4(){
        Log.d("TAG", "Observer On destroy")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun obserber5(){
        Log.d("TAG", "Observer On Start")
    }
    /*@OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun obserber6(){
        Log.d("TAG", "Observer On Any")
    }*/
    var a = 0
    fun dataShow() : Int{
        return a++
    }

}