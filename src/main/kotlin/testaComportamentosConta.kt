fun testaComportamentosConta() {
    println()

    val contaRael = ContaCorrente(titular = "Rael RZD", numero = 1000)
    contaRael.deposita(1000.0)

    val contaGui = ContaPoupanca(titular = "Gui Paizao", numero = 1001)
    contaGui.deposita(1500.0)

    println()
    println("Titular da conta: ${contaRael.titular}")
    println("Numero da conta: ${contaRael.numero}")
    println("Saldo: R$ ${contaRael.saldo}")

    println()

    println("Titular da conta: ${contaGui.titular}")
    println("Numero da conta: ${contaGui.numero}")
    println("Saldo: R$ ${contaGui.saldo}")

    println()
    contaRael.deposita(valor = 950.0)

    println()
    contaGui.deposita(valor = 950.0)

    println()
    contaRael.saca(valor = 1000.0)

    println()
    contaGui.saca(valor = 2500.0)

    println()
    println("Verificando possibilidade  de transferencia...")
    if (contaRael.transfere(valor = 450.0, destino = contaGui)) {
        println("Transferencia realizada com sucesso!")
    } else {
        println("Transferencia mal sucedida!")
    }


    println()
    println("Saldo atualizado: R$ ${contaRael.saldo}")
    println("Saldo atualizado: R$ ${contaGui.saldo}")
}