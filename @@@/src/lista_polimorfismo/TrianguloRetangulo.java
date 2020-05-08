package lista_polimorfismo;

public class TrianguloRetangulo extends Triangulo {
	
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public TrianguloRetangulo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TrianguloRetangulo(String nome, double base, double altura) {
		super(nome);
		this.base = base;
		this.altura = altura;
	}
	@Override
	public double calcularPerimetro() {
		return this.getBase() + this.getAltura() + Math.hypot(this.getBase(), this.getAltura());
		
	}
	@Override
	public double calcularArea() {
		return (this.getBase() * this.getAltura()) / 2;
	}

}
