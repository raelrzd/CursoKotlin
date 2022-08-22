package rezende.israel.alura.cursoCollections.testes

import rezende.israel.alura.bytebank.modelo.Autenticavel
import rezende.israel.alura.bytebank.modelo.SistemaInterno

fun testaAutenticaVarFuncional() {

    fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
        println("Prestes a executar a soma")
        resultado(a + b)
        println("Soma executada")
    }

    soma(3, 5, resultado = (::println))

    val testeAutentica = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    SistemaInterno().entra(testeAutentica, senha = 1234, apos = {
        println("Realizar operação bancaria")
    })
}