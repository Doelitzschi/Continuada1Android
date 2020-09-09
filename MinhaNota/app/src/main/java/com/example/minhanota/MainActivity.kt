package com.example.minhanota

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    var isValid = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun media(componente:View) {
        var campoNota1 = nota1.text.toString()
        var campoNota2 = nota2.text.toString()

        if (nome.length() > 10){
            Toast.makeText(this, "Nome não pode ter mais" +
                    " que 10 caracteres.", Toast.LENGTH_SHORT).show()
            isValid = false
        }

        if(campoNota1.isNullOrEmpty()) {
            Toast.makeText(this, "A primeira nota não pode" +
                    " ser menor que 0", Toast.LENGTH_SHORT).show()
            isValid = false
        }

        if(campoNota2.isNullOrEmpty()) {
            Toast.makeText(this, "A segunda nota não pode" +
                    " ser menor que 0", Toast.LENGTH_SHORT).show()
            isValid = false
        }

        try {
            if ((campoNota1.toDouble() + campoNota2.toDouble())/2 >= 6){
                frase3.setTextColor(Color.GREEN)
                frase3.text = "Aprovado"}
            else{
                frase3.setTextColor(Color.RED)
                frase3.text = "Reprovado"}
            }

        catch (ex:Exception){
        }

    }

}