package com.santander.dio.imc

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var click : Int = 0
        calcularBTN?.setOnClickListener {
            if(click == 0){
                calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
                headTXV.isVisible = true
                headTXV.setBackgroundColor(Color.LTGRAY)
                pesoEDT.isVisible = false
                alturaEDT.isVisible = false
                calcularBTN.setText("Novo cálculo")
                click = 1
            } else {
                headTXV.isVisible = false
                headTXV.setBackgroundColor(Color.WHITE)
                pesoEDT.isVisible = true
                alturaEDT.isVisible = true
                calcularBTN.setText("Calcular")
                click = 0

            }

        }
    }

    private fun setListeners(){
        alturaEDT?.doAfterTextChanged { text ->
            Toast.makeText(this, text.toString(), Toast.LENGTH_SHORT).show()
        }

        pesoEDT?.doOnTextChanged{ text, _, _, _ ->
            headTXV.text = text
        }
    }

    private fun calcularIMC(peso: String, altura: String){
        val peso = peso.toFloatOrNull()
        val altura = altura.toFloatOrNull()
        var classificacao : String = ""

        if(peso != null && altura != null){
            val imc = peso / (altura * altura)
            when(imc) {
                in 1.0 .. 18.4 -> classificacao = "Magreza"
                in 18.5 .. 24.9 -> classificacao = "Saudável"
                in 25.0 .. 29.9 -> classificacao = "Sobrepeso"
                in 30.0 .. 34.9 -> classificacao = "Obessidade Grau I"
                in 35.0 .. 39.9 -> classificacao = "Obesidade Severa Grau II"
                in 40.0 .. 100.0 -> classificacao = "Obesidade Mórbida Grau III"
            }

            when(classificacao){
                "Magreza" -> headTXV.setTextColor(Color.CYAN)
                "Saudável" -> headTXV.setTextColor(Color.GREEN)
                "Sobrepeso" -> headTXV.setTextColor(Color.rgb(255,160,122))
                "Obessidade Grau I" -> headTXV.setTextColor(Color.YELLOW)
                "Obesidade Severa Grau II" -> headTXV.setTextColor(Color.RED)
                "Obesidade Mórbida Grau III" -> headTXV.setTextColor(Color.rgb(153,50,204))
            }

            headTXV.text = ("Seu IMC é: " + "%.2f".format(imc) + " ( $classificacao )")
        }
    }
}