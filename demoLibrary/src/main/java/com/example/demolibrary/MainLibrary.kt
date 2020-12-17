package com.example.demolibrary

import android.content.Context
import android.widget.Toast

class MainLibrary {

    fun printMessage(context: Context){
        Toast.makeText(context, "Ya estamos dentro de la libreria", Toast.LENGTH_SHORT).show();
    }
}