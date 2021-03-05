package outros02;

public class Terceiro extends Funcionario {

	// Atributos

	private double adicional;

	// Construtor

	public Terceiro(String nome, int matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(nome, matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}

	// Encapsulamento

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	// Métodos

	@Override
	public double salario() {
		return (horasTrabalhadas * valorPorHora) + adicional;
	}

}
