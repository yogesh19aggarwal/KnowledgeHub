package com.example.firstapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val call = findViewById<Button>(R.id.Call)

        call.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:" + "9354313779")
            startActivity(intent)
        }

        val AppD = findViewById<CardView>(R.id.AppDev)
        val webD = findViewById<CardView>(R.id.Web)
        val machine = findViewById<CardView>(R.id.ML)
        val IosA = findViewById<CardView>(R.id.IosApp)
        val softD = findViewById<CardView>(R.id.Soft)
        val DevO = findViewById<CardView>(R.id.Dev)

        AppD.setOnClickListener{
            val intent = Intent(applicationContext, AndroidApp::class.java)
            startActivity(intent)
        }


    }
}