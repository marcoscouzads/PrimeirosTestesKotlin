package com.marcos.test.primeiroapp

import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.V
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.*
import androidx.core.os.bundleOf
import com.google.android.material.snackbar.Snackbar

class Aula15 : AppCompatActivity() {

    lateinit var  nome: EditText
    lateinit var  idade: EditText
    lateinit var  feminino: RadioButton
    lateinit var  masculino: RadioButton
    lateinit var  resultadoNome: TextView
    lateinit var  resultadoIdade: TextView
    lateinit var  resultadoSexo: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aula15)



        nome = findViewById(R.id.editNome)
        idade = findViewById(R.id.editIdade)
        feminino = findViewById(R.id.radioButtonFeminino)
        masculino = findViewById(R.id.radioButtonMasculino)
        resultadoNome = findViewById(R.id.resultadoNome)
        resultadoIdade = findViewById(R.id.resultadoIdade)
        resultadoSexo = findViewById(R.id.resultadoSexo)


        var sexo = findViewById<RadioGroup>(R.id.SexoGroup)

        var btnCadastrar: Button = findViewById(R.id.btn_cadastrar)

        btnCadastrar.setOnClickListener(View.OnClickListener() {
            if (TextUtils.isEmpty(idade.text.toString())) {
                idade.setError("Digite a idade...")

            }
            if (TextUtils.isEmpty(nome.text.toString())) {
                nome.setError("Digite o nome...")
            }
            resultadoNome.text = nome.toString()
            resultadoIdade.text = idade.toString()


            val gen_id = sexo.checkedRadioButtonId


            if (gen_id == -1) {
                Toast.makeText(this@Aula15, "selecione o sexo", Toast.LENGTH_SHORT).show()

            } else {
                val radioBtn = findViewById<RadioButton>(gen_id)
                val genValue = radioBtn.text.toString()
                bundleOf().putString("sexo", genValue)


                resultadoSexo.text = "${genValue}"
            }
        })
    }
    fun proximaPag(v: View){
        var i1 = Intent(this@Aula15, RolarDados::class.java)
        startActivity((i1))
    }
        private fun validaForm(){

        }




}