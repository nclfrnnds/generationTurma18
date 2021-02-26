package lista03;

import java.util.Scanner;

public class ExercJava05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, somatorio = 0;
		
		do {		
			System.out.print("Informe um número: ");
			numero = ler.nextDouble();
			somatorio += numero;	
		} 
		while (numero != 0);

		System.out.printf("O somatório dos números digitados é: %.2f", somatorio);
		
		ler.close();
	}

}

/*
	Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
	No final, mostre a soma dos números digitados.(DO...WHILE)
*/
