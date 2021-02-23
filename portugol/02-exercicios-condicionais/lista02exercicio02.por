	/*

	Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas
	trabalhadas de um operário.
	E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
	Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E,
	caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
	No final do processamento imprimir o salário total e o salário excedente.

	*/

programa
{

	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		inteiro horas, horasExcedentes,
		salario, salarioExcedente // , codigo

		//escreva("Informe o código do operário: ")
		//leia(codigo)
		escreva("Informe o número de horas trabalhadas: ")
		leia(horas)

		//escreva("Código do operário: ", codigo, "\n")

		se (horas > 50)
		{
			salario = 50 * 10
			horasExcedentes = horas - 50
			salarioExcedente = (horasExcedentes * 20)
		}
		senao
		{
			salario = (horas * 10)
			horasExcedentes = 0
			salarioExcedente = 0
		}

		escreva("Horas trabalhadas: ", horas, " horas\n",
		"Salário: R$ ", salario, 
		"\nSalário excedente: R$ ", salarioExcedente)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */