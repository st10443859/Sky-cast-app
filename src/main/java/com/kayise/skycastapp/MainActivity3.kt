package com.kayise.skycastapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val mainmenu:Button = findViewById(R.id.mainmenu)
        mainmenu.setOnClickListener {
            val intent = Intent( this,MainActivity2::class.java)
            startActivity(intent)
        }


    }
}