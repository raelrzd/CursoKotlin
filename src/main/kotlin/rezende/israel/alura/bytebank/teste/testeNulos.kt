package rezende.israel.alura.bytebank.teste

import rezende.israel.alura.bytebank.modelo.Endereco
import java.lang.IllegalStateException

fun testeNulos() {
    val enderecoNulo: Endereco? = Endereco(logradouro = "Rua Santana", complemento = "")
    val logradouroNovo: String? = enderecoNulo?.logradouro
    enderecoNulo?.let {
        println(it.logradouro.length)
        val tamanhoComplemento: Int =
            it.complemento?.length ?: throw IllegalStateException("Complemento não pode ser vazio")
        println(tamanhoComplemento)
    }
}