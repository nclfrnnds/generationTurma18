package lista03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, soma = 0, contador = 1;

		System.out.print("Informe um número: ");
		numero = ler.nextInt();
		
		do 
		{
			//System.out.printf("%d\n", contador);
			soma = soma + contador;
			contador++;
		}
		while (contador <= numero);
		
		System.out.printf("A soma dos números de 1 a %d é %d", numero, soma);

		ler.close();
		
	}

}

/*
	Faça um programa que pegue um número do teclado e calcule a soma de todos os números de 1 até ele. 
	Ex.: o usuário entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
*/
