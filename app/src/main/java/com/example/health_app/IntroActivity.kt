package com.example.health_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)
        Handler().postDelayed({ startActivity(Intent(this, LoginActivity::class.java)) }, 2000L)
    }
    override fun onPause() {
        super.onPause()
        finish() //액티비티가 일시정지(화면전환)이 되면 종료
    }
}