package lista_construtores;

public class FerramentaManual extends Ferramenta{
	private String tipo;
	private int tamanho;
	
	public FerramentaManual(String modelo, String fabricante, int desgaste, int peso, String tipo, int tamanho) {
		super(modelo, fabricante, desgaste, peso);
		this.tipo = tipo;
		this.tamanho = tamanho;
	}

	public FerramentaManual() {
		super();
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}


}