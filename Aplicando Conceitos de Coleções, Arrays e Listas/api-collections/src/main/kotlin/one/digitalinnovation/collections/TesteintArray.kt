package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 8
    values[2] = 7
    values[3] = 9
    values[4] = 5

    for(valor in values){
        println(valor)
    }

    println("-------------------------")
    values.forEach { valor ->
        println(valor)
    }

    println("-------------------------")
    for(index in values.indices){
        println(values[index])
    }

    println("-------------------------")
    values.sort()
    for(valor in values){
        println(valor)
    }
}