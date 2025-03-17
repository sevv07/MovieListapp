package com.sevval.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sevval.myapp.databinding.ActivityMainAskIntBinding
import com.sevval.myapp.databinding.ActivityMaincocoBinding

class Maincoco : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding= ActivityMaincocoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_maincoco)
        setContentView(binding.root)

        binding.button9.setOnClickListener {
            intent= Intent(applicationContext, MainMoveam::class.java)
            startActivity(intent)
        }
        binding.button10.setOnClickListener {
            intent= Intent(applicationContext, MainMoveam::class.java)
            startActivity(intent)
        }
    }
}