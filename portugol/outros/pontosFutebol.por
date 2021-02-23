programa
{
		// 4 TIMES - PALMEIRAS, SPFC, SANTOS, CORINTHIANS
		// 3 RODADAS COM TODOS OS TIMES
		// PERGUNTANDO GANHOU, PERDEU, EMPATOU
		// GANHA (3 PONTOS), EMPATA (1 PONTO), PERDE (0 PONTOS)
		// DEPOIS DE 3 RODADAS TOTALIZE E MOSTRE OS PONTOS POR TIME
	
	funcao inicio()
	{
		const inteiro QTDRODADA = 3, QTDTIME = 4
		inteiro contarRodada, contarTime

		caracter resultados[QTDTIME][QTDRODADA]
		cadeia times[QTDTIME] = {"Palmeiras", "São Paulo", "Santos", "Corinthians"}
		inteiro pontosSomados[QTDTIME] = {0, 0, 0, 0}

		para (contarRodada = 0; contarRodada < QTDRODADA; contarRodada++) 
		{
			escreva("Rodada ", contarRodada+1, "\n")
			
			para (contarTime = 0; contarTime < QTDTIME; contarTime++) 
			{
				escreva("\nO time ", times[contarTime], " ganhou, empatou ou perdeu?\n",
				"Digite G, E ou P: ")
				leia(resultados[contarTime][contarRodada])

				se ((resultados[contarTime][contarRodada] == 'G') 
				ou (resultados[contarTime][contarRodada] == 'g')) 
				{
					pontosSomados[contarTime] += 3
				}
				senao
				se ((resultados[contarTime][contarRodada] == 'E') 
				ou (resultados[contarTime][contarRodada] == 'e')) 
				{
					pontosSomados[contarTime] += 1
				}
				senao
				se ((resultados[contarTime][contarRodada] == 'P') 
				ou (resultados[contarTime][contarRodada] == 'p')) 
				{
					pontosSomados[contarTime] += 0
				}	
			}
			escreva("\n")
		}

		escreva("--------------------\n")
		escreva("Total de pontos após ", QTDRODADA, " rodadas: \n")
		para (contarTime = 0; contarTime < QTDTIME; contarTime++)
		{
			escreva(times[contarTime], ": ", pontosSomados[contarTime], " pontos\n")
		}
		escreva("--------------------\n")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1630; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */