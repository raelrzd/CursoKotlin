package rezende.israel.alura.arrays_e_lists.modelos

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizaLivrosPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }

    fun organizaLivrosPorAnoPublicacao(): List<Livro> {
        return livros.sortedBy { it.anoPublicacao }
    }
}