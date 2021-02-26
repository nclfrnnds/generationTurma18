package lista02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double base, altura, area;
		
		System.out.print("Informe a base: ");
		base = ler.nextDouble();
		
		System.out.print("Informe a altura: ");
		altura = ler.nextDouble();
		
		if ((base > 0) && (altura > 0)) {
			area = (base * altura) / 2;
			System.out.printf("O valor da área do triângulo é de %.2f", area);
		} 
		else {
			System.out.printf("Os valores informados são inválidos");
		}
		
		ler.close();
		
	}

}

/*
	Receber valores de base e altura de um triângulo e verificar se são valores válidos 
	(positivos maiores que zero). 
	Em caso afirmativo, calcular a área do triângulo.
*/
