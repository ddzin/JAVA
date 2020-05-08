package lista_heranca;

public class ContaExecutavel {

	public static void main(String[] args) {
		
		ContaPoupanca cp = new ContaPoupanca();
		ContaEspecial ce = new ContaEspecial();
		
		//não deixar sacar por falta de limite:
		cp.sacar(200);
		System.out.println("___________________________________");
		cp.sacar(300);
		
		//Dépositos
		System.out.println("___________________________________");
		cp.depositar(500);
		ce.depositar(1000);
		ce.setLimite(100);		
		System.out.println(cp.getSaldo());
		System.out.println("___________________________________");
		System.out.println(ce.getSaldo());
		System.out.println("___________________________________");
		System.out.println(ce.getLimite());
		
		
		//Rendimento
		System.out.println("___________________________________");
		cp.setDiaRendimento(10);
		cp.atualizarSaldo(10, 5);
		System.out.println("Saldo: "+cp.getSaldo());
		System.out.println("___________________________________");
		cp.atualizarSaldo(10, 15);
		System.out.println("Saldo: "+cp.getSaldo());
		
		
		//Testes de Limite
		System.out.println("___________________________________");
		cp.sacar(600);
		System.out.println("Saldo: "+cp.getSaldo());
		System.out.println("___________________________________");
		cp.sacar(500);
		System.out.println("Saldo: "+cp.getSaldo());
		System.out.println("___________________________________");
		
		ce.sacar(5000);
		System.out.println("Saldo: "+ce.getSaldo());
		System.out.println("___________________________________");
		ce.sacar(1050);
		System.out.println("Saldo: "+ce.getSaldo());
		System.out.println("___________________________________");
		System.out.println("Limite: "+ce.getLimite());
		System.out.println("___________________________________");
		ce.sacar(100);
		System.out.println("___________________________________");
		ce.sacar(50);
		System.out.println("Saldo: "+ce.getSaldo());
	}
}
