package com.example.demo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton: Button = findViewById(R.id.button);

        boton.setOnClickListener(){
            testLibrary()
        }

    }

    fun testLibrary(){
        Log.i("Main", "Dentro del Main Activity")
        Toast.makeText(this, "En el main Activity", Toast.LENGTH_LONG).show()
    }
}