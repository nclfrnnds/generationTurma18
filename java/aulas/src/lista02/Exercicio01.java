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
		
		System.out.printf("O peso � de %.2f, o excesso � de %.2f e a multa � de R$ %.2f"
				, peso, excesso, multa);
		
		ler.close();
		
	}

}

/*
	Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho.
	Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo
	(50 quilos) deve pagar um multa de R$ 4,00 por quilo excedente. 
	Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e verifique se h� excesso.
	Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar.
	Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
*/
