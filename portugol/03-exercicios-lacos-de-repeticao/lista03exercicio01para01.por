/*
	A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.
*/

programa
{
	
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real numSalario = 0.0, numFilhos = 0.0,
			maiorSalario = 0.0, percentualAteCem = 0.0,
			somatorioSalario = 0.0, somatorioFilhos = 0.0,
			mediaSalario = 0.0, mediaFilhos = 0.0
		const inteiro HABITANTES = 3 // testado com 3, mas deve ser modificado para 20 de acordo com o enunciado
		
		para (inteiro contador = 1; contador <= HABITANTES; contador++) {
			
			escreva("Informe o salário do habitante ", contador, ": ")
			leia(numSalario)
			escreva("Informe o número de filhos: ")
			leia(numFilhos)
			
			somatorioSalario = somatorioSalario + numSalario
			somatorioFilhos = somatorioFilhos + numFilhos

			se (numSalario > maiorSalario) 
			{
				maiorSalario = numSalario
			}

			se (numSalario <= 100) 
			{
				percentualAteCem++
			}
			
		}

		mediaSalario = somatorioSalario / HABITANTES
		mediaFilhos = somatorioFilhos / HABITANTES
		percentualAteCem = (percentualAteCem / HABITANTES) * 100
		escreva("\nA média do salário dos habitantes é de R$ ", 
		mat.arredondar(mediaSalario, 2), 
		"\nA média de filhos dos habitantes é de ", 
		mat.arredondar(mediaFilhos, 2),
		"\nO maior salário entre os habitantes é de R$ ", maiorSalario,
		"\nO percentual de habitantes com salário de até R$ 100 é de ", 
		mat.arredondar(percentualAteCem, 2), "%\n")
		
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 614; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */