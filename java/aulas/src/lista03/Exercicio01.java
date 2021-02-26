package lista03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numFilhos = 0;
		double numSalario = 0, maiorSalario = 0, percentualAteCem = 0,
				somatorioSalario = 0, somatorioFilhos = 0,
				mediaSalario = 0, mediaFilhos = 0;
		final int HABITANTES = 3; // testado com 3, mas deve ser modificado para 20 de acordo com o enunciado
		
		for (int contador = 1; contador <= HABITANTES; contador++) {
			
			System.out.printf("Informe o salário do habitante %d: ", contador);
			numSalario = ler.nextDouble();
			System.out.printf("Informe o número de filhos: ");
			numFilhos = ler.nextInt();
			
			somatorioSalario = somatorioSalario + numSalario;
			somatorioFilhos = somatorioFilhos + numFilhos;

			if (numSalario > maiorSalario) {
				maiorSalario = numSalario;
			}

			if (numSalario <= 100) {
				percentualAteCem++;
			}
			
		}
		
		mediaSalario = somatorioSalario / HABITANTES;
		mediaFilhos = somatorioFilhos / HABITANTES;
		percentualAteCem = (percentualAteCem / HABITANTES) * 100;
		
		System.out.printf("\nA média do salário dos habitantes é de R$ %.2f"
				+ "\nA média de filhos dos habitantes é de %.2f"
				+ "\nO maior salário entre os habitantes é de R$ %.2f"
				+ "\nO percentual de habitantes com salário de até R$ 100 é de %.2f%%", 
		mediaSalario, mediaFilhos, maiorSalario, percentualAteCem);

		ler.close();
		
	}

}

/*
	A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
	a) média do salário da população; 
	b) média do número de filhos; 
	c) maior salário; 
	d) percentual de pessoas com salário até R$100,00.
*/
