package lista03;

import java.util.Scanner;

public class ExercJava06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, totalMult3 = 0;
		double somatorioMult3 = 0, mediaMult3 = 0;
		
		do {
			System.out.print("Informe um n�mero: ");
			numero = ler.nextInt();
			
			if ((numero % 3 == 0) && (numero != 0)) {
				somatorioMult3 += numero;
				totalMult3++;
				mediaMult3 += numero / totalMult3;
			}
		}
		while (numero != 0);
		
		if (totalMult3 == 0) {
			System.out.printf("N�o foi digitado nenhum n�mero m�ltiplo de 3.");
		}
		else {
			mediaMult3 = somatorioMult3 / totalMult3;
			System.out.printf("A m�dia dos n�meros digitados que s�o m�ltiplos de 3 � de %.2f.", mediaMult3);
		}

		ler.close();
	}

}

/*
	Escrever um programa que receba v�rios n�meros inteiros no teclado. 
	E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/
