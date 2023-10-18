package com.example.spotifyclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spotifyclone.LoginActivity.Companion.EXTRA_USERNAME
import com.example.spotifyclone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    companion object{
        const val EXTRA_EMAILORUSERNAME = "extra_emailorusername"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            cardDm1.setOnClickListener {
                val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
                val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
                intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
                startActivity(intentToSongActivity)
            }
            cardDm2.setOnClickListener {
                val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
                val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
                intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
                startActivity(intentToSongActivity)
            }
            cardDm4.setOnClickListener {
                val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
                val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
                intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
                startActivity(intentToSongActivity)
            }
            cardDm5.setOnClickListener {
                val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
                val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
                intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
                startActivity(intentToSongActivity)
            }
            cardKpopon.setOnClickListener {
                val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
                val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
                intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
                startActivity(intentToSongActivity)
            }
            cardLikedSongs.setOnClickListener {
                val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
                val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
                intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
                startActivity(intentToSongActivity)
            }
            cardOnRepeat.setOnClickListener {
                val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
                val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
                intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
                startActivity(intentToSongActivity)
            }
            cardPopmix.setOnClickListener {
                val intentToSongActivity = Intent(this@MainActivity, SongActivity::class.java)
                val emailOrUsername = intent.getStringExtra(EXTRA_USERNAME)
                intentToSongActivity.putExtra(EXTRA_EMAILORUSERNAME, emailOrUsername)
                startActivity(intentToSongActivity)
            }
        }
    }
}