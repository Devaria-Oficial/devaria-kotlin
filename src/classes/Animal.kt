package classes

import com.sun.org.apache.xpath.internal.operations.Bool

open class Animal(val nome : String)

class Mamifero(nome: String,
    val qtdMamas : Int = 0,
    val isMamiferoAquatico : Boolean = false,
    val consegueBotarOvo : Boolean = false) : Animal(nome)

class Reptil(nome: String,
    val temperaturaCorporal : Double = 12.5,
    val isReptilTerrestre : Boolean = true,
    val qtdPatas : Int = 0) : Animal(nome)

class Ave(nome: String,
    val qtdPenas : Int = 0,
    val consegueVoar : Boolean = true,
    val consegueFazerMigracao : Boolean = false) : Animal(nome)

class Peixe(nome: String,
    val qtdNadadeiras: Int = 0,
    val isPeixeAguaSalgada : Boolean = true,
    val isCarnivoro : Boolean = true) : Animal(nome)