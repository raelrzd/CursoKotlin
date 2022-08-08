fun main() {
    println("Bem vindo ao ByteBank")
    println()

    val israel = Funcionario(
        nome = "Israel",
        cpf = "123.456.789-00",
        salario = 1000.00,
    )

    val teteu = Gerente(
        nome = "Teteu", cpf = "111.222.333.44", salario = 2000.00, senha = 1234
    )

    println("Funcionário: ${israel.nome}")
    println("CPF: ${israel.cpf}")
    println("Salário: ${israel.salario}")
    println("Bonificação: ${israel.bonificacao()}")

    println()

    println("Funcionário: ${teteu.nome}")
    println("CPF: ${teteu.cpf}")
    println("Salário: ${teteu.salario}")
    println("Bonificação: ${teteu.bonificacao()}")

    if (teteu.autentica(senha = 1234)) {
        println("Autenticação realizada com sucesso!")
    } else {
        println("A autenticação falhou!")
    }


}






