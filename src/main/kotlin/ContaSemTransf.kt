abstract class ContaSemTransf(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        protected set

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

}