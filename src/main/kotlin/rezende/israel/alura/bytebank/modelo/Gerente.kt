package rezende.israel.alura.bytebank.modelo

import rezende.israel.alura.bytebank.modelo.FuncionarioAdmin

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    salario = salario,
    senha = senha
) {

    override fun bonificacao(): Double = salario * 0.3

}

