package com.example.health_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class BottomList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_list)

        val listView = findViewById<ListView>(R.id.listView)
        val item = arrayOf("바벨 백스쿼트","맨몸 스플릿 스쿼트","프론트 스쿼트","레그 프레스","레그 컬","레그 익스텐션","덤벨 런지","맨몸 오버헤드 스쿼트","스탠딩 카프 레이즈","이너 싸이 머신","에어 스쿼트","런지","점프 스쿼트","스텝업 ")
        listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)


        listView.setOnItemClickListener { adapterView, view, position, l ->
            if (position==0){
                val intent = Intent(view.context,Bottom0::class.java)
                startActivity(intent)
            }
            else if (position==1){
                val intent = Intent(view.context,Bottom1::class.java)
                startActivity(intent)
            }
            else if (position==2){
                val intent = Intent(view.context,Bottom2::class.java)
                startActivity(intent)
            }
            else if (position==3){
                val intent = Intent(view.context,Bottom3::class.java)
                startActivity(intent)
            }
            else if (position==4){
                val intent = Intent(view.context,Bottom4::class.java)
                startActivity(intent)
            }
            else if (position==5){
                val intent = Intent(view.context,Bottom5::class.java)
                startActivity(intent)
            }
            else if (position==6){
                val intent = Intent(view.context,Bottom6::class.java)
                startActivity(intent)
            }
            else if (position==7){
                val intent = Intent(view.context,Bottom7::class.java)
                startActivity(intent)
            }
            else if (position==8){
                val intent = Intent(view.context,Bottom8::class.java)
                startActivity(intent)
            }
            else if (position==9){
                val intent = Intent(view.context,Bottom9::class.java)
                startActivity(intent)
            }
            else if (position==10){
                val intent = Intent(view.context,Bottom10::class.java)
                startActivity(intent)
            }
            else if (position==11){
                val intent = Intent(view.context,Bottom11::class.java)
                startActivity(intent)
            }
            else if (position==12){
                val intent = Intent(view.context,Bottom12::class.java)
                startActivity(intent)
            }
            else if (position==13){
                val intent = Intent(view.context,Bottom13::class.java)
                startActivity(intent)
            }


        }
    }
}