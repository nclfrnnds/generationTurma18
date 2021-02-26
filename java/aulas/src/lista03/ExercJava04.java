package lista03;

import java.util.Scanner;

public class ExercJava04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		final int TOTALPESSOAS = 6; // mudar para 150
		int idade, contador = 1,
		qtdTotalCalmas = 0, qtdFemininaNervosas = 0, qtdMasculinoAgressivos = 0, 
		qtdOutrasCalmas = 0, qtdNervosasMais40 = 0, qtdCalmasMenos18 = 0;
		char genero, caracteristica;
		
		while (contador <= TOTALPESSOAS) {
			
			System.out.printf("1) Informe a idade da pessoa %d: ", contador);
			idade = ler.nextInt();
			
			System.out.printf("\nOpções:"
					+ "\n- 1 para feminino"
					+ "\n- 2 para masculino"
					+ "\n- 3 para outros"
					+ "\n\n2) Informe o gênero da pessoa %d: ", contador);
			genero = ler.next().charAt(0);
			
			System.out.printf("\nOpções:"
					+ "\n- 1 para calma"
					+ "\n- 2 para nervosa"
					+ "\n- 3 para agressiva"
					+ "\n\n3) Informe a característica da pessoa %d: ", contador);
			caracteristica = ler.next().charAt(0);
			
			System.out.println("\n--------------------\n");
			
			if (caracteristica == '1') {
				qtdTotalCalmas++;
			}
			if ((genero == '1') && (caracteristica == '2')) {
				qtdFemininaNervosas++;
			}
			if ((genero == '2') && (caracteristica == '3')) {
				qtdMasculinoAgressivos++;
			}
			if ((genero == '3') && (caracteristica == '1')) {
				qtdOutrasCalmas++;
			}
			if ((caracteristica == '2') && (idade > 40)) {
				qtdNervosasMais40++;
			}
			if ((caracteristica == '1') && (idade < 18)) {
				qtdCalmasMenos18++;
			}
			
			contador++;
			
		}
		
		System.out.printf("Total de pessoas calmas: %d\n"
				+ "Total de mulheres nervosas: %d\n"
				+ "Total de homens agressivos: %d\n"
				+ "Total de outros calmos: %d\n"
				+ "Total de pessoas nervosas com mais de 40 anos: %d\n"
				+ "Total de pessoas calmas com menos de 18 anos: %d\n",
				qtdTotalCalmas, qtdFemininaNervosas, qtdMasculinoAgressivos,
				qtdOutrasCalmas, qtdNervosasMais40, qtdCalmasMenos18);

		ler.close();
	}

}

/*
	Uma empresa desenvolveu uma pesquisa para saber as características psicológicas 
	dos indivíduos de uma região. Para tanto, a cada uma das pessoas era perguntado: 
	idade, sexo (1-feminino / 2-masculino / 3-Outros), 
	e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
	Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
		- o número de pessoas calmas; 
		- o número de mulheres nervosas; 
		- o número de homens agressivos; 
		- o número de outros calmos;
		- o número de pessoas nervosas com mais de 40 anos; 
		- o número de pessoas calmas com menos de 18 anos.
*/
