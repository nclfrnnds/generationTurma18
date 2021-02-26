package lista03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero = 0, somatorio = 0, media = 0;
		int total = 0;
		
		while (numero >= 0) {
			System.out.print("Informe um n�mero positivo: ");
			numero = ler.nextDouble();
			
			if (numero >= 0) {
				somatorio = somatorio + numero;
				total++;
			}
		}

		if (total != 0.0) {
			media = somatorio / total;
		}
		
		System.out.printf("\nTotal de n�meros positivos: %d"
				+ "\nSomat�rio dos n�meros positivos: %.2f"
				+ "\nM�dia dos n�meros positivos: %.2f", 
				total, somatorio, media);

		ler.close();
		
	}

}

/*
	Elaborar um programa que efetue a leitura sucessiva de valores num�ricos e apresente 
	no final o total do somat�rio, a m�dia e o total de valores lidos. 
	O programa deve fazer as leituras dos valores enquanto o usu�rio estiver fornecendo valores positivos.
	Ou seja, o programa deve parar quando o usu�rio fornecer um valor negativo.
*/
