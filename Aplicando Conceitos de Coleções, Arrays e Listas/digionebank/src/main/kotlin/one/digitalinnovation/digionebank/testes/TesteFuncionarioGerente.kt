package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente("Maria Clara", cpf = "124.567.890.21", 5000.0, "senha 123")

    imprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}


