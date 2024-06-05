package com.example.keuangan

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.keuangan.ui.theme.UangkuAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UangkuAppTheme {
                UangkuApp()
            }
        }
    }
}
