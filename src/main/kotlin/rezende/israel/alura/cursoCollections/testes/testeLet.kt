package rezende.israel.alura.cursoCollections.testes

import rezende.israel.alura.bytebank.modelo.Endereco

fun testeLet() {
    Endereco(logradouro = "rua santana", numero = 333).let { endereco ->
        val enderecoMaisculo: String = "${endereco.logradouro}, ${endereco.numero}".uppercase()
        println(enderecoMaisculo)
    }

    listOf(
        Endereco(logradouro = "Rua Santana", numero = 333, complemento = "casa"),
        Endereco(logradouro = "Av presidente vargas", numero = 444)
    ).filter { endereco ->
        endereco.complemento.isNotEmpty()
    }.let(::println)
}