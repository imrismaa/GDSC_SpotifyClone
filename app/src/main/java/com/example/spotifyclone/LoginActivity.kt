package com.example.spotifyclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.spotifyclone.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    companion object{
        const val EXTRA_USERNAME = "extra_username"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            btnBackToSplash.setOnClickListener {
                val intentToSplashActivity = Intent(this@LoginActivity, SplashActivity::class.java)
                startActivity(intentToSplashActivity)
            }

            btnLogin.setOnClickListener{
                val emailOrUsernameInput = editTxtEmailOrUsername.text.toString()
                val intentToMainActivity = Intent(this@LoginActivity, MainActivity::class.java)
                intentToMainActivity.putExtra(EXTRA_USERNAME, emailOrUsernameInput)
                startActivity(intentToMainActivity)
            }
            btnLoginWoPw.setOnClickListener {
                val emailOrUsernameInput = editTxtEmailOrUsername.text.toString()
                val intentToMainActivity = Intent(this@LoginActivity, MainActivity::class.java)
                intentToMainActivity.putExtra(EXTRA_USERNAME, emailOrUsernameInput)
                startActivity(intentToMainActivity)
                startActivity(intentToMainActivity)
            }
        }
    }
}