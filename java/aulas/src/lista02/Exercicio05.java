package lista02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		//int categoria;
		double indice;
		
		//System.out.print("Informe a categoria da ind�stria (1, 2 ou 3): ");
		//categoria = ler.nextInt();
		System.out.print("Informe o �ndice de polui��o: ");
		indice = ler.nextDouble();
		
		//System.out.printf("Categoria: %d\n�ndice: %f\n", categoria, indice);
		System.out.printf("�ndice: %f\n", indice);
		
		if (indice <= 0.25) {
			System.out.println("O �ndice est� dentro do aceit�vel");
		}
		else if ((indice > 0.25) && (indice < 0.3)) {
			System.out.println("O �ndice est� um pouco acima do aceit�vel"); 
		}
		else if ((indice >= 0.3) && (indice < 0.4)) {
			System.out.println("Ind�strias do primeiro grupo devem suspender suas atividades");
		}
		else if ((indice >= 0.4) && (indice < 0.5)) {
			System.out.println("Ind�strias do primeiro e do segundo grupo devem suspender suas atividades");
		}
		else if ((indice >= 0.5)) {
			System.out.println("Ind�strias de todos os grupos devem suspender suas atividades");
		}
		
		ler.close();
		
	}

}

/*
	A Secretaria de Meio Ambiente que controla o �ndice de polui��o mant�m 3 grupos de ind�strias
	que s�o altamente poluentes do meio ambiente. O �ndice de polui��o aceit�vel varia de 0,05 at� 0,25. 
	Se o �ndice sobe para 0,3 as ind�strias do 1� grupo s�o intimadas a suspenderem suas atividades,
	se o �ndice crescer para 0,4 as ind�strias do 1� e 2� grupo s�o intimadas a suspenderem suas atividades, 
	se o �ndice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
	Fa�a um sistema que leia o �ndice de polui��o medido e emita a notifica��o adequada 
	aos diferentes grupos de empresas.
*/
