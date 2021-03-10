package com.ctt.calculatortest

import junit.framework.Assert.assertEquals
import org.junit.Test

class MainActivityTest {

    @Test
    fun somaTeste(){
        fun somarDoisNumerosComSucesso(){
            val primeiroNumSucesso = 10
            val segundoNumSucesso = 5

            val resultadoFuncao = MainActivity().calcularSoma(primeiroNumSucesso, segundoNumSucesso)
            val resultadoEsperado = "O resultado é 15"

            assertEquals(resultadoEsperado, resultadoFuncao)
        }
    }

    @Test
    fun somarDoisNumerosNulos(){
        val primeiroNumNull = null
        val segundoNumNull = null

        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumNull, segundoNumNull)
        val resultadoEsperado = "Insira um número!"
    }

    @Test
    fun somarPrimeiroNumeroNulo(){
        val primeiroNumNull = null
        val segundoNum = 5

        val resultadoFuncao = MainActivity().calcularSoma(primeiroNumNull, segundoNum)
        val resultadoEsperado = "Insira um número!"
    }

    @Test
    fun somarSegundoNumeroNulo(){
        val primeiroNum = 10
        val segundoNumNull = null

        val resultadoFuncao = MainActivity().calcularSoma(primeiroNum, segundoNumNull)
        val resultadoEsperado = "Insira um número!"
    }

}