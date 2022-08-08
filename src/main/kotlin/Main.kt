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
    contaRael.deposita(950.0)

    println()
    contaGui.deposita(950.0)

    println()
    contaRael.saca(1000.0)

    println()
    contaGui.saca(2500.0)

    println()
    println("Verificando possibilidade  de transferencia...")
    if (contaRael.transfere(450.0, contaGui)){
        println("Transferencia realizada com sucesso!")
    } else {
        println("Transferencia mal sucedida!")
    }
    

    println()
    println("Saldo atualizado: R$ ${contaRael.saldo}")
    println("Saldo atualizado: R$ ${contaGui.saldo}")

}


class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        println("Depositando na conta de ${titular}")
        saldo += valor
        println("Saldo atualizado: R$${saldo}")
    }

    fun saca(valor: Double){
        println("Valor de saque solicitado: R$$valor\nVerificando possibilidade de saque na conta de $titular...")
        if (saldo >= valor){
            saldo-=valor
            println("Saldo atualizado: $saldo")
        } else {
            println("Não foi possível efetuar o saque!\nSaldo atual: $saldo")
        }
    }

    fun transfere(valor: Double, destino : Conta): Boolean{

        if (valor <= saldo){
            saldo-=valor
            destino.saldo+=valor
            return true
        }
        return false
    }

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