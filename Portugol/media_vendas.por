programa
{	
	funcao inicio()
	{
		cadeia nome
		real media,jan,fev,mar,abr,soma

		escreva("Digite o Nome do Funcionário: ")
		leia(nome)
		escreva("Digite o valor da venda de Janeiro: ")
		leia(jan)
		escreva("Digite o valor da venda de Fevereiro: ")
		leia(fev)
		escreva("Digite o valor da venda de Março: ")
		leia(mar)
		escreva("Digite o valor da venda de Abril: ")
		leia(abr)

		soma = (jan+fev+mar+abr)
		escreva("O funcionário: " + nome + " vendeu total:" + soma + "\n")
		
		media = (jan+fev+mar+abr)/4
		escreva("O funcionário: " + nome + " teve média de vendas: " + media)
		

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 480; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */