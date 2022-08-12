package rezende.israel.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val senha: Int,
    var endereco: Endereco = Endereco()
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }

}