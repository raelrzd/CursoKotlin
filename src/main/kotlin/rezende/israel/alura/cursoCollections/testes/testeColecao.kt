package rezende.israel.alura.cursoCollections.testes

fun testeColecao() {
    val nomes: Collection<String> = listOf("Rael", "Teteu", "Gui", "Fer", "Yokota")
    println("O Rael está nesta lista: ${nomes.contains("Rael")}")
    println("Numero de itens na coleção: ${nomes.size}")
}