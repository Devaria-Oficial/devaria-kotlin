import classes.Ave
import classes.Mamifero
import classes.Peixe
import classes.Reptil

/*
    -> Escrever um programa - OK
    -> recebe um nome de animal vertebrado - OK
    -> fazer filtro, -OK
    -> identificar qual dos grupos ele pertence (Mamífero, Réptil, Ave e Peixe),
    -> exibir os dados genéricos de cada animal.
 */
fun main() {
    println("Favor informar qual animal você deseja saber mais:")
    val animalInfomado = readLine()

    if(animalInfomado.isNullOrBlank() || animalInfomado.isNullOrEmpty()){
        println("Animal informado não é válido")
        return
    }

    val listaDeAnimaisBancoDados = arrayOf(
        Peixe("Tubarão", qtdNadadeiras = 2),
        Mamifero("Leão", qtdMamas = 4),
        Ave("Gavião", qtdPenas = 500, consegueFazerMigracao = true),
        Reptil("Serpente", temperaturaCorporal = 8.0)
    )

    val animalSelecionado = listaDeAnimaisBancoDados.find { it.nome.equals(animalInfomado, ignoreCase = true) }
    if(animalSelecionado == null){
        println("Animal informado não está na nossa base, tente novamente")
        return
    }

    when(animalSelecionado){
        is Mamifero -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Mamífero " +
                "e tem as seguintes características: é aquático ${animalSelecionado.isMamiferoAquatico}" +
                " pode botar ovo ${animalSelecionado.consegueBotarOvo}")
        is Reptil -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Réptil " +
                "e tem as seguintes características: é terrestre ${animalSelecionado.isReptilTerrestre}" +
                " quantidade de patas ${animalSelecionado.qtdPatas}")
        is Ave -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é uma Ave " +
                "e tem as seguintes características: sabe voar ${animalSelecionado.consegueVoar}" +
                " consegue fazer migração ${animalSelecionado.consegueFazerMigracao}")
        is Peixe -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Peie " +
                "e tem as seguintes características: de agua salgada ${animalSelecionado.isPeixeAguaSalgada}" +
                " e carnívoro ${animalSelecionado.isCarnivoro}")
        else -> println("Você pesquisou sobre o animal ${animalSelecionado.nome} ele é um Animal não " +
                "identificado ainda")
    }
}