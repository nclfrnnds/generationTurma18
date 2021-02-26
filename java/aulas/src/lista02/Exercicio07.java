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
			System.out.printf("O valor da �rea do tri�ngulo � de %.2f", area);
		} 
		else {
			System.out.printf("Os valores informados s�o inv�lidos");
		}
		
		ler.close();
		
	}

}

/*
	Receber valores de base e altura de um tri�ngulo e verificar se s�o valores v�lidos 
	(positivos maiores que zero). 
	Em caso afirmativo, calcular a �rea do tri�ngulo.
*/
