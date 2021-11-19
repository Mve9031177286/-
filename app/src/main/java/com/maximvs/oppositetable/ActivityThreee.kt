package com.maximvs.oppositetable

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ActivityThreee : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_threee)

        var tvr = findViewById<TextView>(R.id.tv_ringg)

        var btn31 = findViewById<Button>(R.id.btn31)
        var btn32 = findViewById<Button>(R.id.btn32)
        var btn33 = findViewById<Button>(R.id.btn33)
        var btn34 = findViewById<Button>(R.id.btn34)
        var btn35 = findViewById<Button>(R.id.btn35)
        var btn36 = findViewById<Button>(R.id.btn36)

        val btnHome = findViewById<Button>(R.id.btn38)
        val btnEnt = findViewById<Button>(R.id.btn37)

        val btnlist = listOf(btn31, btn32, btn33, btn34, btn35, btn36)

        fun multiplication() {

            btn31.setTextColor(Color.WHITE)
            btn32.setTextColor(Color.WHITE)
            btn33.setTextColor(Color.WHITE)
            btn34.setTextColor(Color.WHITE)
            btn35.setTextColor(Color.WHITE)
            btn36.setTextColor(Color.WHITE)

            var num = mutableListOf(2, 3, 4, 5, 6, 7, 8, 9)

            val rand1 = num.random()
            val rand2 = num.random()
            tvr.text = "${rand1*rand2}"
            val randBtn = btnlist.random()
            randBtn.text = "$rand1*$rand2"
            num.remove(rand1)

            var rand41 = 0
            var rand42 = 0
            var rand43 = 0
            var rand44 = 0
            var rand45 = 0
            var rand46 = 0
            var rand47 = 0
            var rand48 = 0
            var rand49 = 0
            var rand50 = 0
            var rand51 = 0
            var rand52 = 0

            if (btn31 != randBtn) {
                rand41 = num.random()
                rand42 = num.random()
                btn31.text = "$rand41*$rand42"
                num.remove(rand41)
            }
            if (btn32 != randBtn) {
                rand43 = num.random()
                rand44 = num.random()
                btn32.text = "$rand43*$rand44"
                num.remove(rand43)
            }
            if (btn33 != randBtn) {
                rand45 = num.random()
                rand46 = num.random()
                btn33.text = "$rand45*$rand46"
                num.remove(rand45)
            }
            if (btn34 != randBtn) {
                rand47 = num.random()
                rand48 = num.random()
                btn34.text = "$rand47*$rand48"
                num.remove(rand47)
            }
            if (btn35 != randBtn) {
                rand49 = num.random()
                rand50 = num.random()
                btn35.text = "$rand49*$rand50"
                num.remove(rand49)
            }
            if (btn36 != randBtn) {
                rand51 = num.random()
                rand52 = num.random()
                btn36.text = "$rand51*$rand52"
            }

            btn31.setOnClickListener {
                if (btn31 == randBtn || rand41*rand42 == rand1*rand2) {
                    btn31.setTextColor(Color.GREEN)
                    tvr.setTextColor(Color.GREEN)
                } else {
                    btn31.setTextColor(Color.RED)
                    tvr.setTextColor(Color.RED)
                }
            }
            btn32.setOnClickListener {
                if (btn32 == randBtn || rand43*rand44 == rand1*rand2) {
                    btn32.setTextColor(Color.GREEN)
                    tvr.setTextColor(Color.GREEN)
                } else {
                    btn32.setTextColor(Color.RED)
                    tvr.setTextColor(Color.RED)
                }
            }
            btn33.setOnClickListener {
                if (btn33 == randBtn || rand45*rand46 == rand1*rand2) {
                    btn33.setTextColor(Color.GREEN)
                    tvr.setTextColor(Color.GREEN)
                } else {
                    btn33.setTextColor(Color.RED)
                    tvr.setTextColor(Color.RED)
                }
            }
            btn34.setOnClickListener {
                if (btn34 == randBtn || rand47*rand48 == rand1*rand2) {
                    btn34.setTextColor(Color.GREEN)
                    tvr.setTextColor(Color.GREEN)
                } else {
                    btn34.setTextColor(Color.RED)
                    tvr.setTextColor(Color.RED)
                }
            }
            btn35.setOnClickListener {
                if (btn35 == randBtn || rand49*rand50 == rand1*rand2) {
                    btn35.setTextColor(Color.GREEN)
                    tvr.setTextColor(Color.GREEN)
                } else {
                    btn35.setTextColor(Color.RED)
                    tvr.setTextColor(Color.RED)
                }
            }
            btn36.setOnClickListener {
                if (btn36 == randBtn || rand51*rand52 == rand1*rand2) {
                    btn36.setTextColor(Color.GREEN)
                    tvr.setTextColor(Color.GREEN)
                } else {
                    btn36.setTextColor(Color.RED)
                    tvr.setTextColor(Color.RED)
                }
            }
        }

        multiplication()

        btnHome.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@ActivityThreee, MainActivity::class.java)
            startActivity(intent)
        })

        btnEnt.setOnClickListener(View.OnClickListener {
            btn31.text = " "
            btn32.text = " "
            btn33.text = " "
            btn34.text = " "
            btn35.text = " "
            btn36.text = " "
            tvr.setTextColor(Color.BLUE)
            multiplication()
        })

    }
}





