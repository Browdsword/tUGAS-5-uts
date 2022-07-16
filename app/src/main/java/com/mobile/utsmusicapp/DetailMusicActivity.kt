package com.mobile.utsmusicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMusicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_music)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val superHero = intent.getParcelableExtra<Music>(MainActivity.INTENT_PARCELABLE)

        val imageMusic = findViewById<ImageView>(R.id.img_item_photo)
        val nameMusic = findViewById<TextView>(R.id.tv_item_name)
        val descMusic = findViewById<TextView>(R.id.tv_item_description)

        imageMusic.setImageResource(superHero?.imageMusic!!)
        nameMusic.text = superHero.nameMusic
        descMusic.text = superHero.descMusic

    }

    override fun onSupportNavigateUp(): Boolean{
        onBackPressed()
        return true
    }
}