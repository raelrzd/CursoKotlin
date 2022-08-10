package rezende.israel.alura.bytebank.modelo

class ContaSalario(
    titular: Cliente,
    numero: Int
) : ContaSemTransf(
    titular = titular,
    numero = numero
) {
}