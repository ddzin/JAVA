package lista_polimorfismo;

public class Circulo extends Forma_geometrica{
	
	private double raio;

	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	
	public Circulo() {
		super();
		
	}

	public Circulo(String nome, double raio) {
		super();
		this.raio = raio;
		}
	
	public double calcularArea() {
		return Math.PI * (raio * this.getRaio());

	
	}
	
	@Override
	public double calcularPerimetro() {
		return 2 * Math.PI * this.getRaio();
	}

}
