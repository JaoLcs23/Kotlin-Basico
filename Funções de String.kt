fun main(){
    val str = "Programação Kotlin"

    println("Tamanho da string: ${str.length}")
    println("Posição (index) 0 da string: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(4, 8))
    println(str.replace("Kotlin", "Kotlin é braba demais"))
    println(str.lowercase())
    println(str.uppercase())
    println("              seu nome é                  ".trim())
}