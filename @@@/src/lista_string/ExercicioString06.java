package lista_string;

import java.util.Scanner;

public class ExercicioString06 {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.print("Digite um texto: ");
		String texto = teclado.nextLine();		
		System.out.print("Palavra que será substituída: ");
		String palavra = teclado.nextLine();		
		System.out.print("Nova palavra: ");
		String novaPalavra = teclado.nextLine();
		
		String palavras[] = texto.split(" ");
		
		int cont = 0;
		for(int i = 0; i < palavras.length; i++) {
			if(palavras[i].equals(palavra)){
				cont++;
			}
		}
		
		String novoTexto = texto.replace(palavra, novaPalavra);
		
		System.out.println("Texto original: " + texto);
		System.out.println("Novo texto: " + novoTexto);
		System.out.println("Ocorrências: " + cont);
	}

}
