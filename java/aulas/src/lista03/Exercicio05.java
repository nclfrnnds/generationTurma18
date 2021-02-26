package lista03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 233;
				
		do 
		{
			System.out.printf("%d\n", numero);
			if ((numero >= 300) && (numero <= 400)) 
			{
				numero += 3;
			}
			else 
			{
				numero += 5;
			}
		
		} 
		while (numero <= 456);

		ler.close();
		
	}

}

/*
	Faça um programa que mostre uma contagem na tela de 233 a 456, 
	só que contando de 3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
*/
