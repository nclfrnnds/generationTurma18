package lista03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, soma = 0, contador = 1;

		System.out.print("Informe um n�mero: ");
		numero = ler.nextInt();
		
		do 
		{
			//System.out.printf("%d\n", contador);
			soma = soma + contador;
			contador++;
		}
		while (contador <= numero);
		
		System.out.printf("A soma dos n�meros de 1 a %d � %d", numero, soma);

		ler.close();
		
	}

}

/*
	Fa�a um programa que pegue um n�mero do teclado e calcule a soma de todos os n�meros de 1 at� ele. 
	Ex.: o usu�rio entra 7, o programa vai mostrar 28, pois  1+2+3+4+5+6+7=28.
*/
