package outros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LerArquivo {
	
	public static void main(String[] args) {
		
		String caminho = "D:\\Users\\Nicoli\\Documents\\Desenvolvimento\\Projetos-no-Git"
				+ "\\generationTurma18\\java\\aulaspoo\\src\\outros\\Titas.txt";
		File arquivo = new File(caminho);
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new FileReader(arquivo));
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				System.out.println(linha);
			}
		}
		catch (FileNotFoundException err) {
			System.out.println("Arquivo não encontrado!");
		}
		finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
	}

}
