package lista03;

import java.util.Scanner;

public class ExercJava05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, somatorio = 0;
		
		do {		
			System.out.print("Informe um n�mero: ");
			numero = ler.nextDouble();
			somatorio += numero;	
		} 
		while (numero != 0);

		System.out.printf("O somat�rio dos n�meros digitados �: %.2f", somatorio);
		
		ler.close();
	}

}

/*
	Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
	No final, mostre a soma dos n�meros digitados.(DO...WHILE)
*/
