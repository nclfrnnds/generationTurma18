	/*

	Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	- Infantil A = 5 a 7 anos
	- Infantil B = 8 a 11 anos
	- Juvenil A = 12 a 13 anos
	- Juvenil B = 14 a 17 anos
	- Adultos = Maiores de 18 anos

	*/

programa
{
	
	funcao inicio()
	{
	
		inteiro idade

		escreva("Informe a idade do nadador: ")
		leia(idade)

		escreva("A idade é: ", idade, "\n")

		se (idade < 5)
		{
			escreva("A idade não faz parte de nenhuma categoria.")
		}
		senao se (idade <= 7)
		{
			escreva("Categoria: Infantil A")
		} 
		senao se (idade <= 11) 
		{
			escreva("Categoria: Infantil B")
		} 
		senao se (idade <= 13) 
		{
			escreva("Categoria: Juvenil A")
		} 
		senao se (idade <= 17)
		{
			escreva("Categoria: Juvenil B")
		} 
		senao se (idade >= 18)
		{
			escreva("Categoria: Adultos")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 717; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */