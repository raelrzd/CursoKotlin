package rezende.israel.alura.cursoCollections.testes

fun testeOrganizacaoMap() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 40.0),
        Pedido(4, 50.0)
    )

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }


//    val pedidosComFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { Pedido ->
//        Pedido.valor > 30.0
//    }

    val pedidosComFreteGratis = pedidos.groupBy { pedido: Pedido ->
        pedido.valor >= 40
    }


    println(pedidosMapeados)
    println(pedidosComFreteGratis[true])


    val nomes = listOf<String>(
        "Rael",
        "Dan",
        "Gui",
        "Ga"
    )

    val agenda = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['R'])
}


data class Pedido(
    val numero: Int,
    val valor: Double
)