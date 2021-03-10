package com.ctt.calculatortest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularSoma(a:Int?, b:Int?): String {
        var resultado = ""
        resultado = if (a == null || b == null){
            "Insira um número!"
        } else{
            "O resultado é "+(a+b)
        }
        return resultado
    }
}