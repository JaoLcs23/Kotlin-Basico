//Exercício 3 - Lógica do 'E' e 'OU'

fun main(){
    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)
    println(!a && !b && (c && d))
    println(a && ((b || c) || d))
    println(a || ((!b && c) || !d))
}