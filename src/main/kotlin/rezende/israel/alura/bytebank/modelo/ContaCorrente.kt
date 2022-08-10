package rezende.israel.alura.bytebank.modelo

import rezende.israel.alura.bytebank.modelo.Conta

class ContaCorrente(
    titular: Cliente,
    numero: Int
) : Conta(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        println("Valor de saque solicitado: R$$valor\nVerificando possibilidade de saque + cobrança de taxa na conta de ${titular.nome}...")
        val valorComTaxa = valor + 0.1
        if (saldo >= valorComTaxa) {
            saldo -= valorComTaxa
            println("Saque efetuado!! Saldo atualizado: $saldo")
        } else {
            println("Não foi possível efetuar o saque!\nSaldo atual: $saldo")
        }
    }


}