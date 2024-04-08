package com.test.happyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test.happyplaces.databinding.ActivityMainBinding

class AddHappyPlaceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}