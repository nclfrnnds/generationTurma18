/*
	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	A seguir determine e imprima a média aritmética dos lançamentos, 
	contabilize e apresente também quantas foram as ocorrências da maior pontuação.
*/

programa
{

	inclua biblioteca Util --> util
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		const inteiro QTDLANC = 10
		inteiro lancamentos[QTDLANC], qtdMaior = 0
		real somatorio = 0.0, maior = 0.0

		para(inteiro contador = 0; contador < QTDLANC; contador++)
		{
			lancamentos[contador] = util.sorteia(1, 6)
			somatorio = somatorio + lancamentos[contador]
			maior = mat.maior_numero(maior, lancamentos[contador])
		}

		para(inteiro contador = 0; contador < QTDLANC; contador++)
		{
			se(lancamentos[contador] == maior) {
				qtdMaior++
			}
			escreva("Lançamento ", contador+1, ": ", lancamentos[contador], "\n")
		}
		escreva("\nMédia dos números lançados é ", (somatorio / QTDLANC), 
		"\nO maior número lançado é ", maior, " e foi lançado ", qtdMaior, " vez(es)\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 766; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */