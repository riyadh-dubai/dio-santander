package com.santander.dio.calcnotas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcular :Button = btCalcular
        val resultado :TextView = tvResultado

        calcular.setOnClickListener {

            val n1 :Int = Integer.parseInt(edNota01.text.toString())
            val n2 :Int = Integer.parseInt(edNota02.text.toString())
            val faltas :Int = Integer.parseInt(edFaltas.text.toString())

            val media = (n1+n2)/2

            if(media >= 6 && faltas <= 10){

                resultado.setText("A média é $media, O número de faltas é $faltas, logo o aluno foi APROVADO")
                resultado.setTextColor(Color.GREEN)

            } else {

                resultado.setText("A média é $media, O número de faltas é $faltas, logo o aluno foi REPROVADO")
                resultado.setTextColor(Color.RED)
            }


        }


    }

}