package lista02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int numero;
		
		System.out.print("Informe um n�mero: ");
		numero = ler.nextInt();
		
		if (numero > 100) {
			System.out.printf("O n�mero � %d", numero);
		} 
		else {
			numero = 0;
			System.out.printf("O n�mero � %d", numero);
		}		
		
		ler.close();
		
	}

}

/*
	Construa um sistema para ler uma vari�vel num�rica N e imprimi-la somente se a mesma for maior que 100,
	caso contr�rio imprimi-la com o valor zero.
*/
