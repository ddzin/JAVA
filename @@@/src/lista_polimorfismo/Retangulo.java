package lista_polimorfismo;

public class Retangulo extends Forma_geometrica {

	private double ladoA;
	private double ladoB;
	
	
	
	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public Retangulo() {
		super();
	
	
	}

	public Retangulo(String nome, double ladoA, double ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	@Override
	public double calcularPerimetro() {
		return (2 * ladoA) + (2 * ladoB);
	}

	@Override
	public double calcularArea() {
		return ladoA * ladoB;
	}

}
