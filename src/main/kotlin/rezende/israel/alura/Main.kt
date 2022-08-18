fun main() {

    //VARIAVEL FUNCIONAL A PARTIR DE FUNÇÃO
    val minhaFuncao: (Int, Int) -> Int = ::teste
    println(minhaFuncao(10, 15))

    //VARIAVEL FUNCIONAL A PARTIR DE CLASSE (INVOKE)
    val minhaFuncaoClasse: (Int, Int) -> Int = Teste()
    println(minhaFuncaoClasse(5, 10))

    //VARIAVEL FUNCIONAL LAMBDA
    val minhaFuncaoLambda: (Int, Int) -> Int = { a: Int, b: Int ->
        a + b
    }

    //VARIAVEL FUNCIONAL ANONIMA
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        return a + b
    }

    println(minhaFuncaoLambda(25, 20))
    println(minhaFuncaoAnonima(20, 15))


}

fun teste(a: Int, b: Int): Int {
    return a + b
}

class Teste : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }

}





