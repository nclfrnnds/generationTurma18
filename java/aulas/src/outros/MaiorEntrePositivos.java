package outros;

import java.util.Scanner;

public class MaiorEntrePositivos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, maior = 0;
		
		do {
			System.out.print("Informe um número positivo: ");
			numero = ler.nextInt();
			
			if (numero >= maior) {
				maior = numero;
			}
		} while (numero >= 0);
		
			System.out.printf("\nO maior número digitado é o %d", maior);
		
		ler.close();
		
	}

}

