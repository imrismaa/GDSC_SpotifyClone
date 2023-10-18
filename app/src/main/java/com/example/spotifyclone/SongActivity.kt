package com.example.spotifyclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spotifyclone.MainActivity.Companion.EXTRA_EMAILORUSERNAME
import com.example.spotifyclone.databinding.ActivitySongBinding

class SongActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySongBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            val emailOrUsername = intent.getStringExtra(EXTRA_EMAILORUSERNAME)

            txtDescription.setText("JKT48, Geisha, Raisa, and more \nMade for $emailOrUsername \n3h 24min")

            btnBackToMain.setOnClickListener {
                val intentToMainActivity = Intent(this@SongActivity, MainActivity::class.java)
                startActivity(intentToMainActivity)
            }

            var isLoved = false
            btnLike.setOnClickListener {
                if (isLoved == false) {
                    btnLike.setBackgroundResource(R.drawable.baseline_favorite_24)
                    isLoved = true
                }
                else {
                    btnLike.setBackgroundResource(R.drawable.baseline_favorite_border_24)
                    isLoved = false
                }
            }
            btnLikeSong1.setOnClickListener {
                if (isLoved == false) {
                    btnLikeSong1.setBackgroundResource(R.drawable.baseline_favorite_24)
                    isLoved = true
                }
                else {
                    btnLikeSong1.setBackgroundResource(R.drawable.baseline_favorite_border_24)
                    isLoved = false
                }
            }
            btnLikeSong2.setOnClickListener {
                if (isLoved == false) {
                    btnLikeSong2.setBackgroundResource(R.drawable.baseline_favorite_24)
                    isLoved = true
                }
                else {
                    btnLikeSong2.setBackgroundResource(R.drawable.baseline_favorite_border_24)
                    isLoved = false
                }
            }
            btnLikeSong3.setOnClickListener {
                if (isLoved == false) {
                    btnLikeSong3.setBackgroundResource(R.drawable.baseline_favorite_24)
                    isLoved = true
                }
                else {
                    btnLikeSong3.setBackgroundResource(R.drawable.baseline_favorite_border_24)
                    isLoved = false
                }
            }
        }
    }
}