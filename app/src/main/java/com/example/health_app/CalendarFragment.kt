package com.example.health_app



import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Bundle
import android.util.Log
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
    private lateinit var button: Button
    var fileName: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_calendar, container, false)
//        dp = view.findViewById<View>(R.id.datePicker1) as DatePicker
//        edtDiary = view.findViewById<View>(R.id.edtDiary) as EditText
        button = view.findViewById(R.id.btnWrite)

//        val cal = Calendar.getInstance()
//        val cYear = cal[Calendar.YEAR]
//        val cMonth = cal[Calendar.MONTH]
//        val cDay = cal[Calendar.DAY_OF_MONTH]
//
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
//                val outFs  = openFileOutput(
//                    fileName,
//                    MODE_PRIVATE
//                )
//                val str = edtDiary!!.text.toString()
//                outFs.write(str.toByteArray())
//                outFs.close()
//                Toast.makeText(this.requireContext(), " 일지 저장", Toast.LENGTH_SHORT).show()
//            } catch (e: IOException) {
//            }
//        }
        button.setOnClickListener{
            var intent = Intent(this.requireContext(),Diary::class.java)
            startActivity(intent)
            Log.d("d","클릭")
        }

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