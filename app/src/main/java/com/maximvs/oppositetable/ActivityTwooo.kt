package com.maximvs.oppositetable

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ActivityTwooo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twooo)

        var textView2 = findViewById<TextView>(R.id.textView)
        var indexYes2 = findViewById<TextView>(R.id.textView4)
        var indexNo2 = findViewById<TextView>(R.id.textView5)
        var indexxx2 = findViewById<TextView>(R.id.textView3)

        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)

        val btnHome = findViewById<Button>(R.id.btn_home)
        val btnEnt = findViewById<Button>(R.id.btn_ent)

        val btnlist = listOf(btn1, btn2, btn3, btn4, btn5, btn6)

        val num1 = listOf(2, 3, 4, 5, 6, 7, 8, 9)
        val num2 = listOf(9, 8, 7, 6, 5, 4, 3, 2)

        var indexYes = 0
        var indexNo = 0
        var indexxx = 0

        fun iff() {
            indexYes++
            indexYes2.setText("верно: $indexYes")
        }

        fun elsee() {
            indexNo++
            indexNo2.setText("неверно: $indexNo")
        }

        fun multiplication() {

            btn1.setTextColor(Color.WHITE)
            btn2.setTextColor(Color.WHITE)
            btn3.setTextColor(Color.WHITE)
            btn4.setTextColor(Color.WHITE)
            btn5.setTextColor(Color.WHITE)
            btn6.setTextColor(Color.WHITE)

            indexxx++
            indexxx2.setText("вопрос  $indexxx")

            var result2 = mutableListOf(4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 24, 25, 27, 28,
                    30, 32, 35, 36, 40, 42, 45, 48, 49, 54, 56, 63, 64, 72, 81)

            val rand1 = num1.random()
            val rand2 = num2.random()
            val rand3 = rand1*rand2
            val randBtn = btnlist.random()
            textView2.text = "$rand1*$rand2="
            randBtn.text = "$rand3"
            result2.remove(rand3)

            if (btn1 != randBtn) {
                val rand11 = result2.random()
                btn1.text = "$rand11"
                result2.remove(rand11)
            }
            if (btn2 != randBtn) {
                val rand12 = result2.random()
                btn2.text = "$rand12"
                result2.remove(rand12)
            }
            if (btn3 != randBtn) {
                val rand13 = result2.random()
                btn3.text = "$rand13"
                result2.remove(rand13)
            }
            if (btn4 != randBtn) {
                val rand14 = result2.random()
                btn4.text = "$rand14"
                result2.remove(rand14)
            }
            if (btn5 != randBtn) {
                val rand15 = result2.random()
                btn5.text = "$rand15"
                result2.remove(rand15)
            }
            if (btn6 != randBtn) {
                val rand16 = result2.random()
                btn6.text = "$rand16"
                result2.remove(rand16)
            }

            btn1.setOnClickListener {
                if (btn1 == randBtn) {
                    iff()
                    btn1.setTextColor(Color.GREEN)
                    textView2.setTextColor(Color.GREEN)
                } else {
                    elsee()
                    btn1.setTextColor(Color.RED)
                    textView2.setTextColor(Color.RED)
                }
            }
            btn2.setOnClickListener {
                if (btn2 == randBtn) {
                    iff()
                    btn2.setTextColor(Color.GREEN)
                    textView2.setTextColor(Color.GREEN)
                } else {
                    elsee()
                    btn2.setTextColor(Color.RED)
                    textView2.setTextColor(Color.RED)
                }
            }
            btn3.setOnClickListener {
                if (btn3 == randBtn) {
                    iff()
                    btn3.setTextColor(Color.GREEN)
                    textView2.setTextColor(Color.GREEN)
                } else {
                    elsee()
                    btn3.setTextColor(Color.RED)
                    textView2.setTextColor(Color.RED)
                }
            }
            btn4.setOnClickListener {
                if (btn4 == randBtn) {
                    iff()
                    btn4.setTextColor(Color.GREEN)
                    textView2.setTextColor(Color.GREEN)
                } else {
                    elsee()
                    btn4.setTextColor(Color.RED)
                    textView2.setTextColor(Color.RED)
                }
            }
            btn5.setOnClickListener {
                if (btn5 == randBtn) {
                    iff()
                    btn5.setTextColor(Color.GREEN)
                    textView2.setTextColor(Color.GREEN)
                } else {
                    elsee()
                    btn5.setTextColor(Color.RED)
                    textView2.setTextColor(Color.RED)
                }
            }
            btn6.setOnClickListener {
                if (btn6 == randBtn) {
                    iff()
                    btn6.setTextColor(Color.GREEN)
                    textView2.setTextColor(Color.GREEN)
                } else {
                    elsee()
                    btn6.setTextColor(Color.RED)
                    textView2.setTextColor(Color.RED)
                }
            }
        }

        multiplication()

        btnHome.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@ActivityTwooo, MainActivity::class.java)
            startActivity(intent)
        })

        btnEnt.setOnClickListener(View.OnClickListener {
            btn1.text = " "
            btn2.text = " "
            btn3.text = " "
            btn4.text = " "
            btn5.text = " "
            btn6.text = " "
            textView2.setTextColor(Color.BLUE)
            multiplication()
        })
    }
}

