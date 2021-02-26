package lista02;

import java.util.Scanner;

public class ExercJava03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;
		
		System.out.print("Informe a idade: ");
		idade = ler.nextInt();
		
		if ((idade < 10) || (idade > 25)) {
			System.out.printf("A idade informada n�o faz parte de nenhuma categoria.");
		}
		else if (idade <= 14) {
			System.out.printf("A idade � %d anos e faz parte da categoria infantil.", idade);
		}
		else if (idade <= 17) {
			System.out.printf("A idade � %d anos e faz parte da categoria juvenil.", idade);
		}
		else if (idade <= 25) {
			System.out.printf("A idade � %d anos e faz parte da categoria adulto.", idade);
		}
		
		ler.close();
		
	}

}

/*
	Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
		10-14 infantil
		15-17 juvenil
		18-25 adulto
*/
