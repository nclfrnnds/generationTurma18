/*
	Faça um programa que crie um vetor por leitura com 5 valores 
	de pontuação de uma atividade e o escreva em seguida. 
	Encontre após a maior pontuação e a apresente. 
*/

programa
{
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		const inteiro QTDVALORES = 5 
		inteiro pontuacoes[QTDVALORES]
		inteiro maiorPontuacao = 0

		para(inteiro contador = 0; contador < QTDVALORES; contador++)
		{
			escreva("Informe a pontuação ", contador+1, ": ")
			leia(pontuacoes[contador])
			maiorPontuacao = mat.maior_numero(maiorPontuacao, pontuacoes[contador])
			/*se (pontuacoes[contador] > maiorPontuacao) {
				maiorPontuacao = pontuacoes[contador]
			}*/
		}
		escreva("\n")

		para (inteiro contador = 0; contador < 5; contador++)
		{
			escreva("Pontuação ", contador+1, ": ", pontuacoes[contador], "\n")
		}
		escreva("A maior pontuação é: ", maiorPontuacao, "\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 676; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */