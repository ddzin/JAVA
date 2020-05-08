package lista_construtores;

public class Serrote extends FerramentaManual{

	private int ndentes;

	public Serrote(String modelo, String fabricante, int desgaste, int peso, String tipo, int tamanho, int ndentes) {
		super(modelo, fabricante, desgaste, peso, tipo, tamanho);
		this.ndentes = ndentes;
	}

	public Serrote() {
		super();

	}

	
}
	
