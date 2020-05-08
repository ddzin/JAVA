package lista_revisao;

import java.util.Scanner;

public class ExercicioRevisao07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = teclado.nextLine();
		
		String palavra[] = frase.split(" ");
		
		for(int i = 0; i < palavra.length; i++) {
			System.out.println(palavra[i]);
		}
		
	}

}
