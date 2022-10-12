package com.example.health_app

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.FragmentActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import org.w3c.dom.Text


class SkillFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_skill, container, false)

        var topNavi = view.findViewById<BottomNavigationView>(R.id.topNavi)

        childFragmentManager.beginTransaction().replace(R.id.skill_ly, HealthFragment()).commit()
        topNavi.setOnNavigationItemSelectedListener { item ->
            when(item.itemId) {
                R.id.health -> {
                    childFragmentManager.beginTransaction().replace(R.id.skill_ly, HealthFragment()).commit()
                    true
                }
                R.id.bmi -> {
                    childFragmentManager.beginTransaction().replace(R.id.skill_ly, BmiFragment()).commit()
                    true
                }
                R.id.timer -> {
                    childFragmentManager.beginTransaction().replace(R.id.skill_ly, TimerFragment()).commit()
                    true
                }
                R.id.pedometer -> {
                    childFragmentManager.beginTransaction().replace(R.id.skill_ly, PedometerFragment()).commit()
                    true
                }
                else -> false
            }
        }







        return view


    }


}


