package lista_construtores;

public class FerramentaEletrica extends Ferramenta {
	private int rotacao;
	private int potencia;
	private int tensao;
	public FerramentaEletrica(String modelo, String fabricante, int desgaste, int peso, int rotacao, int potencia,
			int tensao) {
		super(modelo, fabricante, desgaste, peso);
		this.rotacao = rotacao;
		this.potencia = potencia;
		this.tensao = tensao;
	}
	public FerramentaEletrica() {
		super();

	}
	public int getRotacao() {
		return rotacao;
	}
	public void setRotacao(int rotacao) {
		this.rotacao = rotacao;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getTensao() {
		return tensao;
	}
	public void setTensao(int tensao) {
		this.tensao = tensao;
	}
	
}

