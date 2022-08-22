package rezende.israel.alura.cursoCollections.testes

import rezende.israel.alura.bytebank.modelo.Endereco

fun testaFuncoesEscopo() {
    val endereco1 = Endereco(logradouro = "rua vergueiro", numero = 3185)
    val enderecoEmMaiusculo = "${endereco1.logradouro}, ${endereco1.numero}".uppercase()
    println(enderecoEmMaiusculo)

    run {
        println("execução do run sem extensão")
    }

    val endereco = Endereco()
        .also { println("Criando endereço") }
        .apply {
            logradouro = "rua vergueiro"
            numero = 3185
        }

    with(endereco) {
        "$logradouro, $numero".toUpperCase()
    }.let { enderecoEmMaiusculo: String ->
        println(enderecoEmMaiusculo)
    }

    listOf(
        Endereco(complemento = "casa"),
        Endereco(),
        Endereco(complemento = "apartamento")
    )
        .filter(predicate = { endereco -> endereco.complemento.isNotEmpty() })
        .let(block = (::println))
}

// coletado do commit do curso