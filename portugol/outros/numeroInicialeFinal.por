programa
{

    funcao inicio()
    {
        inteiro numeroInicio, numeroFim

        escreva("Numero inicial: ")
        leia(numeroInicio)
        escreva("Numero final: ")
        leia(numeroFim)

        se (numeroInicio < numeroFim)
        {
            enquanto (numeroInicio <= numeroFim)
            {
               escreva(numeroInicio, " ")
               numeroInicio++
            }
        } 
        senao 
        {
            enquanto (numeroFim <= numeroInicio)
            {
               escreva(numeroInicio, " ")
               numeroInicio--
            }
	   }

    }

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */