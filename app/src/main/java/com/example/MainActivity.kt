package com.example

import android.os.Bundle
import android.util.Log
import android.view.Display.Mode
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.livedata.R
import com.example.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var dataBinding : ActivityMainBinding
    lateinit var modelView: ModelView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        lifecycle.addObserver(LifeObserber())
        Log.d("TAG", "Activity on Create")

        modelView = ViewModelProvider(this)[ModelView::class.java]

        inCre()
        setText()
    }
    private fun setText(){
        dataBinding.textShow.text = modelView.count.toString()
    }

    private fun inCre(){
        dataBinding.button.setOnClickListener(View.OnClickListener {
            modelView.getData()
        })
        setText()
    }
}