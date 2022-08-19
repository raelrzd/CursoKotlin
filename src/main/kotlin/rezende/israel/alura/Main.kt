import rezende.israel.alura.bytebank.modelo.Endereco
import java.util.*
import kotlin.math.E
import kotlin.math.log

fun main() {


    Endereco(logradouro = "rua santana", numero = 333).let { endereco ->
        val enderecoMaisculo: String = "${endereco.logradouro}, ${endereco.numero}".uppercase()
        println(enderecoMaisculo)
    }

    listOf(
        Endereco(logradouro = "Rua Santana", numero = 333, complemento = "casa"),
        Endereco(logradouro = "Av presidente vargas", numero = 444)).filter { endereco ->
        endereco.complemento.isNotEmpty()
    }.let ( ::println)

    

//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".uppercase(Locale.getDefault())
//    println(enderecoEmMaiusculo)

}
