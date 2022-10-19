package com.example.health_app

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException
import java.util.*



class CalendarFragment : Fragment() {

    var dp: DatePicker? = null
    var edtDiary: EditText? = null
    var btnWrite: Button? = null
    var fileName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calendar, container, false)
        dp = view.findViewById<View>(R.id.datePicker1) as DatePicker
        edtDiary = view.findViewById<View>(R.id.edtDiary) as EditText
        btnWrite = view.findViewById<View>(R.id.btnWrite) as Button

        val cal = Calendar.getInstance()
        val cYear = cal[Calendar.YEAR]
        val cMonth = cal[Calendar.MONTH]
        val cDay = cal[Calendar.DAY_OF_MONTH]

//        dp!!.init(cYear, cMonth, cDay) { view, year, monthOfYear, dayOfMonth ->
//            fileName = (Integer.toString(year) + "_"
//                    + Integer.toString(monthOfYear + 1) + "_"
//                    + Integer.toString(dayOfMonth) + ".txt")
//
//            val str = readDiary(fileName)
//            edtDiary!!.setText(str)
//            btnWrite!!.isEnabled = true
//        }
//
//        btnWrite!!.setOnClickListener {
//            try {
//                val outFs: FileOutputStream  = openFileOutput(
//                    fileName,
//                    AppCompatActivity.MODE_PRIVATE
//                )
//                val str = edtDiary!!.text.toString()
//                outFs.write(str.toByteArray())
//                outFs.close()
//                Toast.makeText(this.requireContext(), " 일지 저장", Toast.LENGTH_SHORT).show()
//            } catch (e: IOException) {
//            }
//        }
        return view
    }



//    fun readDiary(fName: String?): String? {
//        var diaryStr: String? = null
//        val inFs: FileInputStream
//        try {
//            inFs = openFileInput(fName)
//            val txt = ByteArray(500)
//            inFs.read(txt)
//            inFs.close()
//            diaryStr = String(txt).trim { it <= ' ' }
//            btnWrite!!.text = "수정 하기"
//        } catch (e: IOException) {
//            edtDiary!!.hint = "일지 없음"
//            btnWrite!!.text = "새로 저장"
//        }
//        return diaryStr
//    }


}