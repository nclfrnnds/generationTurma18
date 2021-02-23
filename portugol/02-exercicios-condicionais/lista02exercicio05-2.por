	/*

	A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias
	que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. 
	Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades,
	se o índice crescer para 0,4 as indústrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
	se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
	Faça um sistema que leia o índice de poluição medido e emita a notificação adequada 
	aos diferentes grupos de empresas.

	*/

programa
{
	
	funcao inicio()
	{
	
		inteiro categoria
		real indice

		escreva("Informe a categoria da indústria (1, 2 ou 3): ")
		leia(categoria)
		escreva("Informe o índice de poluição: ")
		leia(indice)

		escreva("Categoria: ", categoria, "\n",
			"Índice: ", indice, "\n")

		se ((indice >= 0.05 e indice <= 0.25) e
		(categoria == 1 ou categoria == 2 ou categoria == 3))
		{
			escreva("A indústria está com o índice dentro do padrão")
		}
		senao se ((indice >= 0.3 e categoria == 1) 
		ou (indice >= 0.4 e (categoria == 1 ou categoria == 2))
		ou (indice >= 0.5 e (categoria == 1 ou categoria == 2 ou categoria == 3)))
		{
			escreva("A indústria deve suspender suas atividades")
		}
		senao {
			escreva("Você informou algum dado divergente")
		}
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 670; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */