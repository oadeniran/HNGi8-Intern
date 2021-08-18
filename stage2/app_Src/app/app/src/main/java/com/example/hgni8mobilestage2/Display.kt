package com.example.hgni8mobilestage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.view.*

class Display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val message = intent.getStringExtra(EXTRA_MSG)

        val textView = findViewById<TextView>(R.id.textView2).apply{
        text = message
        }
    }

}