package com.example.demolibrary

import android.content.Context
import android.util.Log
import android.widget.Toast

class MainLibrary {

    fun printMessage(context: Context){
        Log.i("Library", "Dentro de la libreria...")
        Toast.makeText(context, "Ya estamos dentro de la libreria", Toast.LENGTH_SHORT).show();
    }
}