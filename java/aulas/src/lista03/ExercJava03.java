package lista03;

import java.util.Scanner;

public class ExercJava03 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int idade = 0, totalPessoas = 0, menos20 = 0, mais50 = 0;
		
		while (idade != -99) {
			
			System.out.print("Informe a idade: ");
			idade = ler.nextInt();
			
			if ((idade >= 0) && (idade < 21)) {
				menos20++;
			} 
			else if (idade > 50) {
				mais50++;
			}
			
			if (idade >= 0) {
				totalPessoas++;
			}
			
		}

		System.out.printf("Total de pessoas informadas: %d\n"
				+ "Total de pessoas com menos de 21 anos: %d\n"
				+ "Total de pessoas com mais de 50 anos: %d",
				totalPessoas, menos20, mais50);
		
		ler.close();
	}

}

/*
	Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
	Total de pessoas com mais de 50 anos. O programa termina quando a idade for =-99. (WHILE)
*/
