package geometrica;

public class Retangulo extends FormaGeometrica {
	private int ladoA;
	private int ladoB;

	public Retangulo( String nome, int ladoA, int ladoB) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}

	public Retangulo() {
		super();

	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	@Override
	public double calcularArea() {

		return ladoA * ladoB;
	}

	@Override
	public double calcularPerimetro() {

		return ( 2* ladoA) + (2* ladoB) ;
	}

}
