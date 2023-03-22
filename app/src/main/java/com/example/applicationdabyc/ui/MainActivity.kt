package com.example.applicationdabyc.ui
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.applicationdabyc.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvGoRegister= findViewById<TextView>(R.id.tv_go_to_register)
        tvGoRegister.setOnClickListener{
            gotoRegister()
        }
        val tvGoMenu= findViewById<TextView>(R.id.btn_go_to_menu)
        tvGoMenu.setOnClickListener{
            gotoMenu()
        }


    }
    private fun gotoRegister(){
        val i = Intent(this, Registro::class.java)
        startActivity(i)
    }
    private fun gotoMenu(){
        val i = Intent(this, MainActivity1::class.java)
        startActivity(i)
    }

}