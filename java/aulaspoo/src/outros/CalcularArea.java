package outros;

import java.util.Scanner;

public class CalcularArea {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Triangulo t1 = new Triangulo();
		Triangulo t2 = new Triangulo();
		Triangulo t3 = new Triangulo();
		
		double maiorArea = 0;
		
		System.out.println("Primeiro tri�ngulo");
		
		System.out.print("Informe a base: ");
		t1.base = ler.nextDouble();
		
		System.out.print("Informe a altura: ");
		t1.altura = ler.nextDouble();
		
		System.out.println("\nSegundo tri�ngulo");
		
		System.out.print("Informe a base: ");
		t2.base = ler.nextDouble();
		
		System.out.print("Informe a altura: ");
		t2.altura = ler.nextDouble();
		
		System.out.println("\nTerceiro tri�ngulo");
		
		System.out.print("Informe a base: ");
		t3.base = ler.nextDouble();
		
		System.out.print("Informe a altura: ");
		t3.altura = ler.nextDouble();
		
		System.out.println();
		
		t1.imprimirAreaTriangulo();
		t2.imprimirAreaTriangulo();
		t3.imprimirAreaTriangulo();
		
		if (t1.area >= t2.area && t1.area >= t3.area) {
			maiorArea = t1.area;
		} else if (t2.area >= t1.area && t2.area >= t3.area) {
			maiorArea = t2.area;
		} else if (t3.area >= t1.area && t3.area >= t2.area) {
			maiorArea = t3.area;
		}
		
		System.out.printf("A maior �rea �: %.2f", maiorArea);
		
		ler.close();
		
	}

}
