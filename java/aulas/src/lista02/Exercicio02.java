package lista02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int horas, horasExcedentes, salario, salarioExcedente;
		
		System.out.print("Informe o número de horas trabalhadas: ");
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
				+ "\nSalário: R$ %d\nSalário excedente: R$ %d",
				horas, salario, salarioExcedente);
		
		ler.close();
		
	}

}

/*
	Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas
	trabalhadas de um operário.
	E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
	Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E,
	caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
	No final do processamento imprimir o salário total e o salário excedente.
*/
