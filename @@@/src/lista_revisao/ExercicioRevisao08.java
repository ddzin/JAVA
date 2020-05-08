package lista_revisao;

import java.util.Scanner;

public class ExercicioRevisao08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String texto = teclado.next();
		
		String palavras[] = new String[texto.length()];
		
		for(int i = 0; i < texto.length(); i++) {
			palavras[i] = texto.substring(0, i + 1);
			System.out.println(palavras[i]);
		}
		for(int i = texto.length() - 2; i >= 0; i--) {
			System.out.println(palavras[i]);
		}
	}

}
