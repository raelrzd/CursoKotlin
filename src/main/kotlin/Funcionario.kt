class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val tipo: Int
) {
    fun bonificacao(): Double {
        if (tipo == 0) {
            return salario * 0.10
        } else if (tipo == 1){
            return salario * 0.20
        } else{
            return salario * 0.30
        }
    }

    fun autentica(){
        if (tipo == 1){
            //pode autenticar
        }
    }
}