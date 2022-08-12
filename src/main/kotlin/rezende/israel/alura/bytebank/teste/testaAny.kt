package rezende.israel.alura.bytebank.teste

import rezende.israel.alura.bytebank.modelo.Endereco

fun testaAny() {
    //    var ola = "Ola"
//    println(ola.toString())

    var enderecoFT = Endereco(logradouro = "Av Pres. Vargas", numero = 21)
    var enderecoHM = Endereco(logradouro = "Av Pres. Vargas", numero = 21)

    println(enderecoHM.equals(enderecoFT))

    println()
    println(enderecoFT.hashCode())
    println(enderecoHM.hashCode())

    println()
    println(enderecoFT.toString())
    println(enderecoHM.toString())


//    val objeto : Any = Any()
//    val teste: Any = Endereco()
//    println(teste)
//
//    fun imprime(valor: Any): Any {
//        println(valor)
//        return valor
//    }
//
//    imprime(objeto)


//    println("Total de contas: ${ContaSemTransf.totalContas}")
}