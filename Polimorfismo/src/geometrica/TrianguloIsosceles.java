package geometrica;

public class TrianguloIsosceles extends Triangulo {

	private int base;
	private int altura;

	public TrianguloIsosceles() {
		super();

	}

	public TrianguloIsosceles( String nome, int base, int altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double calcularArea() {

		return (this.getBase() * this.getAltura()) *2;
	}

	@Override
	public double calcularPerimetro() {

		 return this.getBase() + this.getAltura() +Math.hypot(this.getBase(), this.getAltura());
	}

}
