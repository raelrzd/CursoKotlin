fun main() {
    println("Bem vindo ao ByteBank")
    println()

    val dener = Gerente(
        nome = "Dener",
        cpf = "987.765.432-11",
        salario = 3500.0,
        senha = 4321
    )

    val edu = Diretor(
        nome = "Edu",
        cpf = "321.654.987-00",
        salario = 5500.0,
        senha = 1111,
        plr = 400.0
    )

    val sistema = SistemaInterno()
    sistema.entra(edu, senha = 1111)

}











