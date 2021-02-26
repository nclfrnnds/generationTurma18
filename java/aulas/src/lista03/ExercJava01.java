package lista03;

import java.util.Scanner;

public class ExercJava01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 1000;
		
		for (int contador = numero; contador <= 1999; contador++) {
			if (numero % 11 == 5) {
				System.out.printf("%d\n", numero);
			}
			numero++;
		}

		ler.close();
	}

}

/*
	Informar todos os números de 1000 a 1999 que quando divididos por 11 obtemos resto = 5. (FOR)
*/
