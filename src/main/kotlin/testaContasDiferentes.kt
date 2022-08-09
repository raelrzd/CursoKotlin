fun testaContasDiferentes() {
    val contaCorrente = ContaCorrente(
        titular = "Rael",
        numero = 2001
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Dan",
        numero = 2002
    )

    contaPoupanca.deposita(valor = 1000.0)
    contaCorrente.deposita(valor = 1000.0)

    println()
    println("Saldo após deposito inicial (Poupança): ${contaPoupanca.saldo}")
    println("Saldo após deposito inicial (Corrente): ${contaCorrente.saldo}")

    println()
    contaPoupanca.saca(valor = 100.0)
    println()
    contaCorrente.saca(valor = 100.0)

    println()
    println("Saldo após saque inicial (Poupança): ${contaPoupanca.saldo}")
    println("Saldo após saque inicial (Corrente): ${contaCorrente.saldo}")

    println()
    contaPoupanca.transfere(valor = 100.0, destino = contaCorrente)

    println()
    println("Saldo após transferencia inicial (Poupança): ${contaPoupanca.saldo}")
    println("Saldo após transferencia inicial (Corrente): ${contaCorrente.saldo}")
}