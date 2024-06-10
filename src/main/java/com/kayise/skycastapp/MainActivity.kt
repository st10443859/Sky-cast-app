package com.kayise.skycastapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainmenu:Button = findViewById(R.id.mainmenu)
        mainmenu.setOnClickListener {  }
        //start activity main
        val intent = Intent( this, MainActivity::class.java)
        startActivity(intent)

        val exitbutton : Button = findViewById(R.id.exitbutton)
        exitbutton.setOnClickListener {


            exitProcess(0)
        }
    }
}