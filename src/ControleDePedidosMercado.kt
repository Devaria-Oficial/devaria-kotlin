/*
    -> Escrever um programa que recebe alguns produtos como argumentos - OK
    -> validar se esses produtos estão na lista de itens disponíveis do mercado. - OK
    -> Caso estejam, avisar o usuário quais produtos tem - OK
    -> E quais não tem e, - OK

    -> por último, exibir a lista de produtos disponíveis ordenados por ordem alfabética do mercado,
    para que o usuário possa pedir na próxima vez. - OK
 */

//-> Escrever um programa que recebe alguns produtos como argumentos - START
fun main(argumentos : Array<String>) {

    // validar se vieram produtos nos argumentos
    if(argumentos.isEmpty()){
        println("Favor informar sua lista de produtos para verificarmos a disponibilidade")
        return
    }

    //-> Escrever um programa que recebe alguns produtos como argumentos - END


    //-> validar se esses produtos estão na lista de itens disponíveis do mercado. - START
    val produtosDisponiveis = arrayOf("PÃO", "BOLACHA", "QUEIJO", "ARROZ", "FEIJÃO", "OVO", "FRANGO"
            , "AZEITE", "OLEO")

    val produtosRequisitadosDisponiveis = argumentos.filter { produtoRequisitado ->
                produtosDisponiveis.contains(produtoRequisitado.toUpperCase())
    }

    //-> validar se esses produtos estão na lista de itens disponíveis do mercado. - END

    // -> Caso estejam, avisar o usuário quais produtos tem - START
    for(produtoRequisitadoDisponivel in produtosRequisitadosDisponiveis){
        println("Este produto nós temos: $produtoRequisitadoDisponivel")
    }
    // -> Caso estejam, avisar o usuário quais produtos tem - END

    //-> E quais não tem e - START
    val produtosRequisitadoNaoDisponiveis = argumentos.filter { produtoRequisitado ->
        !produtosDisponiveis.contains(produtoRequisitado.toUpperCase())
    }

    produtosRequisitadoNaoDisponiveis.forEach { produtoNaoDisponivel -> println("Este produto nós " +
            "não temos infelizmente: $produtoNaoDisponivel")
    }
    //-> E quais não tem e - END

    //-> por último, exibir a lista de produtos disponíveis ordenados por ordem alfabética do mercado,
    //    para que o usuário possa pedir na próxima vez. - START
    val produtosOrdenados = produtosDisponiveis.sortedBy { produto -> produto }
    produtosOrdenados.forEach { produto -> println("Confira este produto disponível: $produto") }

    //-> por último, exibir a lista de produtos disponíveis ordenados por ordem alfabética do mercado,
    //    para que o usuário possa pedir na próxima vez. - END
}