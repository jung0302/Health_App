package com.example.health_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class TopList : AppCompatActivity() {
    var listView: ListView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_top_list)


        listView = findViewById(R.id.listView)
        val listView = findViewById<ListView>(R.id.listView)
        val item = arrayOf("벤치프레스","바벨 로우","덤벨 로우","펜들레이 로우","랫풀다운","친업","하이퍼 익스텐션","오버헤드 프레스","덤벨 숄더 프레스","덤벨 레터럴 레이즈","덤벨 프론트 레이즈","덤벨 슈러그","비하인드 넥 프레스","바벨 컬 ")
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)

        listView.setOnItemClickListener { adapterView, view, position, l ->
            if (position==0){
                val intent = Intent(view.context,Top0::class.java)
                startActivity(intent)
            }
            else if (position==1){
                val intent = Intent(view.context,Top1::class.java)
                startActivity(intent)
            }
            else if (position==2){
                val intent = Intent(view.context,Top2::class.java)
                startActivity(intent)
            }
            else if (position==3){
                val intent = Intent(view.context,Top3::class.java)
                startActivity(intent)
            }
            else if (position==4){
                val intent = Intent(view.context,Top4::class.java)
                startActivity(intent)
            }
            else if (position==5){
                val intent = Intent(view.context,Top5::class.java)
                startActivity(intent)
            }
            else if (position==6){
                val intent = Intent(view.context,Top6::class.java)
                startActivity(intent)
            }
            else if (position==7){
                val intent = Intent(view.context,Top7::class.java)
                startActivity(intent)
            }
            else if (position==8){
                val intent = Intent(view.context,Top8::class.java)
                startActivity(intent)
            }
            else if (position==9){
                val intent = Intent(view.context,Top9::class.java)
                startActivity(intent)
            }
            else if (position==10){
                val intent = Intent(view.context,Top10::class.java)
                startActivity(intent)
            }
            else if (position==11){
                val intent = Intent(view.context,Top11::class.java)
                startActivity(intent)
            }
            else if (position==12){
                val intent = Intent(view.context,Top12::class.java)
                startActivity(intent)
            }
            else if (position==13){
                val intent = Intent(view.context,Top13::class.java)
                startActivity(intent)
            }

        }

    }
}