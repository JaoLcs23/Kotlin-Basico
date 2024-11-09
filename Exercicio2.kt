//Exercício 2 - Bônus 2

fun bonus(cargo: String, tempoExperiencia: Int): Float {
    var bonus: Float = 0f
    var tempoExperiencia: Int = 0

    if (cargo == "Gerente" && tempoExperiencia < 2) {
        bonus = 2000f
    } else if (cargo == "Gerente" && tempoExperiencia >= 2) {
        bonus = 3000f
    } else if (cargo == "Coordenador" && tempoExperiencia < 1) {
        bonus = 1500f
    } else if (cargo == "Coordenador" && tempoExperiencia >= 1) {
        bonus = 2000f
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

    println("Insira seu tempo de experiência: ")
    var tempoExperiencia = readln().toInt()

    println("Seu bônus é de: ${bonus(cargo)}")
}