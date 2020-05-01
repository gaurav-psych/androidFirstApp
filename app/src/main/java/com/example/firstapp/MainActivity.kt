package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_but)
        rollButton.setOnClickListener { rollDice() }
        val countButton: Button = findViewById(R.id.count)
        countButton.setOnClickListener { countButtonHandle() }
    }

    fun randomNums():Int = (0 .. 10).random()

    private fun rollDice() {
        val textnew:TextView = findViewById(R.id.text1)
        Toast.makeText(this, "great",
            Toast.LENGTH_SHORT).show()

        when(count){
            0 -> textnew.text = "waahji waah"
            1 -> textnew.text = "dubaara"
            else -> textnew.text = randomNums().toString()
        }
        count++


    }


    private fun countButtonHandle(){
        val textnew:TextView = findViewById(R.id.text1)
        if (count>1){
           var cText = textnew.text.toString().toInt()
            cText++
            textnew.text = cText.toString()
        }
    }


}
