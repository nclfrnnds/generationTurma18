package outros02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		List<Funcionario> funcionarios = new ArrayList<>();

		Funcionario funcionario = new Funcionario("Gilberto", 1, 60, 25.50);
		Terceiro terceiro = new Terceiro("Sarah", 2, 60, 25.50, 5);

		System.out.println("Salário do " + funcionario.getNome() + ": " + funcionario.salario());
		System.out.println("Salário do " + terceiro.getNome() + ": " + terceiro.salario());

		System.out.println();

		System.out.print("Digite a quantidade de funcionários: ");
		int quantidade = ler.nextInt();
		System.out.println();

		for (int x = 1; x <= quantidade; x++) {

			System.out.print("Informe: 1 - Funcionário / 2 - Terceiro: ");
			char tipo = ler.next().charAt(0);

			System.out.println("Funcionário " + x);
			System.out.print("Nome: ");
			String nome = ler.next();
			System.out.print("Matrícula: ");
			int matricula = ler.nextInt();
			System.out.print("Horas trabalhadas: ");
			int horasTrabalhadas = ler.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = ler.nextDouble();

			if (tipo == '2') {
				System.out.print("Valor adicional: ");
				double adicional = ler.nextDouble();
				funcionarios.add(new Terceiro(nome, matricula, horasTrabalhadas, valorPorHora, adicional));
			} else {
				funcionarios.add(new Funcionario(nome, matricula, horasTrabalhadas, valorPorHora));
			}
			System.out.println();
		}

		System.out.println("Pagamento de salários: ");
		for (Funcionario func : funcionarios) {
			System.out.println(func.getNome() + ", seu salário é de R$ " + func.salario());
		}

		ler.close();

	}

}
