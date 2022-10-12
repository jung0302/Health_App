package com.example.health_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import java.io.FileInputStream
import java.io.IOException
import java.util.*

class Diary : AppCompatActivity() {
    var dp: DatePicker? = null
    var edtDiary: EditText? = null
    var btnWrite: Button? = null
    var fileName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diary)

        dp = findViewById<View>(R.id.datePicker1) as DatePicker
        edtDiary = findViewById<View>(R.id.edtDiary) as EditText
        btnWrite = findViewById<View>(R.id.btnWrite) as Button
        val cal = Calendar.getInstance()
        val cYear = cal[Calendar.YEAR]
        val cMonth = cal[Calendar.MONTH]
        val cDay = cal[Calendar.DAY_OF_MONTH]

        dp!!.init(cYear, cMonth, cDay) { view, year, monthOfYear, dayOfMonth ->
            fileName = (Integer.toString(year) + "_"
                    + Integer.toString(monthOfYear + 1) + "_"
                    + Integer.toString(dayOfMonth) + ".txt")
            val str = readDiary(fileName)
            edtDiary!!.setText(str)
            btnWrite!!.isEnabled = true
        }
        btnWrite!!.setOnClickListener {
            try {
                val outFs = openFileOutput(
                    fileName,
                    MODE_PRIVATE
                )
                val str = edtDiary!!.text.toString()
                outFs.write(str.toByteArray())
                outFs.close()
                Toast.makeText(applicationContext, " 일지 저장", Toast.LENGTH_SHORT).show()
            } catch (e: IOException) {
            }
        }

    }

    fun readDiary(fName: String?): String? {
        var diaryStr: String? = null
        val inFs: FileInputStream
        try {
            inFs = openFileInput(fName)
            val txt = ByteArray(500)
            inFs.read(txt)
            inFs.close()
            diaryStr = String(txt).trim { it <= ' ' }
            btnWrite!!.text = "수정 하기"
        } catch (e: IOException) {
            edtDiary!!.hint = "일지 없음"
            btnWrite!!.text = "새로 저장"
        }
        return diaryStr
    }
}