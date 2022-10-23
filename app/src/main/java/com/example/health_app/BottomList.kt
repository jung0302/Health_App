package com.example.health_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class BottomList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_list)

        val listView = findViewById<ListView>(R.id.listView)
        val item = arrayOf("벤치프레스","숄더프레스","비하인드넥","렛풀다운","푸쉬업","케이블푸쉬다운","렛풀다운","렛풀다운","렛풀다운")
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)

    }
}