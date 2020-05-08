package geometrica;

public class TrianguloEquilatero extends  Triangulo {
	private int lado;

	public TrianguloEquilatero() {
		super();

	}

	public TrianguloEquilatero( String nome, int lado) {
		super(nome);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {

		return (Math.pow(this.getLado(), 2)/4) * Math.sqrt(3);
	}

	@Override
	public double calcularPerimetro() {

		return this.getLado() * 3;
	}

}
