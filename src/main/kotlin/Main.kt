fun main() {
    println("Bem vindo ao ByteBank")
    println()

    val contaRael = Conta()
    contaRael.titular = "Rael RZD"
    contaRael.numero = 1000
    contaRael.saldo = 1000.0

    val contaGui = Conta()
    contaGui.titular = "Gui Paizao"
    contaGui.numero = 1001
    contaGui.saldo = 1500.0

    println("Titular da conta: ${contaRael.titular}")
    println("Numero da conta: ${contaRael.numero}")
    println("Saldo: R$ ${contaRael.saldo}")

    println()

    println("Titular da conta: ${contaGui.titular}")
    println("Numero da conta: ${contaGui.numero}")
    println("Saldo: R$ ${contaGui.saldo}")

    println()
//    println("Depositando na conta do Rael")
    deposita(contaRael, 950.0)
//    println("Saldo atualizado: R$${contaRael.saldo}")

    println()
//    println("Depositando na conta do Gui")
    deposita(contaGui, 950.0)
//    println("Saldo atualizado: R$${contaGui.saldo}")

}


fun deposita(conta: Conta, valor: Double) {
    println("Depositando na conta de ${conta.titular}")
    conta.saldo += valor
    println("Saldo atualizado: R$${conta.saldo}")

}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}


fun testaLacos() {
    var i = 1

    while (i <= 5) {

        val titular: String = "Israel $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 10.0 + i

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
        i++
    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("O saldo da conta é positivo")
    } else if (saldo == 0.0) {
        println("O saldo da conta é neutro")
    } else {
        println("O saldo da conta é negativo")
    }
}