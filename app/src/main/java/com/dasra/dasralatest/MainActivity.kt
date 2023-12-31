package com.dasra.dasralatest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<TextView>(R.id.textViewSignUp)
        btn.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    RegisterActivity::class.java
                )
            )
        }
        val btn2 = findViewById<Button>(R.id.btnlogin)
        btn2.setOnClickListener {
            startActivity(
                Intent(
                    this@MainActivity,
                    HomePage1::class.java
                )
            )
        }
    }
}