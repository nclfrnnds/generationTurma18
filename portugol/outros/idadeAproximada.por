programa
{
	funcao inicio()
	{
		// declaração
		cadeia nomePessoa
		inteiro anoAtual, anoNascimento, idadeAproximada

		// entradas
		escreva("Digite o nome da pessoa: ")
		leia(nomePessoa)
		escreva("Digite o nome de nascimento da pessoa: ")
		leia(anoNascimento)

		// processamento
		anoAtual = 2021
		idadeAproximada = anoAtual - anoNascimento

		// saída
		escreva("Oi, ", nomePessoa, ", sua idade aproximada é de ", idadeAproximada, " anos!")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 461; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */