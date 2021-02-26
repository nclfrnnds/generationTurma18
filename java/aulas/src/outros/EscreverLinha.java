package outros;

import java.util.Locale;
import java.util.Scanner;

public class EscreverLinha {

	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("pt", "BR"));

		Scanner ler = new Scanner(System.in);

		int tamanho;
		
		System.out.print("Informe o tamanho da linha: ");
		tamanho = ler.nextInt();
		
		escreverLinha(tamanho);
		
		ler.close();
		
	}
	
	public static void escreverLinha(int tamanho) {
		for (int contador = 1; contador <= tamanho; contador++) {
			System.out.print("-");
		}
	}

}
