/*
	Escreva  um sistema que leia três números inteiros e positivos (A, B, C) 
	e calcule a seguinte expressão: D = (R + S) / 2, onde 
	R = (A + B)²
	S = (B + C)²
*/

programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		
		inteiro numA, numB, numC, numD, numR, numS

		escreva("Digite o número A: ")
		leia(numA)
		escreva("Digite o número B: ")
		leia(numB)
		escreva("Digite o número C: ")
		leia(numC)
		
		numR = mat.potencia((numA + numB), 2)
		numS = mat.potencia((numB + numC), 2)
		numD = (numR + numS) / 2
		
		escreva("O resultado é ", numD)
	
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 204; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */