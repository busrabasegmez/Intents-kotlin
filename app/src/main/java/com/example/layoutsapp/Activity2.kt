package com.example.layoutsapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        //receive data
        val bundle: Bundle? =intent.extras
        val age = bundle?.get("age")

        Toast.makeText(this,"your age" +  age ,Toast.LENGTH_LONG).show()


        }
    }
