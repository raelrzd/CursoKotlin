package rezende.israel.alura.bytebank.modelo

import rezende.israel.alura.bytebank.exception.SaldoInsuficienteException
import rezende.israel.alura.bytebank.exception.SenhaIncorretaException

abstract class Conta(
    titular: Cliente,
    numero: Int
) : ContaSemTransf(
    titular = titular,
    numero = numero
) {

    override var saldo = 0.0

    abstract override fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta, senha: Int) {
        println("Verificando possibilidade de transferencia da conta de ${titular.nome} para ${destino.titular.nome}")
        if (valor > saldo) {
            throw SaldoInsuficienteException(mensagem = "Saldo insuficiente!! Saldo atual: $saldo. Valor solicitado para transferencia: $valor")
        } else {
            if (titular.autentica(senha) == true) {
                saldo -= valor
                destino.saldo += valor
                println("Transferencia realizada com sucesso!!")
            } else {
                try {
                    throw SenhaIncorretaException()
                } catch (e: SenhaIncorretaException) {
                    println("Falha na Transferencia!! Senha incorreta.")
                    e.printStackTrace()
                }


            }
        }
    }


// FUNÇÃO TRANSFERE SEM O METODO EXCEPTION, UTILIZADO BOOLEAN
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