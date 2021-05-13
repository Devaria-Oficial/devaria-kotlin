import classes.Produto

/*
    -> Escrever um programa - OK
    -> Recebe alguns produtos como argumento - OK
    -> validar se esse produtos estão na lista de itens disponíveis do mercado. - OK
    -> Caso estejam, avisar o usuário quais produtos estão disponíveis - OK
    -> e quais não estão - OK
    -> exibir a lista de produtos disponíveis ordenados por ordem alfabética - OK
 */
fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()){
        println("Favor informar a lista de produtos que deseja comprar")
        return
    }

    val itensDisponiveis = arrayOf(
        Produto(preco=35.10, nome="Arroz"),
        Produto("Azeite", 16.90),
        Produto(preco=59.89, nome = "Carne"),
        Produto(nome= "Açucar", preco = 2.40)
    )

    // -> validar se esse produtos estão na lista de itens disponíveis do mercado. - OK
    val itensSelecionadosDisponiveis = itensDisponiveis.filter {
            produto -> argumentos.any { argumento ->
                argumento.equals(produto.nome, ignoreCase = true)
            }
    }

    // -> Caso estejam, avisar o usuário quais produtos estão disponíveis - OK
    for(itenSelecionadoDisponivel in itensSelecionadosDisponiveis){
        println(itenSelecionadoDisponivel.exibirDadosProduto())
    }

    // -> e quais não estão
    val argumentosSelecionadosNaoDisponiveis = argumentos.filter {
            argumento -> !itensDisponiveis.any{
                produto -> produto.nome.equals(argumento, ignoreCase = true)
            }
    }

    argumentosSelecionadosNaoDisponiveis.forEach {
            println("Este produto nós não temos infezlimente: $it")
    }

    // -> exibir a lista de produtos disponíveis ordenados por ordem alfabética
    itensDisponiveis.sortBy { it.nome }
    itensDisponiveis.forEach { println("Confira este produto disponível: " +
            "${it.exibirDadosProduto()}")
    }
}