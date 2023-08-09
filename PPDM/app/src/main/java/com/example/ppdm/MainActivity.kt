package com.example.ppdm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    protected void OnStart(){
        super.OnStart();
        Log.d("Ciclo de ida Activivty")
    }
}