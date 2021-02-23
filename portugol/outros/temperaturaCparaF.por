programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real celsius, fahrenheit, fahrenheit2
		
		escreva("Informe a temperatura em graus celsius: ")
		leia(celsius)

		// testando com duas fórmulas diferentes
		fahrenheit = (celsius * 1.8) + 32
		fahrenheit2 = ((9 * celsius) / 5) + 32

		escreva("A temperatura em fahrenheit é de ", mat.arredondar(fahrenheit, 2), "\n")
		escreva("A temperatura em fahrenheit é de ", fahrenheit2, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 229; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */