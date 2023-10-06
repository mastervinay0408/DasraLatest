package com.dasra.dasralatest

import CustomAdapter
import ProgramPageAdapter1
import ProgramPageAdapter2
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProgramPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.program_page)
//        val btn = findViewById<TextView>(R.id.alreadyHaveAccount)
//        btn.setOnClickListener { v: View? ->
//            startActivity(
//                Intent(
//                    this@HomePage1,
//                    MainActivity::class.java
//                )
//            )
//        }



        // getting the recyclerview by its id
        val recyclerviewgrp = findViewById<RecyclerView>(R.id.recyclerviewgroups)

        // this creates a vertical layout Manager
        recyclerviewgrp.layoutManager = LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL, false)

        // ArrayList of class ItemsViewModel
        val datagrp = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            datagrp.add(ItemsViewModel("","","","", "" , ""))
        }

        // This will pass the ArrayList to our Adapter
        val adaptergrp = ProgramPageAdapter1(datagrp)
        // Setting the Adapter with the recyclerview
        recyclerviewgrp.adapter = adaptergrp


   val recyclerviewmod = findViewById<RecyclerView>(R.id.recyclerviewmodules)

        // this creates a vertical layout Manager
        recyclerviewmod.layoutManager = LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL, false)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view
        for (i in 1..20) {
            data.add(ItemsViewModel("","","","", "" , ""))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = ProgramPageAdapter2(data)
        // Setting the Adapter with the recyclerview
        recyclerviewmod.adapter = adapter


    }
}