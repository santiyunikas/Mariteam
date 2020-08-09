package com.santiyunikas.mariteam

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toolbar
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        profileSet()
        toolbarSet()
    }

    fun profileSet(){
        val profilePhoto: ImageView = findViewById(R.id.profile_photo)

        val bitmap: Bitmap = BitmapFactory.decodeResource(resources, R.drawable.profile)
        val roundedBitmapDrawable: RoundedBitmapDrawable = RoundedBitmapDrawableFactory.create(resources, bitmap)
        roundedBitmapDrawable.isCircular = true
        profilePhoto.setImageDrawable(roundedBitmapDrawable)
    }

    fun toolbarSet(){
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setActionBar(toolbar)
        actionBar?.setDisplayShowTitleEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setTitle("About")
        actionBar?.setLogo(R.drawable.logo)
        toolbar.setBackgroundColor(resources.getColor(R.color.colorPrimaryDark))
        toolbar.setTitleTextColor(resources.getColor(R.color.white))
        toolbar.setNavigationOnClickListener {
            finish()
        }
    }
}
