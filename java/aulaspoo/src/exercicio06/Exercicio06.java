package exercicio06;

public class Exercicio06 {

	public static void main(String[] args) {

		Conta conta = new Conta(123, "Ana Souza", "123.456.789-62", 400.0, true);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getNome());
		System.out.println(conta.getCpf());
		System.out.println(conta.getSaldo());
		System.out.println(conta.isAtiva());
		
	}

}
