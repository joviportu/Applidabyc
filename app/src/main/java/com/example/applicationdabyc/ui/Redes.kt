package com.example.applicationdabyc.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.net.Uri
import android.widget.TextView
import android.widget.VideoView
import androidx.fragment.app.Fragment
import com.example.applicationdabyc.R

class Redes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_redes)
        val video = findViewById<VideoView>(R.id.video1)
        val uri : Uri= Uri.parse(
            "android.resource://" + packageName +"/raw/videovisitanos"
        )
        video.setVideoURI(uri)
        video.requestFocus()
        video.resume()
        video.start()

        //facebook
        val Openface: TextView= findViewById(R.id.tvFacebook)
        Openface.setOnClickListener {
            val openlink = Intent(android.content.Intent.ACTION_VIEW)
            openlink.data= Uri.parse("https://www.facebook.com/Fdabycoficial")
            startActivity(openlink)
        //twitter
        val Opentwitter: TextView= findViewById(R.id.tvTwitter)
            Opentwitter.setOnClickListener {
                val openlink = Intent(android.content.Intent.ACTION_VIEW)
                openlink.data= Uri.parse("https://www.twitter.com/fdabyc")
                startActivity(openlink)

        //Instagram
        val Openinstagram: TextView= findViewById(R.id.tvInstagram)
        Openinstagram.setOnClickListener {
            val openlink = Intent(android.content.Intent.ACTION_VIEW)
            openlink.data= Uri.parse("https://www.instagram.com/fundaciondabyc/?hl=es-la")
            startActivity(openlink)

        //TIKTOK
        val Opentiktok: TextView= findViewById(R.id.tvtiktok)
        Opentiktok.setOnClickListener {
            val openlink = Intent(android.content.Intent.ACTION_VIEW)
            openlink.data= Uri.parse("https://www.tiktok.com/@fundaciondabyc?_t=8WQXAvMGJ41&_r=1")
            startActivity(openlink)

        //LIKEDIN
        val Openlikedin: TextView= findViewById(R.id.tvlinkedin)
        Openlikedin.setOnClickListener {
            val openlink = Intent(android.content.Intent.ACTION_VIEW)
            openlink.data= Uri.parse("https://www.linkedin.com/in/fundaci%C3%B3n-dios-abre-brecha-y-camino-76a1a9250")
            startActivity(openlink)



        }
        }
        }
            }

        }
    }
}