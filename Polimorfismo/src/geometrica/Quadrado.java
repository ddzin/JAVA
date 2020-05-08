package geometrica;

public class Quadrado extends FormaGeometrica {
	private int lado;

	public Quadrado( String nome, int lado) {
		super(nome);
		this.lado = lado;

	}

	public Quadrado() {
		super();

	}

	public double getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		 return Math.sqrt(lado);
	}
	
	@Override
	public double calcularPerimetro() {
		return lado * 4;
	}

}
