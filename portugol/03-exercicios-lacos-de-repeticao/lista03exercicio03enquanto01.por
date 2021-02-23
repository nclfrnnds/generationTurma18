/*
	Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente 
	no final o total do somatório, a média e o total de valores lidos. 
	O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos.
	Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
*/

programa
{
	funcao inicio()
	{

		real numero = 1.0, somatorio = 0.0, media = 0.0
		inteiro total = 0
		
		enquanto (numero > 0) {
			escreva("Informe um número positivo: ")
			leia(numero)
			se (numero > 0) {
				somatorio = somatorio + numero
				total++
			}
		}

		se (total != 0.0) {
			media = somatorio / total
		}

		escreva("\nTotal de números positivos: ", total,
		"\nSomatório dos números positivos: ", somatorio,
		"\nMédia dos números positivos: ", media)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 820; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */