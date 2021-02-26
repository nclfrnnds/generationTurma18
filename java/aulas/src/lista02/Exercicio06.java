package lista02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idade;
		
		System.out.print("Informe a idade do nadador: ");
		idade = ler.nextInt();
		
		if (idade < 5) {
			System.out.println("A idade não faz parte de nenhuma categoria.");
		}
		else if (idade <= 7) {
			System.out.println("Categoria: Infantil A");
		} 
		else if (idade <= 11) {
			System.out.println("Categoria: Infantil B");
		} 
		else if (idade <= 13) {
			System.out.println("Categoria: Juvenil A");
		} 
		else if (idade <= 17) {
			System.out.println("Categoria: Juvenil B");
		} 
		else if (idade >= 18) {
			System.out.println("Categoria: Adultos");
		} 
		
		ler.close();
		
	}

}

/*
	Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
	- Infantil A = 5 a 7 anos
	- Infantil B = 8 a 11 anos
	- Juvenil A = 12 a 13 anos
	- Juvenil B = 14 a 17 anos
	- Adultos = Maiores de 18 anos
*/
