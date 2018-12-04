package com.example.schooluser.myapplication

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_left_menu.*

class LeftMenuFragmet : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_left_menu, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottonn.setOnClickListener {
            if (bottonn.isChecked) {
                cap.setBackgroundResource(R.color.darkerTelegram)
                commandmenu.setBackgroundResource(R.color.darkTelegram)
                no1.setTextColor(Color.parseColor("#ffffff"))
                no2.setTextColor(Color.parseColor("#ffffff"))
                no3.setTextColor(Color.parseColor("#ffffff"))
                no4.setTextColor(Color.parseColor("#ffffff"))
                no5.setTextColor(Color.parseColor("#ffffff"))
                no6.setTextColor(Color.parseColor("#ffffff"))
                no7.setTextColor(Color.parseColor("#ffffff"))
                no8.setTextColor(Color.parseColor("#ffffff"))
                no9.setTextColor(Color.parseColor("#ffffff"))
                no10.setTextColor(Color.parseColor("#ffffff"))
            }else{cap.setBackgroundResource(R.color.cap)
                commandmenu.setBackgroundResource(R.color.white)
                no1.setTextColor(Color.parseColor("#929292"))
                no2.setTextColor(Color.parseColor("#929292"))
                no3.setTextColor(Color.parseColor("#929292"))
                no4.setTextColor(Color.parseColor("#929292"))
                no5.setTextColor(Color.parseColor("#929292"))
                no6.setTextColor(Color.parseColor("#929292"))
                no7.setTextColor(Color.parseColor("#929292"))
                no8.setTextColor(Color.parseColor("#929292"))
                no9.setTextColor(Color.parseColor("#929292"))
                no10.setTextColor(Color.parseColor("#929292"))
            }

        }
    }
}