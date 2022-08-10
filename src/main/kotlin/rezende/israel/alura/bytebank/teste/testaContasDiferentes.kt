import rezende.israel.alura.bytebank.modelo.Cliente
import rezende.israel.alura.bytebank.modelo.ContaCorrente
import rezende.israel.alura.bytebank.modelo.ContaPoupanca
import rezende.israel.alura.bytebank.modelo.ContaSalario

fun testaContasDiferentes() {

    val dan = Cliente(nome = "Dan", cpf = "", senha = 1)
    val contaPoupanca = ContaPoupanca(
        titular = dan,
        numero = 2002
    )

    val rael = Cliente(nome = "Rael", cpf = "", senha = 2)
    val contaCorrente = ContaCorrente(
        titular = rael,
        numero = 2001
    )

    val denim = Cliente(nome = "Denim", cpf = "", senha = 3)
    val contaSalario = ContaSalario(
        titular = denim,
        numero = 2003
    )

    contaPoupanca.deposita(valor = 1000.0)
    contaCorrente.deposita(valor = 1000.0)
    contaSalario.deposita(valor = 1000.0)
    println()
    println("Saldo após deposito inicial (Poupança): ${contaPoupanca.saldo}")
    println("Saldo após deposito inicial (Corrente): ${contaCorrente.saldo}")
    println("Saldo após deposito inicial (Salario): ${contaSalario.saldo}")

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

    println()
    contaSalario.saca(valor = 100.0)
    println("Saldo após saque inicial (Salario): ${contaSalario.saldo}")




}