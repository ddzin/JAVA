package lista_string;

import java.util.Scanner;

public class ExercicioString04 {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String palavra = teclado.nextLine();
			
		System.out.println("Digite um termo de inicio: ");
		String inicio = teclado.nextLine();
		
		System.out.println("Digite um termo final: ");
		String fim = teclado.nextLine();
		
		char vogais[] = {'a', 'e', 'i', 'o', 'u'};
		char letras[] = palavra.toLowerCase().toCharArray();
		
		int cont = 0;
		
		for(int i = 0; i < letras.length; i++) {
			for(int j = 0; j < vogais.length; j++) {
				if(letras[i] == vogais[j]) {
					cont++;
				}
			}
		}
			
		System.out.println("Número de caracteres: " + palavra.length());
		System.out.println("Maiúsculo: " + palavra.toUpperCase());
		System.out.println("Total vogais: " + cont);
		System.out.println("Termo de inicio encontrado: " + (palavra.startsWith(inicio) ? "Sim" : "Não"));
		System.out.println("Termo final encontrado: " + (palavra.endsWith(fim) ? "Sim" : "Não"));
	}

}
