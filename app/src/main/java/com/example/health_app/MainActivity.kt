package com.example.health_app

import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TOP
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kakao.sdk.user.UserApiClient


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bottomNavi = findViewById<BottomNavigationView>(R.id.bottomNavi)
        supportFragmentManager.beginTransaction().replace(R.id.home_ly, HomeFragment()).commit()
        bottomNavi.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.home -> {
                    supportFragmentManager.beginTransaction().replace(R.id.home_ly, HomeFragment()).commit()
                    true
                }
                R.id.calendar -> {
                    supportFragmentManager.beginTransaction().replace(R.id.home_ly, CalendarFragment()).commit()
                    true
                }
                R.id.skill -> {
                    supportFragmentManager.beginTransaction().replace(R.id.home_ly, SkillFragment()).commit()
                    true
                }
                R.id.mypage -> {
                    supportFragmentManager.beginTransaction().replace(R.id.home_ly, MypageFragment()).commit()
                    true
                }
                else -> false
            }
        }
    }
}



