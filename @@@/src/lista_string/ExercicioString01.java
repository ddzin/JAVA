package lista_string;

import java.util.Scanner;

public class ExercicioString01 {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.print("Digite uma mensagem: ");
		String texto = teclado.nextLine();
		
		/*int cont = texto.length();
		
		System.out.println("O n�mero de caracteres �: " + cont);*/
		
		//texto = texto.replace("  ", " ");
		String palavras[] = texto.split(" ");
		
		System.out.println("N�mero de palavras: " + palavras.length);
				
	}

}
