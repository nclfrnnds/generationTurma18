programa
{
	funcao inicio()
	{
		const inteiro QTDALUNO = 4
		const inteiro QTDNOTA = 4

		inteiro posicaoAluno
		inteiro posicaoNota

		cadeia disciplinas[QTDNOTA] = {"Português", "Matemática", "Ciências", "Artes"}
		cadeia alunos[QTDALUNO]
		inteiro notas[QTDALUNO][QTDNOTA]
		inteiro somaNotas[QTDALUNO]
		inteiro medias[QTDALUNO]
		
		para (posicaoAluno = 0; posicaoAluno < QTDALUNO; posicaoAluno++) 
		{
			escreva("Informe o nome do/a aluno/a ", posicaoAluno+1, ": ")
			leia(alunos[posicaoAluno])

			para (posicaoNota = 0; posicaoNota < QTDNOTA; posicaoNota++) 
			{
				escreva("Informe a nota do/a aluno/a em ", disciplinas[posicaoNota], ": ")
				leia(notas[posicaoAluno][posicaoNota])
				somaNotas[posicaoAluno] = somaNotas[posicaoAluno] + notas[posicaoAluno][posicaoNota]
			}
			
			medias[posicaoAluno] = somaNotas[posicaoAluno] / QTDNOTA
			escreva("\n")
		}

		para (posicaoAluno = 0; posicaoAluno < QTDALUNO; posicaoAluno++) 
		{
			escreva("\nAluno/a: ", alunos[posicaoAluno])
			para (posicaoNota = 0; posicaoNota < QTDNOTA; posicaoNota++) 
			{
				escreva("\nNota em ", disciplinas[posicaoNota], ": ", notas[posicaoAluno][posicaoNota])
			}
			escreva("\nMédia do aluno/a: ", medias[posicaoAluno])
			situacao(medias[posicaoAluno])
			escreva("\n")
		}
	}

	funcao situacao(inteiro nota) {
		se (nota >= 5) {
			escreva("\nAluno está ok, pode avançar!")
		}
		senao {
			escreva("\nAinda não está ok, continue estudando!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 88; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */