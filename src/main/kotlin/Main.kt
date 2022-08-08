fun main() {
    println("Bem vindo ao ByteBank")
    println()

    val israel = Funcionario(
        nome = "Israel",
        cpf = "123.456.789-00",
        salario = 1000.00,
        tipo = 1
    )

    println("Funcionário: ${israel.nome}")
    println("CPF: ${israel.cpf}")
    println("Salário: ${israel.salario}")
    println("Bonificação: ${israel.bonificacao()}")


}






