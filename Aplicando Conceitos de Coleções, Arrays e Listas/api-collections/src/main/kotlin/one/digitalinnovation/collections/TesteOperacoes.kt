package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2350.0, 3752.0)

    for (salario in salarios){
        println(salario)
    }

    println("-------------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salarial: ${salarios.average()}")

    println("-------------------------")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }

    println("-------------------------")
    println(salarios.count { it in 2000.0..5000.0 })

    println("-------------------------")
    println(salarios.find { it == 2350.0 })
    println(salarios.find { it == 50.0 })

    println("-------------------------")
    println(salarios.any { it != 1000.0 })
    println(salarios.any { it == 500.0 })
}