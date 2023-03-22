package com.example.applicationdabyc.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.applicationdabyc.R

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        val tvGoLogin= findViewById<TextView>(R.id.tv_go_to_login)
        tvGoLogin.setOnClickListener{
            gotoLogin()
            }
    }
        private fun gotoLogin(){
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
             }
}