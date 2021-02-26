package lista02;

import java.util.Scanner;

public class ExercJava04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		System.out.print("Informe um número: ");
		numero = ler.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O número %d é par e sua raíz quadrada é %.2f.", 
					numero, Math.sqrt(numero));
		}
		else {
			System.out.printf("O número %d é ímpar e sua potência ao quadrado é %d.", 
					numero, (int)Math.pow(numero, 2));
		}

		ler.close();
		
	}

}

/*
	Faça um programa em que permita a entrada de um número 
	qualquer e exiba se este número é par ou ímpar. 
	Se for par exiba também a raiz quadrada do mesmo; 
	se for ímpar exiba o número elevado ao quadrado.
*/
