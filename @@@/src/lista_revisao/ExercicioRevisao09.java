package lista_revisao;

import java.util.Scanner;

public class ExercicioRevisao09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = teclado.next();
		
		char letras[] = palavra.toCharArray();
		
		for(int i = letras.length - 1; i >= 0; i--) {
			System.out.print(letras[i]);
		}

	}

}
