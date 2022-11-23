fun fasesDaIdade(idade: Int){
    if (idade >= 18 && idade < 60) {
        println("Adulto")
    }

    else if (idade in 12 .. 18){
        println("Adolescente")
    }

    else if (idade >= 60) {
        println("Idoso")
    }

    else {
        println("Criança")
    }
}

fun main(){
    fasesDaIdade(21)
    fasesDaIdade(12)
    fasesDaIdade(8)
    fasesDaIdade(67)
}