package rezende.israel.alura.bytebank.modelo

import rezende.israel.alura.bytebank.modelo.Autenticavel

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, apos: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Usuario autenticado. Seja bem vindo ao Bytebank!!")
            apos()
        } else {
            println("Falha na autenticação!!")
        }
    }

    fun entraReceiver(admin: Autenticavel, senha: Int, apos: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Usuario autenticado. Seja bem vindo ao Bytebank!!")
            apos(this)
        } else {
            println("Falha na autenticação!!")
        }
    }

    fun pagamento() {
        println("Realizando pagamento")
    }


}