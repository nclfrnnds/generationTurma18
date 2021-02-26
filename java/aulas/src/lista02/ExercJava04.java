package lista02;

import java.util.Scanner;

public class ExercJava04 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero, potenciaImpar;
		double raizPar;
		
		System.out.print("Informe um n�mero: ");
		numero = ler.nextInt();
		raizPar = Math.sqrt(numero);
		potenciaImpar = (int)Math.pow(numero, 2);
		
		if (numero % 2 == 0) {
			System.out.printf("O n�mero %d � par e sua ra�z quadrada � %.2f.", numero, raizPar);
		}
		else {
			System.out.printf("O n�mero %d � �mpar e sua pot�ncia ao quadrado � %d.", numero, potenciaImpar);
		}

		ler.close();
		
	}

}

/*
	Fa�a um programa em que permita a entrada de um n�mero 
	qualquer e exiba se este n�mero � par ou �mpar. 
	Se for par exiba tamb�m a raiz quadrada do mesmo; 
	se for �mpar exiba o n�mero elevado ao quadrado.
*/
