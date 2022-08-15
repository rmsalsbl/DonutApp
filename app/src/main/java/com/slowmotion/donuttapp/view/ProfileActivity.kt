package com.slowmotion.donuttapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.slowmotion.donuttapp.R

class ProfileActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profilePhoto: ImageView = findViewById(R.id.profile_photo)
        val tvusername: TextView = findViewById(R.id.tv_userName)
        val tvemail: TextView = findViewById(R.id.tv_email)

        val username = intent.getStringExtra(EXTRA_USERNAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val photo = intent.getIntExtra(EXTRA_PHOTO, 0)

        profilePhoto.setImageResource(photo)
        tvusername.text = username
        tvemail.text = email



    }

}