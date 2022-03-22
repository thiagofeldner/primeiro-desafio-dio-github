package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista

fun main() {
    val joao = Analista("Joao Carlos", cpf = "234.567.890.21", 2000.0)

    imprimeRelatorioFuncionario.imprime(joao)
}

