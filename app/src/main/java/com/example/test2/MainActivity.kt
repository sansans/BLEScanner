package com.example.test2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val secondActivitybutton = findViewById<Button>(R.id.scanbt1)
    secondActivitybutton.setOnClickListener {view ->
        val intent = Intent(this, BlueToothList1::class.java)
        startActivity(intent)
    }

    }


}