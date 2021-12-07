package com.marcos.test.primeiroapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class App2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app2)
    }

    fun proximaPag(v: View){
        var i1 = Intent(this@App2, Netflix::class.java)
        startActivity((i1))
    }

    fun PagAnterior(v: View){
        var i1 = Intent(this@App2, MainActivity::class.java)
        startActivity((i1))

    }
}