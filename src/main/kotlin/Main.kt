fun main() {
    println("Bem vindo ao ByteBank")
    val titular: String = "Israel"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0
    saldo = 100.0
    saldo+=(-1000)

    println("Titular: $titular")
    println("Numero da conta: $numeroConta")
    println("Saldo: $saldo")

    if (saldo <= 0.0) {
        if (saldo == 0.0) {
            println("O saldo da conta é neutro")
        } else {
            println("O saldo da conta é negativo")
        }
    } else {
        println("O saldo da conta é positivo")
    }

}