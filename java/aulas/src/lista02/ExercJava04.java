package lista02;

import java.util.Scanner;

public class ExercJava04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero, potenciaImpar;
		double raizPar;
		
		System.out.print("Informe um número: ");
		numero = ler.nextInt();
		raizPar = Math.sqrt(numero);
		potenciaImpar = (int)Math.pow(numero, 2);
		
		if (numero % 2 == 0) {
			System.out.printf("O número %d é par e sua raíz quadrada é %.2f.", numero, raizPar);
		}
		else {
			System.out.printf("O número %d é ímpar e sua potência ao quadrado é %d.", numero, potenciaImpar);
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
