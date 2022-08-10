import rezende.israel.alura.bytebank.modelo.Cliente
import rezende.israel.alura.bytebank.modelo.Diretor
import rezende.israel.alura.bytebank.modelo.Gerente
import rezende.israel.alura.bytebank.modelo.SistemaInterno

fun testeAutenticacao() {
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

    val cliente = Cliente(
        nome = "yokota",
        cpf = "555.555.555-55",
        senha = 7777
    )

    val sistema = SistemaInterno()
    sistema.entra(dener, senha = 4321)
    sistema.entra(edu, senha = 1111)
    sistema.entra(cliente, senha = 7777)
}