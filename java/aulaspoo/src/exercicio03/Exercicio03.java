package exercicio03;

public class Exercicio03 {

	public static void main(String[] args) {

		Produto produto = new Produto("Inspiron", "Dell", "Notebook");
		
		System.out.println(produto.getModelo());
		System.out.println(produto.getMarca());
		System.out.println(produto.getCategoria());
		
	}

}
