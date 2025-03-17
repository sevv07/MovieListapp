package com.sevval.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sevval.myapp.databinding.ActivityMainMoveamBinding
import com.sevval.myapp.databinding.ActivityMainMoveanBinding
import com.sevval.myapp.databinding.ActivityMainMovereBinding

class MainMovere : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainMovereBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main_movere)
        setContentView(binding.root)


        binding.button6.setOnClickListener {
            intent= Intent(applicationContext, MainHome::class.java)
            startActivity(intent)
        }
        binding.imageButton.setOnClickListener {
            intent= Intent(applicationContext, MainAskInt::class.java)
            startActivity(intent)
        }
    }
}