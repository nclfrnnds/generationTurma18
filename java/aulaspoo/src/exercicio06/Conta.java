package exercicio06;

public class Conta {
	
	private int numero;
	private String nome;
	private String cpf;
	private double saldo;
	private boolean ativa;
	
	public Conta(int numero, String nome, String cpf, double saldo, boolean ativa) {
		this.numero = numero;
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = saldo;
		this.ativa = ativa;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}

}
