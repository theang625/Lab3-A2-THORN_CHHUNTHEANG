package com.example.thornchhuntheang

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.thornchhuntheang.ui.theme.ThornChhuntheangTheme

class MainActivity : ComponentActivity() {

    private val TAG = "Lab03"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG, "onCreate called")
        enableEdgeToEdge()

        setContent {
            ThornChhuntheangTheme {
                DashboardScreen()
            }
        }
    }
}