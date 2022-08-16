fun main() {

    val assistiramCursoAndroid: Set<String> = setOf("Rael", "Dan", "Harold", "Teteu")
    val assistiramCursoKotlin: Set<String> = setOf("Rael", "Gui", "Lopes", "Dan")
    //val assistiramAmbos: MutableSet<String> = assistiramCursoKotlin + assistiramCursoAndroid
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    assistiramAmbos.add("Yokota")
    assistiramAmbos.add("Yokota")

    println(assistiramAmbos)


}