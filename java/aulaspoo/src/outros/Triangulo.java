package outros;

public class Triangulo {

	public double base;
	public double altura;
	public double area;
	
	public double calculoAreaTriangulo() {
		area = base * altura / 2;
		return area;
	}
	
	public void imprimirAreaTriangulo() {
		System.out.printf("A �rea do tri�ngulo � %.2f \n", calculoAreaTriangulo());
	}
	
}
