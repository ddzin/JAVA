package lista_array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioArray04 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String aluno[] = new String[5];
		double nota1[] = new double[5];
		double nota2[] = new double[5];
		
		for(int i = 0; i < aluno.length; i++) {
			System.out.print("Digite o nome: ");
			aluno[i] = teclado.nextLine();
			
			System.out.print("Digite a nota 1: ");
			nota1[i] = teclado.nextDouble();
			
			System.out.print("Digite a nota 2: ");
			nota2[i] = teclado.nextDouble();	
			
			teclado.nextLine();			
		}
		
		for(int i = 0; i < aluno.length; i++) {
			System.out.println("Nome: " + aluno[i]);
			System.out.println("Nota 1: " + nota1[i]);
			System.out.println("Nota 2: " + nota2[i]);
			
			double media = (nota1[i] + nota2[i]) / 2;
			System.out.println("Média: " + df.format(media));
			
			if(media >= 7) {
				System.out.println("Aprovado!");
			} else {
				System.out.println("Reprovado!");
			}
			
			System.out.println("-----------------------");
		}
	}

}
