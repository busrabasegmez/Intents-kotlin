package com.example.layoutsapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn: Button = findViewById(R.id.btn)
        btn.setOnClickListener() {
            //explicit intent
            var i: Intent = Intent(this, Activity2::class.java)


            //passing datas between screens
            i.putExtra("age",30 )

            startActivity(i)

        }


    }


}