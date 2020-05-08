package lista_heranca;

public class ContaPoupanca extends ContaBancaria {
	
	private int diaRendimento;

	public int getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(int diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public void atualizarSaldo(int taxa, int dia) {
		if(dia >= diaRendimento)	 {
			System.out.println("Extrato realizado com sucesso");
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxa / 100));
		} else {
			System.out.println("Não chegou o dia do seu rendimento");
			
		}
			
	}
}
