package rezende.israel.alura.cursoCollections.testes

import rezende.israel.alura.bytebank.modelo.Endereco

fun testeLet() {
    Endereco(logradouro = "rua santana", numero = 333).run {
        "$logradouro, $numero".uppercase()
    }.let{enderecoMaisculo: String ->
        println(enderecoMaisculo)
    }

    listOf(
        Endereco(logradouro = "Rua Santana", numero = 333, complemento = "casa"),
        Endereco(logradouro = "Av presidente vargas", numero = 444)
    ).filter { endereco ->
        endereco.complemento.isNotEmpty()
    }.let(::println)
}