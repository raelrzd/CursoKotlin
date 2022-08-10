package rezende.israel.alura.bytebank.modelo

import rezende.israel.alura.bytebank.modelo.Autenticavel

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}