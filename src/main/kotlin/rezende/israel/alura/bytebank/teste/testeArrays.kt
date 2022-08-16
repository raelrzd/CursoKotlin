package rezende.israel.alura.bytebank.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testesArrays() {
    //VERIFICAÇÃO DE MAIORES E MENORES IDADES
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

    println("==================================================")

    //TESTE VERIFICAÇÕES EM LISTA, FILTER (RETORNA V OU F SE UM NUMERO EXISTE NA LISTA), FIND (RETORNA O NUMERO INSERIDO NA BUSCA OU NULL), ALL E ANY
    val salariosTeste = arrayListOf<Double>(2000.00, 2500.00, 3000.00, 4500.00)
    val menores: Double? = salariosTeste.find { it == 3300.0 }
    println(menores)

    println("==================================================")

    //CALCULO DE 10% AUMENTO DE SALÁRIO COM AUMENTO MINIMO DE R$500
    val salarios = bigDecimalArrayListOf("1500.00", "2500.00", "3000.00", "3500.00", "6500.00")
    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios.map { salario ->
        calculaAumentoRelativo(salario, aumento)
    }.toTypedArray()

    println(salarios.contentToString())
    println(salariosComAumento.contentToString())


    //MEDIA DOS 3 MAIORES SALARIOS COM AUMENTO
    val mediaMaioresSalarios = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println("Media dos maiores salarios: $mediaMaioresSalarios")

    //MEDIA DOS 3 MENORES SALARIOS COM AUMENTO
    val mediaMenoresSalarios = salariosComAumento.sorted().take(3).toTypedArray().media()
    println("Media dos menores salarios: $mediaMenoresSalarios")

    //CALCULA O VALOR GASTO EM 6 MESES DE SALARIOS APÓS O AUMENTO
    val gastoInicial = salariosComAumento.somatoria()
    val meses = "6".toBigDecimal()
    val salarios6Meses = salariosComAumento.fold(gastoInicial) { acumulador, salario ->
        acumulador + (salario * meses).setScale(2, RoundingMode.UP)
    }
    println("Salarios total de 6 meses: $salarios6Meses")
}

fun Array<BigDecimal>.media(): BigDecimal {
    return if (this.isEmpty()){
        BigDecimal.ZERO
    } else {
        this.somatoria() / this.size.toBigDecimal()
    }

}

fun Array<BigDecimal>.somatoria(): BigDecimal{
    return this.reduce { acumulador, valor ->
        acumulador + valor
    }
}


fun bigDecimalArrayListOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal): BigDecimal {
    return if (salario < "5000.00".toBigDecimal()) {
        salario + "500.00".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)

    }
}