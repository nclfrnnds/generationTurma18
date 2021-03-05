package lista02exercicio03;

public class Produto {
	
	// Atributos
	
	private String nome;
	private String categoria;
	private int qtde;
	
	// Construtor
	
	public Produto(String nome, String categoria, int qtde) {
		super();
		this.nome = nome;
		this.categoria = categoria;
		this.qtde = qtde;
	}
	
	// Encapsulamento

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	// Métodos
	
	

}
