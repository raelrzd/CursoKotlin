class SistemaInterno {

    fun entra(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autentica(senha)) {
            println("Usuario autenticado. Seja bem vindo ao Bytebank!!")
        } else {
            println("Falha na autenticação!!")
        }
    }

}