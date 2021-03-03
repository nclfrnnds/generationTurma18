package exercicio07;

public class Paciente {

	private String nome;
	private int prontuario;
	private int anoNascimento;
	
	public Paciente(String nome, int prontuario, int anoNascimento) {
		this.nome = nome;
		this.prontuario = prontuario;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getProntuario() {
		return prontuario;
	}
	public void setProntuario(int prontuario) {
		this.prontuario = prontuario;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
}
