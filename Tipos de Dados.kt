import java.util.DoubleSummaryStatistics

fun main(){
    var b: Boolean = true //Apenas 2 valores (0/1 ou verdadeiro/falso)
    var c: Char = 'a' //Apenas 1 caractere
    var s: String = "João Lucas de Oliveira Ramos" //Escrever o que quiser

    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    var idade: Byte = 16

    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")
}
