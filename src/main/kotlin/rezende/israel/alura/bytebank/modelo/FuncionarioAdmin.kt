package rezende.israel.alura.bytebank.modelo

import rezende.israel.alura.bytebank.modelo.Autenticavel
import rezende.israel.alura.bytebank.modelo.Funcionario

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}