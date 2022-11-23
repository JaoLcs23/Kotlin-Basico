fun main() {
    //helloWorld()
    //println("A soma de 10 + 5 é igual a ${sum(10, 5)}")

    helloWorld2()

    println(divisao(10f, 3.5f))
}

fun helloWorld() {
    println("Hello world!")
}

fun sum(a: Int, b: Int): Int {
    return (a + b)
}

//Funções em uma única linha
fun sum2(a: Int, b: Int) = (a + b)

fun helloWorld2() = println("Hello world!")

fun divisao(a: Float, b: Float) = a / b