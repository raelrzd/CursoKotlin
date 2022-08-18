import rezende.israel.alura.cursoCollections.testes.testeOrganizacaoMap

fun main() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())


    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())

}

fun teste() {
    println("Executado teste")
}

class Teste : () -> Unit {
    override fun invoke() {
        println("Executado invoke de Teste")
    }

}





