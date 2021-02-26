package lista03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero = 0, somatorio = 0, media = 0;
		int total = 0;
		
		while (numero >= 0) {
			System.out.print("Informe um número positivo: ");
			numero = ler.nextDouble();
			
			if (numero >= 0) {
				somatorio = somatorio + numero;
				total++;
			}
		}

		if (total != 0.0) {
			media = somatorio / total;
		}
		
		System.out.printf("\nTotal de números positivos: %d"
				+ "\nSomatório dos números positivos: %.2f"
				+ "\nMédia dos números positivos: %.2f", 
				total, somatorio, media);

		ler.close();
		
	}

}

/*
	Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente 
	no final o total do somatório, a média e o total de valores lidos. 
	O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores positivos.
	Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
*/
