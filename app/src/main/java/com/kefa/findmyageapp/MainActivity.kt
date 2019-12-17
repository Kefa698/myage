package com.kefa.findmyageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buFindAge.setOnClickListener {
            //            fire when btn is clicked
            val yearOfBirth: Int = txtYearofBirth.text.toString().toInt()
            if (yearOfBirth == 0.toInt()) {
                txtShowAge.text = "invalid input"
                return@setOnClickListener
            }
            val myAge = 2019 - yearOfBirth.toInt()
            if (myAge < 0.toInt()) {
                txtShowAge.text = "your age cant be zero"
                return@setOnClickListener
            }
            val avg = myAge / yearOfBirth.toInt()
            val currentYear = Calendar.getInstance().get(Calendar.YEAR)
            txtShowAge.text = "my age is $myAge years"
        }
    }
}
