package lista_string;

import java.util.Scanner;

public class ExercicioString03 {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = teclado.nextLine();
		
		char letras[] = new char[frase.length()];
		letras = frase.toUpperCase().toCharArray();
		
		char vogais[] = {'A', 'E', 'I', 'O', 'U'};
		int cont[] = new int[5];
			
		for(int i = 0; i < letras.length; i++) {
			if(letras[i] == vogais[0]) {
				cont[0]++;
			} else {
				if(letras[i] == vogais[1]) {
					cont[1]++;
				} else {
					if(letras[i] == vogais[2]) {
						cont[2]++;
					} else {
						if(letras[i] == vogais[3]) {
							cont[3]++;
						} else {
							if(letras[i] == vogais[4]) {
								cont[4]++;
							}
						}
					}
				}
			}
		}
		
		System.out.println(frase);
		
		for(int i = 0; i < cont.length; i++) {
			System.out.println("Vogal " + vogais[i] + ": " + cont[i]);
		}
		
	}

}
