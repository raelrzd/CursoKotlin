fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("O saldo da conta é positivo")
    } else if (saldo == 0.0) {
        println("O saldo da conta é neutro")
    } else {
        println("O saldo da conta é negativo")
    }
}