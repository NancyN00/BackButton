package com.example.backbutton

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var buton : Button
    private lateinit var buttwo: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buton = findViewById(R.id.btnone)
        buttwo = findViewById(R.id.butwo)

        buton.setOnClickListener {
            val intent = Intent(this, OneActivity::class.java)
            startActivity(intent)
        }

        buttwo.setOnClickListener {
            val intent = Intent(this, TwoActivity::class.java)
            startActivity(intent)
        }
    }
}