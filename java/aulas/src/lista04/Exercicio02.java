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
			
			System.out.printf("Lan�amento %d: %d\n", contador+1, lancamentos[contador]);	
		}
		
		media = (double) somatorio / (double) lancamentos.length;
		System.out.printf("\nM�dia dos n�meros lan�ados � %.2f\n"
				+ "O maior n�mero lan�ado � %d e foi lan�ado %d vez(es)\n", 
		media, maior, qtdMaior);
		
		ler.close();

	}

}

/*
	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
	Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
	A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, 
	contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.
*/
