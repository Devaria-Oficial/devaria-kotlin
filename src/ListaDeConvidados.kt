fun main() {

    println("Favor informar o nome do convidado:")

    // readLine le a linha de comando e salva na constate nome
    val nome = readLine()

    // verifica se o nome É null ou vazio ou em branco e caso seja um deles para o programa e informa o usuário
    if(nome.isNullOrEmpty() || nome.isNullOrBlank()){
        println("Nome informado não é válido!")
        return
    }

    println("Favor infomar a idade do convidado:")
    // readLine le a linha de comando e tranforma em Inteiro ou Nulo e depois salva na constante idade
    val idade = readLine()?.toIntOrNull()

    // verifica se idade é nula ou menor igual a zero para o programa e informa o usuário
    if(idade == null || idade <= 0){
        println("A idade informada não é válida!")
        return
    }

    var estaConvidado = false

    // verifica através do when se o nome informado está na lista de convidados e muda a variavel estaConvidado para true
    when(nome){
        "Kaique" -> estaConvidado = true
        "Ale" -> estaConvidado = true
        "Ricardo" -> estaConvidado = true
        "Alan" -> estaConvidado = true
        "Aldo" -> estaConvidado = true
        else -> estaConvidado = false
    }

    // verifica se a pessoa está convidada e tem mais que 18 anos
    if(estaConvidado && idade >= 18){
        println("Bem vindo a festa Kotlin Devaria 2021")
    }
    // caso não esteja convidada ou não tenha 18 anos, verifica novamente se não esta convidada
    // para informar uma mensagem especifica de convite
    else if(!estaConvidado){
        println("Você não está na lista de convidados, verifique com a pessoa que te chamou")
    }
    // caso ja identificamos que ela esta convidada, então só pode ter menos que 18 anos
    // informa uma mensagem especifica de idade
    else{
        println("Você não tem 18 anos para entrar na festa")
    }
}