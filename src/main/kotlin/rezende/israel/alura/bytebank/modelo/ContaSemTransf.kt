package rezende.israel.alura.bytebank.modelo

//var totalContas = 0
//    private set

abstract class ContaSemTransf(
    var titular: Cliente,
    val numero: Int
) {
    abstract var saldo: Double
        protected set

    companion object {
        var totalContas = 0
            private set
    }

    init {
        println("Criando conta")
        totalContas++
    }

    fun deposita(valor: Double) {
        if (valor > 0) {
            println()
            println("Depositando na conta de ${titular.nome}")
            this.saldo += valor
            println("Saldo atualizado: R$${saldo}")
        }
    }

    abstract fun saca(valor: Double)

}