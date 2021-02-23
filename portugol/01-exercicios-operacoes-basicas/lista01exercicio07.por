/*
	Um sistema de equações lineares do tipo: 
	ax + by = c
	dx + ey = f
	pode ser resolvido segundo mostrado abaixo:
	x = (ce - bf) / (ae - bd)
	y = (af - cd) / (ee - bd)
	Escreva um sistema que lê os coeficientes a,b,c,d,e, f 
	e calcula e mostra os valores de x e y.
*/

programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real numA, numB, numC, numD, numE, numF, numX, numY

		escreva("Informe seis valores (separando pela tecla enter): \n")
		leia(numA, numB, numC, numD, numE, numF)

		numX = (numC*numE - numB*numF) / (numA*numE - numB*numD)
		numY = (numA*numF - numC*numD) / (numA*numE - numB*numD)

		escreva("O valor de X é ", mat.arredondar(numX, 2), 
		" e o valor de Y é ", mat.arredondar(numY, 2))
	
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 235; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */