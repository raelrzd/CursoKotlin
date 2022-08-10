class ContaPoupanca(
    titular: String,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
)  {
    override fun saca(valor: Double) {
        println("Valor de saque solicitado: R$$valor\nVerificando possibilidade de saque na conta de $titular...")
        if (saldo >= valor) {
            saldo -= valor
            println("Saque efetuado!! Saldo atualizado: $saldo")
        } else {
            println("Não foi possível efetuar o saque!\nSaldo atual: $saldo")
        }
    }

}