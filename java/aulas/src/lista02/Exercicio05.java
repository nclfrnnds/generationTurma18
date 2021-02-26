package lista02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		//int categoria;
		double indice;
		
		//System.out.print("Informe a categoria da indústria (1, 2 ou 3): ");
		//categoria = ler.nextInt();
		System.out.print("Informe o índice de poluição: ");
		indice = ler.nextDouble();
		
		//System.out.printf("Categoria: %d\nÍndice: %f\n", categoria, indice);
		System.out.printf("Índice: %f\n", indice);
		
		if (indice <= 0.25) {
			System.out.println("O índice está dentro do aceitável");
		}
		else if ((indice > 0.25) && (indice < 0.3)) {
			System.out.println("O índice está um pouco acima do aceitável"); 
		}
		else if ((indice >= 0.3) && (indice < 0.4)) {
			System.out.println("Indústrias do primeiro grupo devem suspender suas atividades");
		}
		else if ((indice >= 0.4) && (indice < 0.5)) {
			System.out.println("Indústrias do primeiro e do segundo grupo devem suspender suas atividades");
		}
		else if ((indice >= 0.5)) {
			System.out.println("Indústrias de todos os grupos devem suspender suas atividades");
		}
		
		ler.close();
		
	}

}

/*
	A Secretaria de Meio Ambiente que controla o índice de poluição mantém 3 grupos de indústrias
	que são altamente poluentes do meio ambiente. O índice de poluição aceitável varia de 0,05 até 0,25. 
	Se o índice sobe para 0,3 as indústrias do 1º grupo são intimadas a suspenderem suas atividades,
	se o índice crescer para 0,4 as indústrias do 1º e 2º grupo são intimadas a suspenderem suas atividades, 
	se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades. 
	Faça um sistema que leia o índice de poluição medido e emita a notificação adequada 
	aos diferentes grupos de empresas.
*/
