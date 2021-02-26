package lista03;

import java.util.Scanner;

public class ExercJava06 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero, totalMult3 = 0;
		double somatorioMult3 = 0, mediaMult3 = 0;
		
		do {
			System.out.print("Informe um número: ");
			numero = ler.nextInt();
			
			if ((numero % 3 == 0) && (numero != 0)) {
				somatorioMult3 += numero;
				totalMult3++;
				mediaMult3 += numero / totalMult3;
			}
		}
		while (numero != 0);
		
		if (totalMult3 == 0) {
			System.out.printf("Não foi digitado nenhum número múltiplo de 3.");
		}
		else {
			mediaMult3 = somatorioMult3 / totalMult3;
			System.out.printf("A média dos números digitados que são múltiplos de 3 é de %.2f.", mediaMult3);
		}

		ler.close();
	}

}

/*
	Escrever um programa que receba vários números inteiros no teclado. 
	E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
*/
