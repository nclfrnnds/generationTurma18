	/*

	João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
	Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo
	(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
	João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso.
	Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
	Caso contrário mostrar tais variáveis com o conteúdo ZERO.

	*/

programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{

		real peso = 0.0, excesso = 0.0, multa = 0.0
		const inteiro LIMITE = 50, VALORMULTA = 4 

		escreva("Informe o peso de tomates: ")
		leia(peso)

		se (mat.arredondar(peso,0) > LIMITE) 
		{
			excesso = mat.arredondar(peso,0) - LIMITE
			multa = excesso * VALORMULTA
		} 

		escreva("O peso é de ", peso, ", o excesso é ", 
		excesso, " e a multa é de R$ ", multa, " reais")
		
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 712; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */