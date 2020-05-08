package lista_polimorfismo;

public abstract class Forma_geometrica {
	private String nome;

	public Forma_geometrica(String nome) {
		super();
		this.nome = nome;
	}

	public Forma_geometrica() {
		super();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public abstract double calcularPerimetro();
	
	public abstract double calcularArea();
	
	}
	

