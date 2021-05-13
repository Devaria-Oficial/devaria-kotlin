import classes.FormaDePagamento
import classes.FormaPagamentoBoleto
import classes.FormaPagamentoEnum.Pix
import classes.FormaPagamentoEnum.Boleto
import classes.FormaPagamentoPix
import classes.Produto

/*
    -> Escrever um programa - OK
    -> Recebe os produtos a serem comprados - OK
    -> receber a forma de pagamentos escolhida
    -> de acordo com a forma de pagamento, efetua a compra utilizando o correto meio de pagamento.

 */
fun main(argumentos : Array<String>) {
    if(argumentos.isEmpty()){
        println("Favor informar os produtos a serem comprados")
        return
    }

    val produtosDisponiveis = arrayOf(
        Produto("Tênis", 290.0),
        Produto("Bola", 220.0)
    )

    val produtosSelecionados = produtosDisponiveis.filter {
        argumentos.any { argumento -> it.nome.equals(argumento, ignoreCase = true) }
    }

    if(produtosSelecionados.isEmpty()){
        println("Os produtos selecionados não estão disponíveis")
        return
    }

    // -> receber a forma de pagamentos escolhida
    println("Favor informar a forma de pagamento desejada (Boleto, Pix)")
    val formaPagamentoSelecionada = readLine()

    if(formaPagamentoSelecionada.isNullOrEmpty() || formaPagamentoSelecionada.isNullOrBlank()){
        println("Favor informar uma forma de pagamento válida")
        return
    }

    // -> de acordo com a forma de pagamento, efetua a compra utilizando o correto meio de pagamento.
    val formaPagamento : FormaDePagamento = if(formaPagamentoSelecionada == Pix.toString()){
        FormaPagamentoPix()
    }else if(formaPagamentoSelecionada == Boleto.toString()){
        FormaPagamentoBoleto()
    }else {
        FormaDePagamento()
    }

    println("Seus Produtos selecionados")
    produtosSelecionados.forEach { println(it.exibirDadosProduto()) }
    formaPagamento.efetuarPagamento()
}
