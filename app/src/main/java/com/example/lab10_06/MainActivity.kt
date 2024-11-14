package com.androidcourse.laboratorio10_ejercicio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.lab10_06.Screens.SeriesApp
import com.example.lab10_06.ui.theme.Lab1006Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Lab1006Theme {
                SeriesApp()
            }
        }
    }
}