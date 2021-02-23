programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Calendario --> cal

	funcao inicio()
	{
		inteiro diaAtual = cal.dia_mes_atual()
		inteiro mesAtual = cal.mes_atual()
		inteiro anoAtual = cal.ano_atual()
		inteiro diaNascimento, mesNascimento, anoNascimento

		escreva("Informe o dia de nascimento: ")
		leia(diaNascimento)
		escreva("Informe o mês de nascimento: ")
		leia(mesNascimento)
		escreva("Informe o ano de nascimento: ")
		leia(anoNascimento)

		escreva("Hoje é ", diaAtual, "/", mesAtual, "/", anoAtual, "\n")
		escreva("Você nasceu em ", diaNascimento, "/", mesNascimento, "/", anoNascimento)
	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 622; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */