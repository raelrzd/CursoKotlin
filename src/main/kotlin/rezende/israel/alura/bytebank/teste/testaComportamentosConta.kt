import rezende.israel.alura.bytebank.modelo.Cliente
import rezende.israel.alura.bytebank.modelo.ContaCorrente
import rezende.israel.alura.bytebank.modelo.ContaPoupanca
import rezende.israel.alura.bytebank.modelo.Endereco

fun testaComportamentosConta() {
    println()

    val raelrzd = Cliente(
        nome = "Rael RZD",
        cpf = "",
        senha = 3
    )
    val contaRael = ContaCorrente(
        titular = raelrzd,
        numero = 1000
    )
    contaRael.deposita(1000.0)

    val guipapai = Cliente(
        nome = "Gui Paizao",
        cpf = "",
        senha = 1
    )
    val contaGui = ContaPoupanca(
        titular = guipapai,
        numero = 1001
    )
    contaGui.deposita(1500.0)

    val harold = Cliente(
        nome = "Horold",
        cpf = "",
        senha = 12,
        endereco = Endereco(
            logradouro = "Vila SL"
        )
    )
    val contaCorrenteH = ContaCorrente(
        titular = harold,
        numero = 4001
    )
    contaCorrenteH.deposita(2500.0)

    println()
    println("Titular da conta: ${contaRael.titular.nome}")
    println("Numero da conta: ${contaRael.numero}")
    println("Saldo: R$ ${contaRael.saldo}")

    println()

    println("Titular da conta: ${contaGui.titular.nome}")
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

    contaRael.transfere(valor = 200.0, destino = contaGui, senha = 1)



    println()
    println("Saldo atualizado: R$ ${contaRael.saldo}")
    println("Saldo atualizado: R$ ${contaGui.saldo}")
}