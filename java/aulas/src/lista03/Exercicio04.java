package lista03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero = 0;

		System.out.print("Informe um n�mero: ");
		numero = ler.nextInt();
		
		System.out.printf("%d ", numero);
		while (numero <= 100) {
			numero = numero * 3;
			System.out.printf("%d ", numero);
		}

		ler.close();
		
	}

}

/*
	Obtenha um n�mero digitado pelo usu�rio e repita a opera��o de multiplicar ele por tr�s  
	(imprimindo o novo valor) at� que ele seja maior do que 100. 
	Ex.: se o usu�rio digita 5, deveremos observar na tela a seguinte sequ�ncia: 5 15 45 135.
*/
