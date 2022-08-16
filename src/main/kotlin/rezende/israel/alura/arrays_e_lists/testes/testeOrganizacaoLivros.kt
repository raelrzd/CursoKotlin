package rezende.israel.alura.arrays_e_lists.testes

import rezende.israel.alura.arrays_e_lists.modelos.Livro
import rezende.israel.alura.arrays_e_lists.modelos.Prateleira

fun testeOrganizacaoLivros() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )

    val meusLivros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    val livro5 = Livro(
        titulo = "Sagarana",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1946
    )

    meusLivros.imprimeListaComMarcadores()


    meusLivros.add(livro5)
    meusLivros.imprimeListaComMarcadores()


//    meusLivros.remove(livro3)
//    meusLivros.imprimeListaComMarcadores()


    val listaOdernadaPorAno: List<Livro> = meusLivros.sorted()
    listaOdernadaPorAno.imprimeListaComMarcadores()


    meusLivros.sortedBy { it.autor }.imprimeListaComMarcadores()

    val titulos: List<String> = meusLivros.titulosPorAnoPublicacaoDoAutor("João")
    println(titulos.joinToString(separator = "\n") {
        "Titulo: ${it.toString()}"
    })

    println()
    meusLivros.groupBy { it.editora ?: "Editora desconhecida" }.forEach { editora: String, livros: List<Livro> ->
        println("$editora: ${livros.joinToString { it.titulo }}")
    }

    val prateleira = Prateleira(genero = "LIteratura", livros = meusLivros)

    val porAutor = prateleira.organizaLivrosPorAutor()
    val porAnoPublicacao = prateleira.organizaLivrosPorAnoPublicacao()

    println("================================")
    porAutor.imprimeListaComMarcadores()
    porAnoPublicacao.imprimeListaComMarcadores()
}

fun List<Livro>.titulosPorAnoPublicacaoDoAutor(prefixoAutor: String): List<String> {
    return this.filter { it.autor.startsWith(prefixoAutor) }.sortedBy { it.anoPublicacao }.map { it.titulo }
}

fun List<Livro?>.imprimeListaComMarcadores() {
    val listaComMarcadores = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            "Titulo: ${it.titulo} - Autor: ${it.autor}"
        }
    println("#### LISTA DE LIVROS ####\n${listaComMarcadores}")
    println()
}