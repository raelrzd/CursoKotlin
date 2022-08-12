package rezende.israel.alura.bytebank.exception

import rezende.israel.alura.bytebank.modelo.Conta

class SaldoInsuficienteException (mensagem: String = "O saldo é insuficiente!") : Exception(mensagem)