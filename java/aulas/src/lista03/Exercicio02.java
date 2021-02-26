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

		System.out.printf("A soma dos n�meros de 1 a 500 que s�o m�ltiplos de 3 � %d", soma);

		ler.close();
		
	}

}

/*
	Desenvolver um sistema que efetue a soma de todos os n�meros �mpares que s�o m�ltiplos
	de tr�s e que se encontram no conjunto dos n�meros de 1 at� 500.
*/
