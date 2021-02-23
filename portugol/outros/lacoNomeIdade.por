programa
{	
	funcao inicio()
	{
		cadeia nome
		inteiro ano
		caracter codigo = 's'
		const inteiro ANOATUAL = 2021

		enquanto ((codigo != 'n') e (codigo != 'N'))
		{
			escreva("Informe seu nome: ")
			leia(nome)
			escreva("Informe seu ano de nascimento: ")
			leia(ano)

			escreva("Seu nome é ", nome, "\n")
			escreva("Sua idade é ", (ANOATUAL - ano), "\n")
			
			escreva("Deseja inserir outro nome? Digite s ou n: ")
			leia(codigo)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 120; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */