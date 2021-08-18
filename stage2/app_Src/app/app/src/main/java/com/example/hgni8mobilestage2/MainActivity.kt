package com.example.hgni8mobilestage2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.content.Intent
import android.text.method.LinkMovementMethod
import android.view.View
import android.widget.TextView

const val EXTRA_MSG = "com.example.hgni8mobilestage2.MESSAGE"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textview = findViewById<TextView>(R.id.textView)
        textview.setMovementMethod(LinkMovementMethod.getInstance())

    }
    fun sendMessage(view:View){
        val editText = findViewById<EditText>(R.id.editText)
        val msg = editText.text.toString()
        val intent = Intent(this, Display::class.java).apply {
            putExtra(EXTRA_MSG, msg)
        }
        startActivity(intent)
    }

}