package exercicio01;

public class Exercicio01 {

	public static void main(String[] args) {

		Cliente cliente = new Cliente("Maria", "Silva", "maria@email.com");
		
		cliente.nomeCompleto();
		System.out.println(cliente.getEmail());
				
	}

}
