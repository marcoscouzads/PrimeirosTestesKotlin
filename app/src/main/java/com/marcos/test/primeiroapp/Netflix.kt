package com.marcos.test.primeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Netflix : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_netflix)
    }
    fun proximaPag(v: View){
        var i1 = Intent(this@Netflix, Aula15::class.java)
        startActivity((i1))
    }

    fun PagAnterior(v: View){
        var i1 = Intent(this@Netflix, App2::class.java)
        startActivity((i1))

    }
}