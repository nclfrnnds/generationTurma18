package lista02;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		double peso = 0.0, excesso = 0.0, multa = 0.0;
		final int LIMITE = 50, VALORMULTA = 4;
		
		System.out.print("Informe o peso de tomates: ");
		peso = ler.nextDouble();
		
		if ((int)peso > LIMITE) {
			excesso = (int)peso - LIMITE;
			multa = excesso * VALORMULTA;
		}
		
		System.out.printf("O peso é de %.2f, o excesso é de %.2f e a multa é de R$ %.2f"
				, peso, excesso, multa);
		
		ler.close();
		
	}

}

/*
	João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
	Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo
	(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
	João precisa que você faça um sistema que leia a variável P (peso de tomates) e verifique se há excesso.
	Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
	Caso contrário mostrar tais variáveis com o conteúdo ZERO.
*/
