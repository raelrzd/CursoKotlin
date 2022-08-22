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

    fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
        println("Prestes a executar a soma")
        val total: Int = a + b
        total.resultado()
        println("Soma executada")
    }

    somaReceiver(3, 5, resultado = (::println))


    val testeAutentica = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int): Boolean = this.senha == senha
    }

    val sistema = SistemaInterno()

    println()

    sistema.entra(testeAutentica, senha = 1234, apos = {
        println("Realizar operação bancaria")
    })

    println()

    sistema.entraReceiver(testeAutentica, 1234, apos = {
        pagamento()
    })

}