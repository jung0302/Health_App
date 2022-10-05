package com.example.health_app

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BMI : AppCompatActivity() {
    var result: Button? = null
    var height: EditText? = null
    var weight: EditText? = null
    var textView: TextView? = null
    var text: TextView? = null
    var text2: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi)
        height = findViewById<View>(R.id.height) as EditText
        weight = findViewById<View>(R.id.weight) as EditText
        textView = findViewById<View>(R.id.textview) as TextView
        text = findViewById<View>(R.id.text) as TextView
        text2 = findViewById<View>(R.id.text2) as TextView
        result = findViewById<View>(R.id.result) as Button
        result!!.setOnClickListener {
            var strNum = height!!.text.toString()
            val height = strNum.toInt().toDouble()
            strNum = weight!!.text.toString()
            val weight = strNum.toInt().toDouble()
            val result = weight / height / height * 10000
            strNum = String.format("%.2f", result)
            textView!!.text = strNum
            if (result <= 18.5) {
                text!!.text = "저체중"
                text!!.setTextColor(Color.parseColor("#7da4bd"))
                text2!!.text = "당신은 저체중 입니다. 건강을 위해서 살을 찌울 필요가 있습니다!"
            } else if (result >= 18.5 && result <= 23) {
                text!!.text = "정상"
                text!!.setTextColor(Color.parseColor("#557cd5"))
                text2!!.text = "당신은 아주 좋은 몸의 밸런스를 유지하고 있습니다!"
            } else if (23 <= result && result <= 25) {
                text!!.text = "과체중"
                text!!.setTextColor(Color.parseColor("#787ad6"))
                text2!!.text = "운동을 병행해준다면 더 이쁜몸의 균형을 유지할 수 있을거에요."
            } else if (25 <= result && result <= 30) {
                text!!.text = "비만"
                text!!.setTextColor(Color.parseColor("#ba78d9"))
                text2!!.text = "식습관을 조금 고쳐보는 것은 어떨까요? 건강에 적신호가 들어왔습니다."
            } else if (result >= 30) {
                text!!.text = "고도비만"
                text!!.setTextColor(Color.parseColor("#f85264"))
                text2!!.text = "당신의 현재 건강상태는 위험 식습관 관리와 운동을 병행 해야합니다!"
            }
        }
    }
}


