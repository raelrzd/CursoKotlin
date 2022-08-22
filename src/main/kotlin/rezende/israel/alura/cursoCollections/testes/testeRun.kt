package rezende.israel.alura.cursoCollections.testes

import rezende.israel.alura.bytebank.modelo.Cliente
import rezende.israel.alura.bytebank.modelo.ContaPoupanca

fun testeRun() {
    val taxaAnual: Double = 0.05
    val taxaMensal: Double = taxaAnual / 12


    val contaPoupanca = ContaPoupanca(Cliente(nome = "Rael", cpf = "333.333.333.13", 1003), numero = 3000)

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaMensal
    }.let { rendimentoMensal ->
        println("Rendimento mensal: $rendimentoMensal")
    }

    val rendimentoAual = run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaMensal
        }
        saldo
    }
    println("Rendimento anual: $rendimentoAual")
}