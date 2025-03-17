package com.sevval.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sevval.myapp.databinding.ActivityMainHomeBinding
import com.sevval.myapp.databinding.ActivityMainMoveamBinding

class MainMoveam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding= ActivityMainMoveamBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main_moveam)
        setContentView(binding.root)


        binding.button4.setOnClickListener {
            intent= Intent(applicationContext, MainHome::class.java)
            startActivity(intent)
        }
        binding.imageButton15.setOnClickListener {
            intent= Intent(applicationContext, Maincoco::class.java)
            startActivity(intent)
        }
    }
}