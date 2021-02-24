package lista01;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int totalSegundos, segundos, minutos, horas;
		
		System.out.print("Informe o total de segundos do evento: ");
		totalSegundos = ler.nextInt();
		
		horas = totalSegundos / 3600;
		minutos = (totalSegundos % 3600) / 60;
		segundos = (totalSegundos % 3600) % 60;
		
		System.out.printf("A dura��o do evento da f�brica � de %d hora(s), %d minuto(s) e %d segundo(s)", 
				horas, minutos, segundos);
		
	}

}

/*
	Fa�a um sistema que leia o tempo de dura��o de um evento em uma f�brica 
	expressa em segundos e mostre-o expresso em horas, minutos e segundos.
*/
