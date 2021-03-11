package lista02exercicio0102;

public class Animal {
	
	// Atributos
	
	private String nome;
	private int idade;
	protected String som;
	
	// Construtor

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	// Encapsulamento
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	// Métodos
	
	public String emitirSom() {
		return som;
	}
	
	public String acao() {
		return "";
	}

}
