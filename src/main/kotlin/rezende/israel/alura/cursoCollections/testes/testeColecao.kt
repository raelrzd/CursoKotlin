package rezende.israel.alura.cursoCollections.testes

fun testeColecao() {
    val nomes: Collection<String> = listOf("Rael", "Teteu", "Gui", "Fer", "Yokota")
    println("O Rael está nesta lista: ${nomes.contains("Rael")}")
    println("Numero de itens na coleção: ${nomes.size}")
}

fun testaNomesCollection() {
    val banco = BancoDeNomes()
    val nomesSalvos: Collection<String> = banco.nomes
    banco.salva("Alex")
    println(nomesSalvos)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()
    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }

}