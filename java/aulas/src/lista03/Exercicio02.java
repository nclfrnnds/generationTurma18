package lista03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int soma = 0;
		
		for (int numero = 1; numero <= 500; numero++) 
		{

			if ((numero % 2 != 0) && (numero % 3 == 0)) 
			{
				//System.out.println(numero);
				soma += numero;
			}
		}

		System.out.printf("A soma dos números de 1 a 500 que são múltiplos de 3 é %d", soma);

		ler.close();
		
	}

}

/*
	Desenvolver um sistema que efetue a soma de todos os números ímpares que são múltiplos
	de três e que se encontram no conjunto dos números de 1 até 500.
*/
