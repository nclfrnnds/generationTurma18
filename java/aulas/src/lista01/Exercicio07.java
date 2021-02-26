package lista01;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double numA, numB, numC, numD, numE, numF, numX, numY;

		System.out.println("Informe seis valores (separando pela tecla enter): ");
		numA = ler.nextDouble();
		numB = ler.nextDouble();
		numC = ler.nextDouble();
		numD = ler.nextDouble();
		numE = ler.nextDouble();
		numF = ler.nextDouble();
		
		numX = (numC*numE - numB*numF) / (numA*numE - numB*numD);
		numY = (numA*numF - numC*numD) / (numA*numE - numB*numD);
		
		System.out.printf("O valor de X � %.2f e o valor de Y � %.2f", numX, numY);
		ler.close();
		
	}

}

/*
	Um sistema de equa��es lineares do tipo: 
		ax + by = c
		dx + ey = f
	pode ser resolvido segundo mostrado abaixo:
		x = (ce - bf) / (ae - bd)
		y = (af - cd) / (ee - bd)
	Escreva um sistema que l� os coeficientes a,b,c,d,e, f 
	e calcula e mostra os valores de x e y.
*/
