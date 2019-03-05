package com.example.tiwa2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        R.values.array.random_parrots
//        getResouce
        tapMe.setOnClickListener() {
            val gifMovie: Int = R.raw.partyparrot
            Glide.with(this).load(gifMovie).into(imageView)
        }
    }
}
