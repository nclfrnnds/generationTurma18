package exercicio07;

public class Exercicio07 {

	public static void main(String[] args) {

		Paciente paciente = new Paciente("João Oliveira", 123456, 1990);
		
		System.out.println(paciente.getNome());
		System.out.println(paciente.getProntuario());
		System.out.println(paciente.getAnoNascimento());
		
	}

}
