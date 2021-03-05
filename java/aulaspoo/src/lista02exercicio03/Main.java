package lista02exercicio03;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

	public static void main(String[] args) {

		Collection<String> produtos = new ArrayList<String>();
		
		produtos.add("Notebook");
		produtos.add("Celular");
		produtos.add("Televis�o");
		
		for (String produto : produtos) {
			System.out.println(produto);
		}
		
		produtos.remove("Televis�o");
		
		System.out.println();
		
		for (String produto : produtos) {
			System.out.println(produto);
		}
	}

}
