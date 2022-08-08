fun main() {
    println("Bem vindo ao ByteBank")
    println()

    val contaRael = Conta(titular = "Rael RZD", numero = 1000)
    contaRael.deposita(1000.0)

    val contaGui = Conta(titular = "Gui Paizao", numero = 1001)
    contaGui.deposita(1500.0)

    println("Titular da conta: ${contaRael.titular}")
    println("Numero da conta: ${contaRael.numero}")
    println("Saldo: R$ ${contaRael.saldo}")

    println()

    println("Titular da conta: ${contaGui.titular}")
    println("Numero da conta: ${contaGui.numero}")
    println("Saldo: R$ ${contaGui.saldo}")

    println()
    contaRael.deposita(valor = 950.0)

    println()
    contaGui.deposita(valor = 950.0)

    println()
    contaRael.saca(valor = 1000.0)

    println()
    contaGui.saca(valor = 2500.0)

    println()
    println("Verificando possibilidade  de transferencia...")
    if (contaRael.transfere(valor = 450.0, destino = contaGui)) {
        println("Transferencia realizada com sucesso!")
    } else {
        println("Transferencia mal sucedida!")
    }


    println()
    println("Saldo atualizado: R$ ${contaRael.saldo}")
    println("Saldo atualizado: R$ ${contaGui.saldo}")

}


class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            println("Depositando na conta de ${titular}")
            this.saldo += valor
            println("Saldo atualizado: R$${saldo}")
        }
    }

    fun saca(valor: Double) {
        println("Valor de saque solicitado: R$$valor\nVerificando possibilidade de saque na conta de $titular...")
        if (saldo >= valor) {
            saldo -= valor
            println("Saldo atualizado: $saldo")
        } else {
            println("Não foi possível efetuar o saque!\nSaldo atual: $saldo")
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {

        if (valor <= saldo) {
            saldo -= valor
            destino.saldo += valor
            return true
        }
        return false
    }

//    fun getSaldo(): Double {
//        return saldo
//    }
//
//    fun setSaldo(valor: Double) {
//        if (valor > 0) {
//            saldo = valor
//        }
//    }

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