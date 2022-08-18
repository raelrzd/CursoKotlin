fun main() {

    //VARIAVEL FUNCIONAL A PARTIR DE FUNÇÃO
    val minhaFuncao: (Int, Int) -> Int = ::teste
    println(minhaFuncao(10, 15))

    //VARIAVEL FUNCIONAL A PARTIR DE CLASSE (INVOKE)
    val minhaFuncaoClasse: (Int, Int) -> Int = Teste()
    println(minhaFuncaoClasse(5, 10))

    //VARIAVEL FUNCIONAL LAMBDA
    val minhaFuncaoLambda: () -> Unit = {
        println("Executando como lambda")
    }

    //VARIAVEL FUNCIONAL ANONIMA
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa como anonima")
    }

    println(minhaFuncaoLambda())
    println(minhaFuncaoAnonima())


}

fun teste(a: Int, b: Int): Int {
    return a + b
}

class Teste : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }

}





