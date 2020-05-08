package lista_revisao;

import java.util.Scanner;

public class ExercicioRevisao04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String nome[] = new String[10];
		int idade[] = new int[10];
		int cont = 0;
		int menorIdade = 100;
		int maiorIdade = 0;
		String maiorNome = "";
		String menorNome = "";
		
		for(int i = 0; i < 3; i++) {
			System.out.print("Digite o nome: ");
			nome[i] = teclado.nextLine();
			System.out.print("Digite a idade: ");
			idade[i] = teclado.nextInt();
			cont += idade[i];
			if(idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				maiorNome = nome[i];
			}
			if(idade[i] < menorIdade) {
				menorIdade = idade[i];
				menorNome = nome[i];
			}
			teclado.nextLine();
		}
		
		System.out.println("Média das idades: " + cont / 10);
		System.out.println("Maior idade: " + maiorNome + ", " + maiorIdade + " anos.");
		System.out.println("Menor idade: " + menorNome + ", " + menorIdade + " anos.");
	}
}
