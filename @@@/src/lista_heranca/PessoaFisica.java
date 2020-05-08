package lista_heranca;

public class PessoaFisica extends Contribuinte {
	
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double calcularImposto() {
		double resultado = 0;
		
		if(this.getRendaBruta() <= 1400.01 && this.getRendaBruta() <= 2100) {
			resultado = (this.getRendaBruta() * 0.10) + 100;
			
		}
		if(this.getRendaBruta() <= 2100.01 && this.getRendaBruta() <= 2800) {
			resultado = (this.getRendaBruta() * 0.15) + 270;
		}
		if(this.getRendaBruta() <= 2800.01 && this.getRendaBruta() <= 3600) {
			resultado = (this.getRendaBruta() * 0.25) + 500;
		}
		if(this.getRendaBruta() > 3600) {
			resultado = (this.getRendaBruta() * 0.30) + 700;
			
		
	}
		return resultado;
	}
	
	}
