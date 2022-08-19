package rezende.israel.alura.cursoCollections.testes

fun testaVariavelTipoFuncao() {
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

    val calculadoraBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50.0
        }
        salario + 100.0
    }

    println(minhaFuncaoLambda(25, 20))
    println(calculadoraBonificacao(1000.0))


    //VARIAVEL FUNCIONAL ANONIMA
    val minhaFuncaoAnonima: (Int, Int) -> Int = fun(a: Int, b: Int): Int {
        return a + b
    }

    val calculadoraBonificacaoAnonima: (Double) -> Double = fun(salario: Double): Double {
        if (salario > 1000.0) {
            return salario + 50.0
        }
        return salario + 100.0
    }

    println(minhaFuncaoAnonima(20, 15))
    println(calculadoraBonificacaoAnonima(1100.0))
}


fun teste(a: Int, b: Int): Int {
    return a + b
}

class Teste : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }

}
