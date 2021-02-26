	/*

	Desenvolva um sistema em que:
	- Leia 4 (quatro) números;
	- Calcule o quadrado de cada um;
	- Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	- Caso contrário, imprima os valores lidos e seus respectivos quadrados.

	*/

programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		inteiro num1, num2, num3, num4

		escreva("Informe quatro números (separando pela tecla enter): \n")
		leia(num1, num2, num3, num4)

		se (mat.potencia(num3, 2) >= 1000)
		{
			escreva("O quadrado de ", num3, " é ", mat.potencia(num3, 2))
		}
		senao
		{
			escreva("O quadrado de ", num1, " é ", mat.potencia(num1, 2), "\n",
			"O quadrado de ", num2, " é ", mat.potencia(num2, 2), "\n",
			"O quadrado de ", num3, " é ", mat.potencia(num3, 2), "\n",
			"O quadrado de ", num4, " é ", mat.potencia(num4, 2), "\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 378; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */