// Digitar 5 números
// Mostrar a média

programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real numero, somatorio = 0.0, media = 0.0
		const inteiro quantidadeNumeros = 5
		
		para(inteiro i=1; i<=quantidadeNumeros; i++) {
			escreva("Informe um número: ")
			leia(numero)
			somatorio = somatorio + numero
			//media = somatorio / i
			//e5screva("A média do loop na posição ", i, " é ", media, "\n")
		}

		media = somatorio / quantidadeNumeros
		escreva("\nO somatório é: ", somatorio, 
		"\nA média é: ", mat.arredondar(media,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 193; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */