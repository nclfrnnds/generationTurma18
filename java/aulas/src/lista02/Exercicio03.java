package lista02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int num1, num2, num3, num4;
		
		System.out.println("Informe quatro números (separando pela tecla enter): ");
		num1 = ler.nextInt();
		num2 = ler.nextInt();
		num3 = ler.nextInt();
		num4 = ler.nextInt();
		
		if ((int)Math.pow(num3, 2) >= 1000) {
			System.out.printf("O quadrado de %d é %d", num3, (int)Math.pow(num3, 2));
		}
		else {
			System.out.printf("O quadrado de %d é %d\nO quadrado de %d é %d\n"
					+ "O quadrado de %d é %d\nO quadrado de %d é %d", 
					num1, (int)Math.pow(num1, 2), 
					num2, (int)Math.pow(num2, 2), 
					num3, (int)Math.pow(num3, 2),
					num4, (int)Math.pow(num4, 2));
		}
		
		ler.close();
		
	}

}

/*
	Desenvolva um sistema em que:
	- Leia 4 (quatro) números;
	- Calcule o quadrado de cada um;
	- Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
	- Caso contrário, imprima os valores lidos e seus respectivos quadrados.
*/
