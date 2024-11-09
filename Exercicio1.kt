//Exercício 1 - Bônus 1

fun bonus(cargo: String): Float {
    var bonus: Float = 0.0f

    if (cargo == "Gerente") {
        bonus = 2000f
    } else if (cargo == "Coordenador") {
        bonus = 1500f
    } else if (cargo == "Engenheiro de Software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }

    return bonus
}

fun main() {
    println("Insira o seu cargo: ")
    var cargo = readln()
    println("Seu bônus é de: ${bonus(cargo)}")
}