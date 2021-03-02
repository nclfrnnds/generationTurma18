package lista04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		final int TAMANHO = 3;
		int matriz[][] = new int[TAMANHO][TAMANHO];
		int somaDiagonal = 0;

		for (int contadorLinha = 0; contadorLinha < TAMANHO; contadorLinha++)
		{
			for (int contadorColuna = 0; contadorColuna < TAMANHO; contadorColuna++)
			{
				System.out.printf("Informe o numero %d da linha %d: ", contadorLinha+1, contadorColuna+1);
				matriz[contadorLinha][contadorColuna] = ler.nextInt();
			}
		}

		System.out.println("");

		for (int contadorLinha = 0; contadorLinha < TAMANHO; contadorLinha++)
		{		
			for (int contadorColuna = 0; contadorColuna < TAMANHO; contadorColuna++)
			{
				System.out.printf("%d ", matriz[contadorLinha][contadorColuna]);
				if (contadorLinha == contadorColuna) {
					somaDiagonal = somaDiagonal + matriz[contadorLinha][contadorColuna];
				}
			}
			System.out.println("");
		}

		System.out.printf("\nSoma dos números da diagonal: %d", somaDiagonal);
		
		ler.close();

	}

}

/*
	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
	e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
	ou seja, diagonal principal.
*/
