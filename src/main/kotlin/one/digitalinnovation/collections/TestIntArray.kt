package one.digitalinnovation.collections

fun main() {
    val values = IntArray (5)
    //criamos o intarray, intArray é uma instacia do objeto dentro de values

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values) {
        println(valor)
    }
println("......................")
    values.forEach {
        println(it)
        //it é a nossa variavel valor. Usando a expressão de lambda do forEach para fazer a impressão.
    }
println("........................")
    //interação sobre os indices do nosso array, não estamos iterando os valores contidos em cada indice
    for (index in values.indices) {
        println(values[index])
    }
    //recurso sort() ele ordena os numeros por padrão do menor por maior.
println(".........................")
    values.sort()
    for (valor in values) {
        println(valor)
    }
println(".........................")


}