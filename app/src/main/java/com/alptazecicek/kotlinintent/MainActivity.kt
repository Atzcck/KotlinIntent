package com.alptazecicek.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("OnCreate Called")
    }

    override fun onResume() {
        super.onResume()
        println("onResume Called")
    }

    override fun onStop() {
        super.onStop()
        println("onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy Called")

    }

    fun next(view: View) {
        val intent = Intent(applicationContext,NextActivity::class.java)
        intent.putExtra("username",usernameText.text.toString())
        intent.putExtra("name", nameText.text.toString())
        startActivity(intent)
        finish() //önceki aktiviteyi kapatır
    }
}