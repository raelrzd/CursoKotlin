import rezende.israel.alura.bytebank.modelo.Endereco

fun main() {

   val testaFuncao: () -> Unit
    Endereco().let {
        it
    }

    testaFuncao.let {
        it
    }

    "".let { ::testaString }

    1.let{
        it
    }

    teste(20, {})

}

fun testaString(valor: String) {

}


fun teste(valor: Int, bloco: () -> Unit){

}

