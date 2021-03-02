package lista04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		final int QTDVALORES = 5;
		int pontuacoes[] = new int[QTDVALORES];
		int maiorPontuacao = 0;

		for (int contador = 0; contador < QTDVALORES; contador++)
		{
			System.out.printf("Informe a pontua��o %d: ", contador+1);
			pontuacoes[contador] = ler.nextInt();
			maiorPontuacao = Math.max(maiorPontuacao, pontuacoes[contador]);			
		}
		System.out.println("");
		
		for (int contador = 0; contador < 5; contador++)
		{
			System.out.printf("Pontua��o %d: %d\n", contador+1, pontuacoes[contador]);
		}
		System.out.printf("A maior pontua��o �: %d\n", maiorPontuacao);
		
		ler.close();

	}

}

/*
	Fa�a um programa que crie um vetor por leitura com 5 valores 
	de pontua��o de uma atividade e o escreva em seguida. 
	Encontre ap�s a maior pontua��o e a apresente. 
*/
