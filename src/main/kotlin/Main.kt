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

    println(contaRael.titular)
    println(contaRael.numero)
    println(contaRael.saldo)

    println()

    println(contaGui.titular)
    println(contaGui.numero)
    println(contaGui.saldo)

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