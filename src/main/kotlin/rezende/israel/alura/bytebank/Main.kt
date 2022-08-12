import rezende.israel.alura.bytebank.modelo.Endereco

fun main() {
    println("início main")
    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
// RECOMENDADO CASO DESEJE QUE SEJA INTERROMPIDA A EXECUÇÃO COMPLETADA DA FUNÇÃO 2 A PARTIR DO ERRO LOCALIZADO
    try {
        funcao2()
    } catch (e: ClassCastException){
        println(e.printStackTrace()) //PERMITE O FIM DA EXECUÇÃO DO CODIGO E APRESENTA O ERRO ENCONTRADO NO FINAL
        println("Uma exception de ClassCastException foi pegada")
    }
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5) {
        println(i)
        val testeEnd = Any()
        testeEnd as Endereco
// RECOMENDADO PARA O TERMINO DE EXECUÇÃO DA FUNÇÃO 2
//        try {
//            val testeEnd = Any()
//            testeEnd as Endereco
//        } catch (e: ClassCastException){
//            println("Uma exception de ClassCastException foi pegada")
//        }
    }

    println("fim funcao2")
}