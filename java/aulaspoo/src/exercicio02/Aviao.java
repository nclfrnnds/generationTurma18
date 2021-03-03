package exercicio02;

public class Aviao {
	
	private String modelo;
	private String companhiaAerea;
	
	public Aviao(String modelo, String companhiaAerea) {
		this.modelo = modelo;
		this.companhiaAerea = companhiaAerea;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCompanhiaAerea() {
		return companhiaAerea;
	}
	public void setCompanhiaAerea(String companhiaAerea) {
		this.companhiaAerea = companhiaAerea;
	}

}
