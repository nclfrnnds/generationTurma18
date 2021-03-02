package lista04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		final int QTDLANC = 10;
		int lancamentos[] = new int[QTDLANC];
		int qtdMaior = 0, somatorio = 0, maior = 0;
		double media;

		for (int contador = 0; contador < lancamentos.length; contador++)
		{
			lancamentos[contador] = (int) (Math.random() * 6) + 1;
			
			somatorio = somatorio + lancamentos[contador];
						
            if (lancamentos[contador] >= maior) {
                if (lancamentos[contador] > maior) {
                    qtdMaior = 0;
                }
                maior = Math.max(maior, lancamentos[contador]);
                qtdMaior ++;
            }
			
			System.out.printf("Lançamento %d: %d\n", contador+1, lancamentos[contador]);	
		}
		
		media = (double) somatorio / (double) lancamentos.length;
		System.out.printf("\nMédia dos números lançados é %.2f\n"
				+ "O maior número lançado é %d e foi lançado %d vez(es)\n", 
		media, maior, qtdMaior);
		
		ler.close();

	}

}

/*
	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
	Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
	A seguir determine e imprima a média aritmética dos lançamentos, 
	contabilize e apresente também quantas foram as ocorrências da maior pontuação.
*/
