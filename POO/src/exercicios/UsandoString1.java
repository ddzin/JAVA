package exercicios;

import java.util.Scanner;

public class UsandoString1 {

	private static Scanner keyboard;

	public static void main(String[] args) {

		keyboard = new Scanner(System.in);
		String reverse = new String();
		String menor = new String();

		System.out.println("Digite a primeira frase: ");
		String frase1 = keyboard.nextLine();
		System.out.println("");
		System.out.println("Digite a segunda frase: ");
		String frase2 = keyboard.nextLine();
		System.out.println("");
		System.out.println("___________________________________________________________________________________");
		System.out.println("");
		System.out.println("Tamanho da primeira frase: " + frase1.length() + " letras.");
		System.out.println("");
		System.out.println("___________________________________________________________________________________");
		System.out.println("");
		System.out.println("Tamanho da segunda frase: " + frase2.length() + " letras.");
		System.out.println("");
		System.out.println("___________________________________________________________________________________");
		System.out.println("");

		if (frase1.length() > frase2.length()) {
			System.out.println("A primeira frase é a maior.");
			menor = frase2;
		} else {
			System.out.println("A segunda frase é a maior");
			menor = frase1;
		}
		System.out.println("");
		System.out.println("___________________________________________________________________________________");

		for (int i = menor.length() - 1; i >= 0; i--) {
			reverse += String.valueOf(menor.charAt(i));
		}
		System.out.println("");
		System.out.println("A menor frase ao contrário: " + reverse);
		System.out.println("");
		System.out.println("___________________________________________________________________________________");

	}
}
