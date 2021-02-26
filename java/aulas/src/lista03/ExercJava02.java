package lista03;

import java.util.Scanner;

public class ExercJava02 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, pares = 0, impares = 0;
		
		for (int contador = 1; contador <= 10; contador++) {
			System.out.printf("%d) Informe um valor: ", contador);
			numero = ler.nextInt();
			
			if (numero % 2 == 0) {
				pares++;
			}
			else {
				impares++;
			}
		}

		System.out.printf("\nVocê digitou %d números pares e %d números ímpares.", pares, impares);
		
		ler.close();
	}

}

/*
	Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
*/
