package com.sevval.myapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sevval.myapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.passWord

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var preferences: SharedPreferences
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main)
        setContentView(binding.root)
         preferences = getSharedPreferences("information", MODE_PRIVATE)

        binding.Logbutton.setOnClickListener{
            var KayıtUser= preferences.getString("userName","")
            var KayıtPassword= preferences.getString("userPassword","")

            var girisUser= binding.kulanCAd.text.toString()
            var girisPassword= binding.passWord.text.toString()

            if ((KayıtUser==girisUser)&&(KayıtPassword==girisPassword)){
                intent= Intent(applicationContext, MainWellcome::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(applicationContext,"wrong to user information", Toast.LENGTH_LONG).show()
            }


        }
        binding.Signbutton.setOnClickListener{
            intent= Intent(applicationContext, MainKaydol::class.java)
            startActivity(intent)
        }
    }
}