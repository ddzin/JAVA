package lista_associacao;

public class Executavel {

	public static void main(String[] args) {
		
		
	
		// Passageiro
			// Endereço dos Passageiros
			Endereco end1 = new Endereco("Rua do Passe", 100, "Estreito", "Florianópolis", "SC" );
			Endereco end2 = new Endereco("Rua do Troco", 200, "Capoeiras", "Florianópolis", "SC" );
			Endereco end3 = new Endereco("Rua do Dinheiro", 300, "Jardim Atlântico", "Florianópolis", "SC" );
			Endereco end4 = new Endereco("Rua do Cartão", 400, "Balneário do Estreito", "Florianópolis", "SC" );
			Endereco end5 = new Endereco("Rua do Estudante", 500, "Barreiros", "São José", "SC" );
			Endereco end6 = new Endereco("Rua do Idoso", 600, "Capoeiras", "Florianópolis", "SC" );
			Endereco end7 = new Endereco("Rua do Passe-Livre", 700, "Estreito", "Florianópolis", "SC" );
			Endereco end8 = new Endereco("Rua do Passageiro", 800, "Jardim Atlântico", "Florianópolis", "SC" );
			Endereco end9 = new Endereco("Rua do Transporte", 900, "Estreito", "Florianópolis", "SC" );
			Endereco end10 = new Endereco("Rua da Condução", 1000, "Balneário do Estreito", "Florianópolis", "SC" );
		
		
			
			// Contato dos Passageiros			
			Contato cont1 = new Contato("1111-1111", "joao@gmail.com");
			Contato cont2 = new Contato("2222-2222", "jose@gmail.com");
			Contato cont3 = new Contato("3333-3333", "joana@gmail.com");
			Contato cont4 = new Contato("4444-4444", "joaquin@gmail.com");
			Contato cont5 = new Contato("5555-5555", "jair@gmail.com");
			Contato cont6 = new Contato("6666-6666", "jaime@gmail.com");
			Contato cont7 = new Contato("7777-7777", "janaina@gmail.com");
			Contato cont8 = new Contato("8888-8888", "janice@gmail.com");
			Contato cont9 = new Contato("9999-9999", "jean@gmail.com");
			Contato cont10 = new Contato("1010-1010", "juvenal@gmail.com");
		
			
		
			// Passageiros		
			Passageiro p1 = new Passageiro("João", 30, end1, cont1);
			Passageiro p2 = new Passageiro("José", 29, end2, cont2);
			Passageiro p3 = new Passageiro("Joana", 48, end3, cont3);
			Passageiro p4 = new Passageiro("Joaquin", 25, end4, cont4);
			Passageiro p5 = new Passageiro("Jair", 41, end5, cont5);
			Passageiro p6 = new Passageiro("Jaime", 31, end6, cont6);
			Passageiro p7 = new Passageiro("Janaina", 22, end7, cont7);
			Passageiro p8 = new Passageiro("Janice", 15, end8, cont8);
			Passageiro p9= new Passageiro("Jean", 50, end9, cont9);
			Passageiro p10 = new Passageiro("Juvenal", 80, end10, cont10);
			
			
			
		
		// Motorista
			// Endereco dos Motoristas
			Endereco end11 = new Endereco("Rua do Motora", 1100, "Estreito", "Florianópolis", "SC" );
			Endereco end12 = new Endereco("Rua do Cobrador", 1200, "Capoeiras", "Florianópolis", "SC" );
		
			
			// Contato dos Motoristas
			Contato cont11 = new Contato("1011-1011", "jorge@gmail.com");
			Contato cont12 = new Contato("1012-1012", "julio@gmail.com");
		
			
			// Motoristas
			Motorista m1 = new Motorista("Jorge", 47, end11, cont11, 3500);
			Motorista m2 = new Motorista("Julio", 45, end12, cont12, 3900);
			
			
		// Onibus
		Onibus bus1 = new Onibus("MLG-3435", 234, m1);
		Onibus bus2 = new Onibus("MLG-3437", 235, m2);
			
			
		// Array de Passageiros
		Passageiro[] passageiros1 = {p1, p3, p5, p7, p9};
		Passageiro[] passageiros2 = {p2, p4, p6, p8, p10};
		
		
		// Linhas			
		Linha linha1 = new Linha(5, bus1, passageiros1);
		Linha linha2 = new Linha(4, bus2, passageiros2);	
			
		
		
		// Endereço da Empresa
		Endereco end13 = new Endereco("Rua do Ônibus", 1500, "Centro", "Florianópolis", "SC" );
		
		
		// Contato Empresa
		Contato cont13 = new Contato("3033-3033", "viagem@gmail.com");
		
		
		// Array de Linhas
		Linha[] listaLinha = {linha1, linha2};
		
		
		// Empresa
		Empresa emp = new Empresa ("Viagem Bem", end13,cont13, listaLinha);
		
		
		
		
		// EX. Identificar motorista mais novo
		emp.indentificarMotoristaMaisNovo();
		
		
		
		// EX. Calcular Faturamento da Linha
		emp.calcularFaturamentoPorLinha();
		
		
		// EX. Contato dos Passageiro de um determinado bairro
		emp.recuperarContatoPorBairro("Barreiros");
		
		
		
		
	}

}
