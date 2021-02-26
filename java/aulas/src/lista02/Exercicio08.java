package lista02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int numero;
		
		System.out.print("Informe um número: ");
		numero = ler.nextInt();
		
		if (numero > 100) {
			System.out.printf("O número é %d", numero);
		} 
		else {
			numero = 0;
			System.out.printf("O número é %d", numero);
		}		
		
		ler.close();
		
	}

}

/*
	Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100,
	caso contrário imprimi-la com o valor zero.
*/
