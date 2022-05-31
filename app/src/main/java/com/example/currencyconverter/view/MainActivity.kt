package com.example.currencyconverter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currencyconverter.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_noActionBar)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}