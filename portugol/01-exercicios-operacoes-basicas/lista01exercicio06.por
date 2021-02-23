/*
	Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano,
	P(x1, y1) e P(x2, y2),
	escreva a distância entre eles. A fórmula que efetua tal cálculo é: 
	d = RAIZ QUADRADA DE (x2 - x1)² + (y2 - y1)²
*/

programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real d, x1, x2, y1, y2

		escreva("Informe o valor de x1: ")
		leia(x1)
		escreva("Informe o valor de x2: ")
		leia(x2)
		escreva("Informe o valor de y1: ")
		leia(y1)
		escreva("Informe o valor de y2: ")
		leia(y2)

		/*
		real x = mat.potencia((x2 - x1), 2) // x1=2, x2=5 -> 5-2 = 3 -> 3x3 = 9
		real y = mat.potencia((y2 - y1), 2) // y1=2, y2=6 -> 6-2 = 4 -> 4x4 = 16
		d = mat.raiz((x + y), 2) // raiz de 9+16 = 25 -> 5
		*/

		d = mat.raiz((mat.potencia((x2 - x1), 2) + 
		mat.potencia((y2 - y1), 2)), 2)
	
		escreva("A distância é de ", mat.arredondar(d, 2))
	
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 234; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */