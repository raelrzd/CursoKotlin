fun testaFuncionarios() {
    val israel = Funcionario(
        nome = "Israel",
        cpf = "123.456.789-00",
        salario = 1000.00,
    )

    val teteu = Gerente(
        nome = "Teteu",
        cpf = "111.222.333.44",
        salario = 2000.00,
        senha = 1234
    )

    val lopes = Diretor(
        nome = "Lopes",
        cpf = "321.654.987-00",
        salario = 4000.00,
        senha = 4000,
        plr = 200.00
    )

    val gui = Analista(
        nome = "Gui",
        cpf = "777.777.777-89",
        salario = 2500.00
    )

    // impressão Funcionário (Israel)
    println("Funcionário: ${israel.nome}")
    println("CPF: ${israel.cpf}")
    println("Salário: ${israel.salario}")
    println("Bonificação: ${israel.bonificacao()}")

    println()

    // impressão Gerente (teteu)
    println("Gerente: ${teteu.nome}")
    println("CPF: ${teteu.cpf}")
    println("Salário: ${teteu.salario}")
    println("Bonificação: ${teteu.bonificacao()}")

    if (teteu.autentica(senha = 1234)) {
        println("Autenticação realizada com sucesso!")
    } else {
        println("A autenticação falhou!")
    }

    // impressão Diretor (Lopes)
    println()
    println("Diretor: ${lopes.nome}")
    println("CPF: ${lopes.cpf}")
    println("Salário: ${lopes.salario}")
    println("Bonificação: ${lopes.bonificacao()}")
    println("Participação de lucro: ${lopes.plr}")

    if (lopes.autentica(senha = 4000)) {
        println("Autenticação realizada com sucesso!")
    } else {
        println("A autenticação falhou!")
    }

    // impressão Analista (Gui)
    println()
    println("Analista: ${gui.nome}")
    println("CPF: ${gui.cpf}")
    println("Salário: ${gui.salario}")
    println("Bonificação: ${gui.bonificacao()}")


    val calculadora = CalculadoraBonificacao()
    calculadora.registra(israel)
    calculadora.registra(teteu)
    calculadora.registra(lopes)
    calculadora.registra(gui)
    println()
    println("Total de bonificação: ${calculadora.total}")
}