package lista01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int anos, meses, dias, totalEmDias;

		System.out.print("Informe o total da sua idade em dias: ");
		totalEmDias = ler.nextInt();
		
		anos = totalEmDias / 365;
		meses = (totalEmDias % 365) / 30;
		dias = (totalEmDias % 365) % 30;
		
		System.out.printf("A idade aproximada é de %d anos, %d meses e %d dias", 
				anos, meses, dias);
		ler.close();

	}

}

/*
	Faça um sistema que leia a idade de uma pessoa expressa em dias 
	e mostre-a expressa em anos, meses e dias.
*/
