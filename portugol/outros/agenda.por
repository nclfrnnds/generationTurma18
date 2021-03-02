programa
{
	inclua biblioteca Util

	funcao inicio()
	{
		cadeia agenda[31][24]
		inteiro dia, hora, opcao, atividades = 0

		escreva("AGENDA\n\n")
		
		faca {
		
		escreva("Informe o dia [1-31]: ")
		leia(dia)
		dia = dia - 1
		
		escreva("Informe a hora [0-23]: ")
		leia(hora)
		
		escreva("Informe sua anotação: ")
		leia(agenda[dia][hora])
		
		escreva("\nDigite: [1] Sim / [0] Não\n")
		escreva("Deseja continuar? ")
		leia(opcao)

		escreva("\n")
	   } enquanto(opcao != 0)

	escreva("AGENDA\n\n")
	
	para (inteiro contDia = 0; contDia < Util.numero_linhas(agenda); contDia++) {
		para (inteiro contHora = 0; contHora < Util.numero_colunas(agenda); contHora++) {
			se (agenda[contDia][contHora] != "") {
			escreva("Dia ", (contDia + 1),
			" às ", (contHora) +"h: ", agenda[contDia][contHora],"\n")
			atividades++
			}
		}
	}

	escreva("\nVocê tem " + atividades + " atividades este mês.\n")
	
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