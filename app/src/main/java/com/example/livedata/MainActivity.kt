package com.example.livedata

import android.content.Context
import android.location.Address
import android.location.Geocoder
import android.location.Location
import android.location.LocationManager
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.databinding.ActivityMainBinding
import java.io.IOException
import java.util.*


class MainActivity : AppCompatActivity() {
    private lateinit var binding  : ActivityMainBinding
    private lateinit var modelClass: ViewModelClass
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        modelClass = ViewModelProvider(this)[ViewModelClass::class.java]


        /*val locationManager : LocationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
        val location: Location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)

        var cityName = getCityName(location.longitude, location.latitude)*/

        binding.button.setOnClickListener(View.OnClickListener {
                /*binding.textShow.text = cityName*/
        })
    }
    private fun getCityName(longitude: Double, latitude: Double): String? {
        var cityName: String? = "Not Found"
        //progressBar.setVisibility(View.INVISIBLE);
        val geocoder = Geocoder(baseContext, Locale.getDefault())
        try {
            val addresses: List<Address> = geocoder.getFromLocation(latitude, longitude, 10)
            for (ad in addresses) {
                if (ad != null) {
                    val city: String = ad.getLocality()
                    if (city != null && city != "") {
                        cityName = city

                    } else {
                        Log.d("TAG", "City not found")
                    }
                }
            }
        } catch (e: IOException) {
            e.printStackTrace()
        }
        return cityName
    }
}