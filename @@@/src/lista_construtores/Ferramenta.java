package lista_construtores;

public class Ferramenta {
	private String modelo;
	private String fabricante;
	private int desgaste;
	private int peso;


	public Ferramenta(String modelo, String fabricante, int desgaste, int peso) {
		super();
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.desgaste = desgaste;
		this.peso = peso;
	}
	public Ferramenta() {
		super();
	}
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getDesgaste() {
		return desgaste;
	}
	public void setDesgaste(int desgaste) {
		this.desgaste = desgaste;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public double calcularVidaUtil() {
		return 100 / this.getDesgaste();
	}
	public double calcularVidaUtil(String periodo) {
		double resultado = 0;
		
		if(periodo.equalsIgnoreCase("DIA")) {
		resultado = this.calcularVidaUtil() / 24;
		} else {
			resultado = this.calcularVidaUtil() / (24*7);
		}
		return resultado;
	}
}
	