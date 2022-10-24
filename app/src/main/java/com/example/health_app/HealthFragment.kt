package com.example.health_app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton


class HealthFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        val view = inflater.inflate(R.layout.fragment_health, container, false)
        val top: ImageButton = view.findViewById(R.id.top)
        val bottom: ImageButton = view.findViewById(R.id.bottom)
        val aerobic: ImageButton = view.findViewById(R.id.aerobic)

        //버튼별 인텐트처리
        top.setOnClickListener {
            val intent = Intent(this.requireContext(),TopList::class.java)
            startActivity(intent)
        }

        bottom.setOnClickListener {
            val intent = Intent(this.requireContext(),BottomList::class.java)
            startActivity(intent)
        }

        aerobic.setOnClickListener {
            val intent = Intent(this.requireContext(),AerobicList::class.java)
            startActivity(intent)
        }

        return view
    }


}