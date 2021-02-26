package lista02;

import java.util.Scanner;

public class ExercJava01 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2, num3, maior = 0;
		
		System.out.println("Informe três números (separados pela tecla enter): ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			maior = num1;
		}
		else if (num2 >= num1 && num2 >= num3) {
			maior = num2;
		}
		else if (num3 >= num1 && num3 >= num2){
			maior = num3;
		}
		
		System.out.printf("O maior número é %d", maior);
		
		ler.close();
		
	}

}

/*
	Faça um programa que receba três inteiros e diga qual deles é o maior.
*/
