package com.example.health_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class AerobicList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aerobic_list)

        val listView = findViewById<ListView>(R.id.listView)
        val item = arrayOf("트레드밀","싸이클","로잉머신","바 머슬업","링 머슬업","덤벨 버피","배틀링 로프","덤벨 쓰러스터","인치웜")
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)

        listView.setOnItemClickListener { adapterView, view, position, l ->
            if (position==0){
                val intent = Intent(view.context,Aerobic0::class.java)
                startActivity(intent)
            }
            else if (position==1){
                val intent = Intent(view.context,Aerobic1::class.java)
                startActivity(intent)
            }
            else if (position==2){
                val intent = Intent(view.context,Aerobic2::class.java)
                startActivity(intent)
            }
            else if (position==3){
                val intent = Intent(view.context,Aerobic3::class.java)
                startActivity(intent)
            }
            else if (position==4){
                val intent = Intent(view.context,Aerobic4::class.java)
                startActivity(intent)
            }
            else if (position==5){
                val intent = Intent(view.context,Aerobic5::class.java)
                startActivity(intent)
            }
            else if (position==6){
                val intent = Intent(view.context,Aerobic6::class.java)
                startActivity(intent)
            }
            else if (position==7){
                val intent = Intent(view.context,Aerobic7::class.java)
                startActivity(intent)
            }
            else if (position==8){
                val intent = Intent(view.context,Aerobic8::class.java)
                startActivity(intent)
            }


        }
}
    }