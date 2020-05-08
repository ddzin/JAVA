package lista_heranca;

public class ContaBancaria {
	
	private String nome;
	private int numero;
	private double saldo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
		
	}
	
	public void depositar(double deposito) {
		this.setSaldo(this.getSaldo() + deposito);
		
	}
	
	public void sacar(double saque) {
		if(this.getSaldo() - saque >= 0) {
			this.setSaldo(this.getSaldo() - saque);
			System.out.println("Saque realizado com sucesso");
			
		} else {
			System.out.println("Saque insuficiente");
		}
	}

}
