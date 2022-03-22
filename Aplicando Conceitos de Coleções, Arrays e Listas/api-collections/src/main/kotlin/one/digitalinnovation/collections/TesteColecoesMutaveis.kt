package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = mutableListOf(joao, maria)
    funcionarios.forEach{ println(it) }

    println("-----------ADD--------------")
    funcionarios.add(pedro)
    funcionarios.forEach{ println(it) }

    println("-----------REMOVE--------------")
    funcionarios.remove(joao)
    funcionarios.forEach{ println(it) }

    println("-----------SET--------------")
    val funcionarioSet = mutableSetOf(joao)
    funcionarioSet.forEach{ println(it) }

    println("-----------ADD SET--------------")
    funcionarioSet.add(pedro)
    funcionarioSet.add(maria)
    funcionarioSet.forEach{ println(it) }

    println("-----------REM SET--------------")
    funcionarioSet.remove(maria)
    funcionarioSet.forEach{ println(it) }

}