package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding  : ActivityMainBinding
    private lateinit var modelClass: ViewModelClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        modelClass = ViewModelProvider(this)[ViewModelClass::class.java]

        modelClass.total.observe(this) {
            binding.textShow.text = it.toString()
        }

        binding.button.setOnClickListener(View.OnClickListener {
            modelClass.getTotal(binding.editText.text.toString().toInt())

        })
    }
}