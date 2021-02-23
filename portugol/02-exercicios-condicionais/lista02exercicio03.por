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

		inteiro num1, num2, num3, num4, 
		quadrado1, quadrado2, quadrado3, quadrado4

		escreva("Informe quatro números (separando pela tecla enter): \n")
		leia(num1, num2, num3, num4)
		
		quadrado1 = mat.potencia(num1, 2)
		quadrado2 = mat.potencia(num2, 2)
		quadrado3 = mat.potencia(num3, 2)
		quadrado4 = mat.potencia(num4, 2)

		se (quadrado3 >= 1000)
		{
			escreva("O quadrado de ", num3, " é ", quadrado3)
		}
		senao
		{
			escreva("O quadrado de ", num1, " é ", quadrado1, "\n",
			"O quadrado de ", num2, " é ", quadrado2, "\n",
			"O quadrado de ", num3, " é ", quadrado3, "\n",
			"O quadrado de ", num4, " é ", quadrado4, "\n")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 692; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */