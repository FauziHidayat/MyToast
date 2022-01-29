package com.projectku.mytoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvName = findViewById<TextView>(R.id.tv_name)
        val inputName = findViewById<EditText>(R.id.et_name)
        val btnSubmit = findViewById<Button>(R.id.btn_submit)
        val btnOffers = findViewById<Button>(R.id.btn_offers)

        btnSubmit.setOnClickListener {
            val enteredName = inputName.text.toString() //inputName jadi text
            if (enteredName == ""){ // jika enteredName kosong maka akan tampilkan Toast
                btnOffers.visibility = INVISIBLE
                tvName.text = ""
                Toast.makeText(this@MainActivity, "Please, enter your name",Toast.LENGTH_SHORT).show()
            } else {
                val message = "Welcome $enteredName"
                tvName.text = message
                inputName.text.clear()
                btnOffers.visibility = VISIBLE
            }
        }

    }
}