package lista02exercicio0102;

public class Cachorro extends Animal {

	// Construtor
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	// Métodos
	
	@Override
	public String emitirSom() {
		return super.som = "latido";
	}
	
	@Override
	public String acao() {
		return "corre";
	}

}
