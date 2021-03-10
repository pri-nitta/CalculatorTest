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

}