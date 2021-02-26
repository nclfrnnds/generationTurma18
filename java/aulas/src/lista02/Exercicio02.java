package lista02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int horas, horasExcedentes, salario, salarioExcedente;
		
		System.out.print("Informe o n�mero de horas trabalhadas: ");
		horas = ler.nextInt();
		
		if (horas > 50) {
			salario = 50 * 10;
			horasExcedentes = horas - 50;
			salarioExcedente = (horasExcedentes * 20);
		}
		else {
			salario = (horas * 10);
			horasExcedentes = 0;
			salarioExcedente = 0;
		}
		
		System.out.printf("Horas trabalhadas: %d horas"
				+ "\nSal�rio: R$ %d\nSal�rio excedente: R$ %d",
				horas, salario, salarioExcedente);
		
		ler.close();
		
	}

}

/*
	Elabore um sistema que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas
	trabalhadas de um oper�rio.
	E calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora.
	Quando o n�mero de horas exceder a 50 calcule o excesso de pagamento armazenando-o na vari�vel E,
	caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00.
	No final do processamento imprimir o sal�rio total e o sal�rio excedente.
*/
