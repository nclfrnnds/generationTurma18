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
			
			System.out.printf("Informe o sal�rio do habitante %d: ", contador);
			numSalario = ler.nextDouble();
			System.out.printf("Informe o n�mero de filhos: ");
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
		
		System.out.printf("\nA m�dia do sal�rio dos habitantes � de R$ %.2f"
				+ "\nA m�dia de filhos dos habitantes � de %.2f"
				+ "\nO maior sal�rio entre os habitantes � de R$ %.2f"
				+ "\nO percentual de habitantes com sal�rio de at� R$ 100 � de %.2f%%", 
		mediaSalario, mediaFilhos, maiorSalario, percentualAteCem);

		ler.close();
		
	}

}

/*
	A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
	coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:   
	a) m�dia do sal�rio da popula��o; 
	b) m�dia do n�mero de filhos; 
	c) maior sal�rio; 
	d) percentual de pessoas com sal�rio at� R$100,00.
*/
