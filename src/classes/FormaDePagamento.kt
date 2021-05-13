package classes

open class FormaDePagamento {
    open fun efetuarPagamento() : Unit {
        println("Não foi possível processar o pagamento com a forma de pagamento selecionada")
    }
}

class FormaPagamentoPix : FormaDePagamento() {
    override fun efetuarPagamento() {
        println("Pagamento efetuado via PIX")
    }
}

class FormaPagamentoBoleto : FormaDePagamento() {
    override fun efetuarPagamento() {
        println("Pagamento efetuado via Boleto")
    }
}