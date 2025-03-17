package com.sevval.myapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sevval.myapp.databinding.ActivityMainWellcomeBinding

class MainWellcome : AppCompatActivity() {
    lateinit var preferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainWellcomeBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main_wellcome)
        setContentView(binding.root)

        //getting data in xml
        preferences = getSharedPreferences("information", MODE_PRIVATE)
        var kayıtUser = preferences.getString("userName","")
        var kayıtPassword= preferences.getString("userPassword","")
        // textView ları transfered to information
        binding.kulanCBLgS.text="User name:"+kayıtUser.toString()
        binding.kulanCPassword.text="User password:"+kayıtPassword.toString()

        binding.exitbutton.setOnClickListener{
            intent= Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
        }
        binding.exitbutton1.setOnClickListener{
            intent= Intent(applicationContext, MainHome::class.java)
            startActivity(intent)
        }
    }
}