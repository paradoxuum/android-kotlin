package com.example.aluno.android_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResumo", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart", "onRestart")
    }
}
