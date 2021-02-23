/*
	Faça um sistema que leia o tempo de duração de um evento em uma fábrica 
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/

programa
{
	
	funcao inicio()
	{

		inteiro totalSegundos, segundos, minutos, horas
		
		escreva("Informe o total de segundos do evento: ")
		leia(totalSegundos)

		horas = totalSegundos / 3600
		minutos = (totalSegundos % 3600) / 60
		segundos = (totalSegundos % 3600) % 60

		escreva("A duração do evento da fábrica é de ", horas,
		" hora(s), ", minutos, " minuto(s) ", segundos, " e segundo(s)")
	
	}
	
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 78; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */