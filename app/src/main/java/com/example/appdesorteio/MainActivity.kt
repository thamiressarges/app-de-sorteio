package com.example.appdesorteio

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Random

class MainActivity : AppCompatActivity() {

    private lateinit var txtResult: TextView
    private lateinit var btnDraw: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        txtResult = findViewById(R.id.txt_result)
        btnDraw = findViewById(R.id.btn_draw)

        btnDraw.setOnClickListener {
            val number = Random().nextInt(11)
            txtResult.setText("" + number)
        }
    }
}