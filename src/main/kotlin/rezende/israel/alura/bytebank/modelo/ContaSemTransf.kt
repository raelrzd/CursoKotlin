package rezende.israel.alura.bytebank.modelo

abstract class ContaSemTransf(
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

    fun saca(valor: Double) {
        println("Valor de saque solicitado: R$$valor\nVerificando possibilidade de saque na conta de ${titular.nome}...")
        if (saldo >= valor) {
            saldo -= valor
            println("Saldo atualizado: $saldo")
        } else {
            println("Não foi possível efetuar o saque!\nSaldo atual: $saldo")
        }
    }

}