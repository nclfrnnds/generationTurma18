package lista02exercicio0102;

public class Main {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro("Dog", 1);
		Cavalo cavalo = new Cavalo("Horse", 2);
		Preguica preguica = new Preguica("Sloth", 3);
		
		Animal[] animais = new Animal[3];
		
		animais[0] = cachorro;
		animais[1] = cavalo;
		animais[2] = preguica;
		
		for (Animal animal : animais) {
			System.out.printf("Nome: %s\nIdade: %d\nSom: %s\nAção: %s\n\n",
					animal.getNome(), animal.getIdade(), animal.emitirSom(), animal.acao());
		}
	}

}
