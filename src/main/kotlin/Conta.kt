abstract class Conta(var titular: String, val numero: Int) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            println("Depositando na conta de ${titular}")
            this.saldo += valor
            println("Saldo atualizado: R$${saldo}")
        }
    }

    abstract fun saca(valor: Double) //{
//        println("Valor de saque solicitado: R$$valor\nVerificando possibilidade de saque na conta de $titular...")
//        if (saldo >= valor) {
//            saldo -= valor
//            println("Saldo atualizado: $saldo")
//        } else {
//            println("Não foi possível efetuar o saque!\nSaldo atual: $saldo")
//        }
//    }

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