package com.sevval.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sevval.myapp.databinding.ActivityMainAskIntBinding
import com.sevval.myapp.databinding.ActivityMainMoveamBinding

class MainAskInt : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding= ActivityMainAskIntBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main_ask_int)
        setContentView(binding.root)

        binding.button7.setOnClickListener {
            intent= Intent(applicationContext, MainMovere::class.java)
            startActivity(intent)
        }
        binding.button8.setOnClickListener {
            intent= Intent(applicationContext, MainMovere::class.java)
            startActivity(intent)
        }
    }
}