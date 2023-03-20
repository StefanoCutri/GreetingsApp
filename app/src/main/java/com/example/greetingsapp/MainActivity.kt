package com.example.greetingsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declare de Views

        val edt : EditText = findViewById(R.id.edt)
        val btn : Button = findViewById(R.id.btn)

        //Functionalities
        btn.setOnClickListener(){
            var text = edt.text
            Toast.makeText(this,
                "Hello $text",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}