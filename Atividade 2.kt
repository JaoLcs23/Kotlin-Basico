fun converteAnos(anos: Int) {
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 60} horas")
    println("${anos * 365 * 60 * 60} minutos")
    println("${anos * 365 * 60 * 60 * 60} segundos")
}

fun calcularTamanho(nome: String) = nome.length

fun calcularCubo(numero: Int) = numero*numero*numero

fun milhasKm(milhas: Float): Float = milhas * 1.6f

fun trocaLetra(frase: String){
    println(frase.replace("a", "x").replace("ã", "x").lowercase())
}

fun main() {
    converteAnos(2)
    println(calcularTamanho("João Lucas"))
    println(calcularCubo(16))
    println(milhasKm(22f))
    println(trocaLetra("João Lucas"))
}