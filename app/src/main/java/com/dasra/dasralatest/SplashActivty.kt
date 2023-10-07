package com.dasra.dasralatest

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

private const val SPLASH_DISPLAY_LENGTH = 2000L

class SplashActivty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)
        Handler(Looper.getMainLooper()).postDelayed(Runnable { /* Create an Intent that will start the MainActivity. */
            val mainIntent = Intent(this@SplashActivty, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, SPLASH_DISPLAY_LENGTH)
    }
}