package lista04;

import java.util.Scanner;

public class Exercicio03 {
	
	static final int QTDLINHA = 4, QTDCOLUNA = 6;

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int N1[][] = new int[QTDLINHA][QTDCOLUNA];
		int N2[][] = new int[QTDLINHA][QTDCOLUNA];
		int M1[][] = new int[QTDLINHA][QTDCOLUNA];
		int M2[][] = new int[QTDLINHA][QTDCOLUNA];
		
		for (int linha = 0; linha<QTDLINHA; linha++)
		{
			for (int coluna = 0; coluna<QTDCOLUNA; coluna++)
			{		
				N1[linha][coluna] = (int) (Math.random() * 9)+1;
				N2[linha][coluna] = (int) (Math.random() * 9)+1;
				
				M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
				M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
			}
		}
		
		System.out.println("Matriz N1");
		escreverMatriz(N1);
		
		System.out.println("\nMatriz N2");
		escreverMatriz(N2);
	
		System.out.println("\nMatriz M1");
		escreverMatriz(M1);
		
		System.out.println("\nMatriz M2");
		escreverMatriz(M2);
		
		ler.close();

	}
	
	public static void escreverMatriz(int matriz[][]) {
		for (int linha = 0; linha<QTDLINHA; linha++)
		{
			for (int coluna = 0; coluna<QTDCOLUNA; coluna++)
			{
				System.out.printf("%d ", matriz[linha][coluna]);
			}
		System.out.println("");
		}
	}

}

/*
	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
	a) Uma matriz M1 cujos elementos serão as somas dos elementos 
		de mesma posição das matrizes N1 e N2;
	b) Uma matriz M2 cujos elementos serão as diferenças dos elementos 
		de mesma posição das matrizes N1 e N2.
*/
