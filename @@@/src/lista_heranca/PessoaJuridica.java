package lista_heranca;

public class PessoaJuridica extends Contribuinte {
	
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCNPJ(String cnpj) {
		cnpj = cnpj;
	}
	
	public double calcularImposta() {
		return this.getRendaBruta() * 0.10;
		
	}

}
