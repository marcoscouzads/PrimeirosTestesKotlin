package com.marcos.test.primeiroapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class RolarDados : AppCompatActivity() {
    lateinit var diceImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rolar_dados)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{rollDice()}

        val countButton: Button = findViewById(R.id.countup_button)
        countButton.setOnClickListener{countUp()}

        diceImage = findViewById(R.id.dice_image)
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Jogue o dado"){
            resultText.text = "1"
        }
        else{
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6 ){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }


    fun proximaPag(v: View){
        var i1 = Intent(this@RolarDados, Aula15::class.java)
        startActivity((i1))
    }

    private fun rollDice(){
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        if (randomInt == 6){
            Toast.makeText(this, "ganhou",Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "jogue novamente",Toast.LENGTH_SHORT).show()
        }

        val drawableResource = when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResource)

    }


}