package rezende.israel.alura.cursoCollections.testes

import rezende.israel.alura.bytebank.modelo.Endereco

fun testeWith() {
//IMPRESSÃO COMPLETA ENDEREÇO USANDO METODO WITH
    with(Endereco()) {
        logradouro = "Rua Santana"
        numero = 209
        bairro = "Labienópolis"
        cidade = "Garça"
        estado = "SP"
        cep = 17404252
        complemento = "Casa"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }
}