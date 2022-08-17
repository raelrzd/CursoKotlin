import kotlin.math.absoluteValue

fun main() {
    val cardapio = mutableMapOf<Int, Double>(1 to 5.0, 2 to 10.0, 3 to 15.0)
//    val pedido = cardapio[1]
//    pedido?.let {
//        println("Valor do pedido: $it")
//    }

//    for (p in cardapio){
//        println()
//        println("Codigo do pedido: ${p.key} - Preço do pedido: ${p.value}")
//    }

    cardapio[4] = 20.0
    println(cardapio)

    cardapio.put(5, 25.0)
    println(cardapio)


    println(cardapio.getOrElse(0) { "Essa chave não existe" })

    println(cardapio.getOrDefault(1, 0.0))

//    for (codP in cardapio.keys){
//        println(codP)
//    }
//
//    for (valorP in cardapio.values){
//        println(valorP)
//    }

    println("==== FILTRO GERAL ====")
    println(cardapio.filter { (cod, valor) ->
        cod % 2 == 0 && valor >= 10.0
    })
    println()

    println("==== FILTRO POR KEY ====")
    println(cardapio.filterKeys { cod ->
        cod % 2 == 1
    })
    println()

    println("==== FILTRO POR VALUE ====")
    val valoresMaior = cardapio.filterValues { valor ->
        valor >= 20.0
    }
    for (v in valoresMaior) {
        println("Cod localizado: ${v.key} - Valor: ${v.value}")
    }
    
}