package lista03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0;

		System.out.print("Informe um número: ");
		numero = ler.nextInt();
		
		System.out.printf("%d ", numero);
		while (numero <= 100) {
			numero = numero * 3;
			System.out.printf("%d ", numero);
		}

		ler.close();
		
	}

}

/*
	Obtenha um número digitado pelo usuário e repita a operação de multiplicar ele por três  
	(imprimindo o novo valor) até que ele seja maior do que 100. 
	Ex.: se o usuário digita 5, deveremos observar na tela a seguinte sequência: 5 15 45 135.
*/
