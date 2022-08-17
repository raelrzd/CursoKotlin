package rezende.israel.alura.cursoCollections.testes

fun testeSet() {
    val assistiramCursoAndroid: Set<String> = setOf("Rael", "Dan", "Harold", "Teteu")
    val assistiramCursoKotlin: Set<String> = setOf("Rael", "Gui", "Lopes", "Dan")
    //val assistiramAmbos: MutableSet<String> = assistiramCursoKotlin + assistiramCursoAndroid
    val assistiramAmbos = (assistiramCursoAndroid union assistiramCursoKotlin).toMutableList()
    assistiramAmbos.add("Yokota")
    assistiramAmbos.add("Yokota")

    println(assistiramAmbos)
    println(assistiramAmbos.toSet())
}