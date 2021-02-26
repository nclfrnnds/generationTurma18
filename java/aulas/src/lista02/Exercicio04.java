package lista02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero;
		
		System.out.print("Informe um n�mero inteiro: ");
		numero = ler.nextInt();
		
		if (numero == 0) {
			System.out.printf("O n�mero � zero");
		}
		else if (numero % 2 == 0) {
			if (numero > 0) {
				System.out.printf("O n�mero %d � par e positivo", numero);
			} 
			else {
				System.out.printf("O n�mero %d � par e negativo", numero);
			}
		} 
		else {
			if (numero > 0) {
				System.out.printf("O n�mero %d � �mpar e positivo", numero);
			} 
			else {
				System.out.printf("O n�mero %d � �mpar e negativo", numero);
			}
		}
		
		ler.close();
		
	}

}

/*
	Fa�a um sistema que leia um n�mero inteiro e mostre uma mensagem indicando se 
	este n�mero � par ou �mpar, e se � positivo ou negativo.
*/
