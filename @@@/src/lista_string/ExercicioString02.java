package lista_string;

import java.util.Scanner;

public class ExercicioString02 {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = teclado.nextLine();
		
		System.out.print("Digite uma palavra: ");
		String palavra = teclado.next();
		
		frase = frase.replace(",", " ");
		frase = frase.replace(".", " ");
		
		String palavras[] = frase.split(" ");
		
		int cont = 0;	
		for(int i = 0; i < palavras.length; i++) {
			if(palavras[i].equals(palavra)) {
				cont++;
			}
		}
		
		System.out.println("----------------------------");
		System.out.println(frase);
		System.out.println(palavra);
		System.out.println("Número de repetições: " + cont);
		
	}

}
