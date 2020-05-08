package geometrica;

public class Losango extends FormaGeometrica {
	private int ladoA;
	private int ladoB;
	private int diagonalMaior;
	private int diagonalMenor;

	public Losango( String nome, int ladoA, int ladoB, int diagonalMaior, int diagonalMenor) {
		super(nome);
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.diagonalMaior = diagonalMaior;
		this.diagonalMenor = diagonalMenor;
	}

	public Losango() {
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

	public int getDiagonalMaior() {
		return diagonalMaior;
	}

	public void setDiagonalMaior(int diagonalMaior) {
		this.diagonalMaior = diagonalMaior;
	}

	public int getDiagonalMenor() {
		return diagonalMenor;
	}

	public void setDiagonalMenor(int diagonalMenor) {
		this.diagonalMenor = diagonalMenor;
	}

	@Override
	public double calcularArea() {

		return (diagonalMaior * diagonalMenor) / 2;
	}
		
	@Override
		public double calcularPerimetro() {

			return (this.getLadoA() * 2) + (this.getLadoB() * 2);
		}

	}
