package com.ctt.calculatortest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularSoma(a:Int, b:Int):String{
        var resultado = a+b
        return "O resultado é $resultado"
    }
}