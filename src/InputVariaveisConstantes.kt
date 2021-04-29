fun main(argumentos : Array<String>) {

    if(argumentos.isEmpty()) {
        println("Favor informar um argumento válido")
        return
    }

    val numero = argumentos[0].toIntOrNull()

    if(numero == null) {
        println("O Valor informado não é um número válido!")
        return
    }

    println("o número digitado foi: $numero")

    var soma = 0
    soma = numero + numero
    println("A soma do número + número é de: $soma")
}