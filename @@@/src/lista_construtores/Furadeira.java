package lista_construtores;

public class Furadeira  extends FerramentaEletrica{

	public Furadeira() {
		super();
	
	}

	public Furadeira(String modelo, String fabricante, int desgaste, int peso, int rotacao, int potencia, int tensao) {
		super(modelo, fabricante, desgaste, peso, rotacao, potencia, tensao);
		
	}

}