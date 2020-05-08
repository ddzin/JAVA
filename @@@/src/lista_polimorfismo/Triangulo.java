package lista_polimorfismo;

public abstract class Triangulo extends Forma_geometrica {

		
	public Triangulo() {
		super();
	}


	public Triangulo(String nome) {
		super(nome);
	}


	@Override
	public abstract double calcularPerimetro();
	

	@Override
	public abstract double calcularArea();
	

}
