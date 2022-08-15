import rezende.israel.alura.bytebank.exception.SaldoInsuficienteException
import rezende.israel.alura.bytebank.exception.SenhaIncorretaException
import rezende.israel.alura.bytebank.modelo.*

fun testaContasDiferentes() {

    val dan = Cliente(
        nome = "Dan",
        cpf = "",
        senha = 1,
        endereco = Endereco(
            logradouro = "Travessa C"
        )
    )
    val contaPoupanca = ContaPoupanca(
        titular = dan,
        numero = 2002
    )

    val rael = Cliente(
        nome = "Rael",
        cpf = "",
        senha = 2,
        endereco = Endereco(
            logradouro = "Rua Santana"
        )
    )
    val contaCorrente = ContaCorrente(
        titular = rael,
        numero = 2001
    )

    val denim = Cliente(
        nome = "Denim",
        cpf = "",
        senha = 3,
        endereco = Endereco(
            logradouro = "Rua do Nely"
        )
    )
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
    try {
        contaPoupanca.transfere(valor = 100.0, destino = contaCorrente, senha = 1)
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
    }
    catch (e: SenhaIncorretaException) {
        e.printStackTrace()
    }
    catch (e: Exception){
        println("Falha!! Erro desconhecido.")
        e.printStackTrace()
    }


    println()
    println("Saldo após transferencia inicial (Poupança): ${contaPoupanca.saldo}")
    println("Saldo após transferencia inicial (Corrente): ${contaCorrente.saldo}")

    println()
    contaSalario.saca(valor = 100.0)
    println("Saldo após saque inicial (Salario): ${contaSalario.saldo}")


}