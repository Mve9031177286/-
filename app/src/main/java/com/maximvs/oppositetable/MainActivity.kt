package com.maximvs.oppositetable

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTable = findViewById<Button>(R.id.btnTable)
        val btnOppTable = findViewById<Button>(R.id.btnOppTable)

        btnOppTable.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, ActivityThreee::class.java)
            startActivity(intent)
        })

        btnTable.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, ActivityTwooo::class.java)
            startActivity(intent)
        })
    }
}