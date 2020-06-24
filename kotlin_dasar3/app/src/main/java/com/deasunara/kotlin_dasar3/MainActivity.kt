package com.deasunara.kotlin_dasar3

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun tekanMulai (view: View){
        var time : Long
        if (editTime.text.isEmpty()){
            time = 0
        }else{
            time = editTime.text.toString().toLong()
        }


        object : CountDownTimer((time*1000), 1000){
            override fun onFinish() {
               txtTime.text="0"
            }

            override fun onTick(p0: Long) {
                txtTime.text = (p0/1000).toString()
            }
        }.start()
    }
}
