package lista01;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double nota1, nota2, nota3, mediaPonderada;
		
		System.out.print("Informe a nota 1: ");
		nota1 = ler.nextDouble();
		System.out.print("Informe a nota 2: ");
		nota2 = ler.nextDouble();
		System.out.print("Informe a nota 3: ");
		nota3 = ler.nextDouble();
		
		mediaPonderada = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);
		
		System.out.printf("A m�dia ponderada do aluno � de %.2f", mediaPonderada);
		
	}

}

/*
	Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
	Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente.
*/
