package com.example.bmi_calc

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button = findViewById(R.id.button)
        val weightTextField: TextView = findViewById(R.id.Weight)
        val heightTextField: TextView = findViewById(R.id.Height)
        val text: TextView = findViewById(R.id.textView);


        fun changeText(result: Float){
            text.setText(result.toString())
        }

        fun calcBMI(height: Float, weight: Float): Float{
            return weight/(height*2);
        }

        button.setOnClickListener{
            val weight = weightTextField.text.toString().toFloat()
            val height = heightTextField.text.toString().toFloat()

            changeText((calcBMI(height, weight)*100))
        }
    }
}