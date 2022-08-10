fun testaLacos() {
    var i = 1

    while (i <= 5) {

        val titular: String = "Israel $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = 10.0 + i

        println("Titular: $titular")
        println("Numero da conta: $numeroConta")
        println("Saldo: $saldo")
        println()
        i++
    }
}