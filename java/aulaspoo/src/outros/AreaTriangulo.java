package outros;

import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		double maiorArea = 0,
		base1, altura1, area1, 
		base2, altura2, area2,
		base3, altura3, area3;
		
		System.out.println("Primeiro tri�ngulo");
		
		System.out.print("Informe a base: ");
		base1 = ler.nextDouble();
		
		System.out.print("Informe a altura: ");
		altura1 = ler.nextDouble();
		
		System.out.println("\nSegundo tri�ngulo");
		
		System.out.print("Informe a base: ");
		base2 = ler.nextDouble();
		
		System.out.print("Informe a altura: ");
		altura2 = ler.nextDouble();
		
		System.out.println("\nTerceiro tri�ngulo");
		
		System.out.print("Informe a base: ");
		base3 = ler.nextDouble();
		
		System.out.print("Informe a altura: ");
		altura3 = ler.nextDouble();
		
		area1 = (base1 * altura1) / 2;
		area2 = (base2 * altura2) / 2;
		area3 = (base3 * altura3) / 2;
		
		System.out.printf("\n�rea do primeiro tri�ngulo: %.2f\n", area1);

		System.out.printf("�rea do segundo tri�ngulo: %.2f\n", area2);

		System.out.printf("�rea do terceiro tri�ngulo: %.2f\n", area3);
		
		if (area1 >= area2 && area1 >= area3) {
			maiorArea = area1;
		} else if (area2 >= area1 && area2 >= area3) {
			maiorArea = area2;
		} else if (area3 >= area1 && area3 >= area2) {
			maiorArea = area3;
		}
		
		System.out.printf("A maior �rea �: %.2f", maiorArea);
		
		ler.close();
		
	}

}
