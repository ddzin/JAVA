package lista_heranca;

public class ContaEspecial extends ContaBancaria {
	
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	@Override
	public void sacar(double saque) {
		if(this.getSaldo() + this.getLimite() - saque >= 0) {
			this.setSaldo(this.getSaldo() - saque);
			System.out.println("Extrato realizado com sucesso");
		} else {
			System.out.println("Saque insuficiente");
			}
		}

	}