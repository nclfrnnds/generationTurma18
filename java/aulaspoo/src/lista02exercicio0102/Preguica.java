package lista02exercicio0102;

public class Preguica extends Animal {

	// Construtor
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	// M�todos
	
	@Override
	public String emitirSom() {
		String som = "ressonar";
		return som;
	}
	
	@Override
	public String acao() {
		return "sobe em �rvore";
	}
	
}
