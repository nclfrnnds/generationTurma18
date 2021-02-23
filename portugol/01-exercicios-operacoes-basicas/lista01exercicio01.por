/*
	Faça um sistema que leia a idade de uma pessoa expressa em anos,
	meses e dias e mostre-a expressa apenas em dias. 
*/

programa
{
	
	inclua biblioteca Calendario --> cal
	
	funcao inicio()
	{
		
		inteiro anos, meses, dias, totalEmDias
		inteiro diaNascimento, mesNascimento, anoNascimento, totalEmDias2, totalEmDias3

		// cálculo usando os dias, meses e anos em números

		escreva("Informe os anos: ")
		leia(anos)
		escreva("Informe os meses: ")
		leia(meses)
		escreva("Informe os dias: ")
		leia(dias)

		totalEmDias = (anos * 365) + (meses * 30) + (dias)
		escreva("O total da sua idade em dias é de ", totalEmDias, "\n")

		// cálculo usando a data de nascimento

		escreva("Informe o dia: ")
		leia(diaNascimento)
		escreva("Informe o mês: ")
		leia(mesNascimento)
		escreva("Informe o ano: ")
		leia(anoNascimento)

		// usando a função da biblioteca

		totalEmDias2 = ((cal.ano_atual() - anoNascimento) * 365) + 
				     ((cal.mes_atual() - mesNascimento) * 30) + 
					(cal.dia_mes_atual() - diaNascimento)

		// usando a data fixa

		totalEmDias3 = ((2021 - anoNascimento) * 365) + 
				     ((2 - mesNascimento) * 30) + 
					(16 - diaNascimento)
		
		escreva("O total da sua idade em dias é de ", totalEmDias2, " - ", totalEmDias3)
		
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 70; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */