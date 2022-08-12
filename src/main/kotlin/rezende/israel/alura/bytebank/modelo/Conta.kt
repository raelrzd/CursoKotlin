package rezende.israel.alura.bytebank.modelo

import rezende.israel.alura.bytebank.exception.SaldoInsuficienteException

abstract class Conta(
    titular: Cliente,
    numero: Int
) : ContaSemTransf(
    titular = titular,
    numero = numero
) {

    override var saldo = 0.0

    abstract override fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta) {
        println("Verificando possibilidade de transferencia da conta de ${titular.nome} para ${destino.titular.nome}")
        if (valor > saldo) {
            throw SaldoInsuficienteException()
        } else {
            saldo -= valor
            destino.saldo += valor
            println("Transferencia realizada com sucesso!!")
        }
    }

//    fun transfere(valor: Double, destino: Conta): Boolean {
//        println("Verificando possibilidade de transferencia da conta de ${titular.nome} para ${destino.titular.nome}")
//        if (valor <= saldo) {
//            saldo -= valor
//            destino.saldo += valor
//            println("Transferencia realizada com sucesso!!")
//            return true
//        }
//        println("Não foi possível realizar a transferencia!!")
//        return false
//    }

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