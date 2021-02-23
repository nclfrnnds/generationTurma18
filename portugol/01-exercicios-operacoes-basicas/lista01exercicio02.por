/*
	Faça um sistema que leia a idade de uma pessoa expressa em dias 
	e mostre-a expressa em anos, meses e dias.
*/

programa
{
	
	funcao inicio()
	{

		inteiro dias, meses, anos, totalEmDias
	
		escreva("Informe o total de dias de vida: ")
		leia(totalEmDias)

		anos = totalEmDias / 365
		meses = (totalEmDias % 365) / 30
		dias = (totalEmDias % 365) % 30

		escreva("A idade aproximada é de ", anos, " anos, ",
		meses, " meses e ", dias, " dias")
	
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