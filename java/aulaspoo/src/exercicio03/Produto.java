package exercicio03;

public class Produto {
	
	private String modelo;
	private String marca;
	private String categoria;
	
	public Produto(String modelo, String marca, String categoria) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.categoria = categoria;
	}

	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
