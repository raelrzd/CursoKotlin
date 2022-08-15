fun main() {

    val idades = arrayListOf<Int>(33, 42, 20, 15, 26)
    var maiorIdade = Int.MIN_VALUE
    var menorIdade = Int.MAX_VALUE

    idades.forEachIndexed { i, idade ->
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }
    println(maiorIdade)
    println(menorIdade)



    val salarios = arrayListOf<Double>(1500.0, 2500.0, 4200.0, 5300.0, 10000.0)
    val aumento = 1.1

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println(salarios.toString())

}


