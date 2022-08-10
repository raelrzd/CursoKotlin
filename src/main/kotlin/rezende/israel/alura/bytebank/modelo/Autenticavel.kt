package rezende.israel.alura.bytebank.modelo

interface Autenticavel {
    fun autentica(senha: Int): Boolean
}