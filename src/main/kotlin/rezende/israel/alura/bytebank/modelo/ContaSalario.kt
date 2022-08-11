package rezende.israel.alura.bytebank.modelo

class ContaSalario(
    titular: Cliente,
    numero: Int
) : ContaSemTransf(
    titular = titular,
    numero = numero
) {
    override var saldo: Double = 0.0
    override fun saca(valor: Double) {
        println("Valor de saque solicitado: R$$valor\nVerificando possibilidade de saque na conta de ${titular.nome}...")
        if (saldo >= valor) {
            saldo -= valor
            println("Saldo atualizado: $saldo")
        } else {
            println("Não foi possível efetuar o saque!\nSaldo atual: $saldo")
        }
    }
}