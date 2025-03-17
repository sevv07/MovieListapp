package com.sevval.myapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sevval.myapp.databinding.ActivityMainKayDolBinding
import com.sevval.myapp.databinding.ActivityMainWellcomeBinding

class MainKaydol : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding= ActivityMainKayDolBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main_kay_dol)
        setContentView(binding.root)
        binding.kaySavebutton.setOnClickListener{
            var userInformation = binding.kayTKulanCAd.text.toString()
            var userPassword =binding.kayTpassWord.text.toString()
            var SharedPreferences =this.getSharedPreferences("information", MODE_PRIVATE)
            var editor =SharedPreferences.edit()

            // adding data
            editor.putString("userName","$userInformation").apply()
            editor.putString("userPassword","$userPassword").apply()
            Toast.makeText(applicationContext,"Registration successful",Toast.LENGTH_LONG).show()
            binding.kayTKulanCAd.text.clear()
            binding.kayTpassWord.text.clear()
        }




        binding.kayTbackbutton.setOnClickListener{
            intent= Intent(applicationContext,MainActivity:: class.java)
            startActivity(intent)
        }

    }
}