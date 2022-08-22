import rezende.israel.alura.bytebank.modelo.Endereco
import rezende.israel.alura.cursoCollections.testes.testaAutenticaVarFuncional
import java.security.cert.CertPath

fun main() {

    with(Endereco()){
        logradouro = "Rua Santana"
        numero = 209
        bairro = "Labienópolis"
        cidade = "Garça"
        estado = "SP"
        cep= 17404252
        complemento="Casa"
        completo()
    }.let { enderecoCompleto: String ->
        println(enderecoCompleto)
    }


}



