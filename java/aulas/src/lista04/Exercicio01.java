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
			System.out.printf("Informe a pontuação %d: ", contador+1);
			pontuacoes[contador] = ler.nextInt();
			maiorPontuacao = Math.max(maiorPontuacao, pontuacoes[contador]);			
		}
		System.out.println("");
		
		for (int contador = 0; contador < 5; contador++)
		{
			System.out.printf("Pontuação %d: %d\n", contador+1, pontuacoes[contador]);
		}
		System.out.printf("A maior pontuação é: %d\n", maiorPontuacao);
		
		ler.close();

	}

}

/*
	Faça um programa que crie um vetor por leitura com 5 valores 
	de pontuação de uma atividade e o escreva em seguida. 
	Encontre após a maior pontuação e a apresente. 
*/
