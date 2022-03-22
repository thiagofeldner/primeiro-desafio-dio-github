package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 5, 13, 8)

    values.forEach {
        println(it)
    }

    println("-------------------------")
    values.sort()
    values.forEach {
        println(it)
    }

    println("-------------------------")

}