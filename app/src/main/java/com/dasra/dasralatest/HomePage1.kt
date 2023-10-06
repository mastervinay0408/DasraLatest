package com.dasra.dasralatest

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class HomePage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page1)
//        val btn = findViewById<TextView>(R.id.alreadyHaveAccount)
//        btn.setOnClickListener { v: View? ->
//            startActivity(
//                Intent(
//                    this@HomePage1,
//                    MainActivity::class.java
//                )
//            )
//        }





        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)



    }
}