package exercicio04;

public class Exercicio04 {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario("José", "Desenvolvedor Java Jr.", 5000);
		
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getCargo());
		System.out.println(funcionario.getSalario());
		
	}

}
