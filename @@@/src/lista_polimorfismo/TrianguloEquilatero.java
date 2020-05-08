package lista_polimorfismo;

public class TrianguloEquilatero extends Triangulo {
	
	private double lado;
	
	public TrianguloEquilatero(String nome, double lado) {
		super(nome);
		this.lado = lado;
	
	}
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	public TrianguloEquilatero() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcularPerimetro() {
		return 3 * this.getLado();
	}

	@Override
	public double calcularArea() {
		return (Math.pow(this.getLado(), 2) / 4
			) * Math.sqrt(3);
	}

}
