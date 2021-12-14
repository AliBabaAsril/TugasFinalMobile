package com.example.tugasfinalmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugasfinalmobile.UI.Home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.container_fragment, HomeFragment())
            .commitNow()
    }
}