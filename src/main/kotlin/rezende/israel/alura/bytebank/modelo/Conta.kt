package rezende.israel.alura.bytebank.modelo

abstract class Conta(
    var titular: Cliente,
    val numero: Int
) {
    var saldo = 0.0
        protected set

    fun deposita(valor: Double) {
        if (valor > 0) {
            println()
            println("Depositando na conta de ${titular.nome}")
            this.saldo += valor
            println("Saldo atualizado: R$${saldo}")
        }
    }

    abstract fun saca(valor: Double)

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