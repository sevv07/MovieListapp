package com.sevval.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import com.sevval.myapp.databinding.ActivityMainHomeBinding

class MainHome : AppCompatActivity() {
    private lateinit var toggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainHomeBinding.inflate(layoutInflater)
        //setContentView(R.layout.activity_main_home)
        setContentView(binding.root)


        binding.button3.setOnClickListener {
            intent= Intent(applicationContext, MainMoveam::class.java)
            startActivity(intent)
        }
        binding.button2.setOnClickListener {
            intent= Intent(applicationContext, MainMovean::class.java)
            startActivity(intent)
        }
        binding.button.setOnClickListener {
            intent= Intent(applicationContext, MainMovere::class.java)
            startActivity(intent)
        }
      binding.apply{
          toggle= ActionBarDrawerToggle(this@MainHome,drawerLayout,R.string.open,R.string.close)
         drawerLayout.addDrawerListener(toggle)
          toggle.syncState()

          supportActionBar?.setDisplayHomeAsUpEnabled(true)

          navView.setNavigationItemSelectedListener {
              when(it.itemId){
                  R.id.nav_home-> {
                      Toast.makeText(this@MainHome,"Home click", Toast.LENGTH_LONG).show()
                  }
                  R.id.nav_prof->{
                      Toast.makeText(this@MainHome,"Profile click", Toast.LENGTH_LONG).show()
                  }
              }
              true
          }
}

       }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}