class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Usuario autenticado. Seja bem vindo ao Bytebank!!")
        } else {
            println("Falha na autenticação!!")
        }
    }

}