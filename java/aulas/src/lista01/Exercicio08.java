package lista01;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double custoFabrica, custoConsumidor;
		
		System.out.print("Informe o custo de fábrica: ");
		custoFabrica = ler.nextDouble();
		
		custoConsumidor = custoFabrica + custoFabrica*0.28 + custoFabrica*0.45;
		
		System.out.printf("O custo do carro ao consumidor final é de R$ %.2f",
				custoConsumidor);
		ler.close();
		
	}

}

/*
	O custo ao consumidor de um carro novo é a soma do custo de fábrica 
	com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
	escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor. 
*/
