package lista01;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numA, numB, numC, numD, numR, numS;
		
		System.out.print("Digite o n�mero A: ");
		numA = ler.nextInt();
		System.out.print("Digite o n�mero B: ");
		numB = ler.nextInt();
		System.out.print("Digite o n�mero C: ");
		numC = ler.nextInt();
		
		numR = (int) Math.pow((numA + numB), 2);
		numS = (int)Math.pow((numB + numC), 2);
		numD = (numR + numS) / 2;
		
		System.out.printf("O resultado � %d", numD);
		
	}

}

/*
	Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) 
	e calcule a seguinte express�o: D = (R + S) / 2, onde 
	R = (A + B)�
	S = (B + C)�
*/
