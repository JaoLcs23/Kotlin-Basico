fun cargoWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiário" -> 500f
        else -> 0f
    }
}

fun main() {
    println("Digite o seu cargo: ")
    var cargo = readLine()

    println("Seu bônus é de: ${cargo?.let { bonus(it) }}")
}