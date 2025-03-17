package com.sevval.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sevval.myapp.databinding.ActivityMainMoveamBinding
import com.sevval.myapp.databinding.ActivityMainMoveanBinding

class MainMovean : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainMoveanBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main_movean)
        setContentView(binding.root)

        binding.button5.setOnClickListener {
            intent= Intent(applicationContext, MainHome::class.java)
            startActivity(intent)
        }





    }
}