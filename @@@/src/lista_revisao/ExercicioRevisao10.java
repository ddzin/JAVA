package lista_revisao;

import java.util.Scanner;

public class ExercicioRevisao10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o nome: ");
		String nome = teclado.nextLine();
		
		String palavra[] = nome.split(" ");
		
		System.out.print(palavra[palavra.length - 1].toUpperCase() + ", ");
		for(int i = 0; i < palavra.length - 1; i++) {
			System.out.print(palavra[i] + " ");
		}
		
	}

}
