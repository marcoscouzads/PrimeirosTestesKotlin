package com.marcos.test.primeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun alterarTexto(v: View){

        val randomInt = (0..10).random()

        var texto: TextView = findViewById(R.id.textoExibicao)

        texto.text = "Numero selecionado foi: ${randomInt.toString()}"

    }

    fun proximaPag(v: View){
        var i1 = Intent(this@MainActivity, App2::class.java)
        startActivity((i1))
    }
}