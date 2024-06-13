package com.example.app1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Looper
import java.util.logging.Handler

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //durasi dalam milidetik
        val splashScreenDuration= 3000L
        android.os.Handler(Looper.getMainLooper()).postDelayed({
        //mulai mainActivity setelah durasi splash screen selesai
            startActivity(Intent(this, Login::class.java))
            finish()
        }, splashScreenDuration)



    }
}