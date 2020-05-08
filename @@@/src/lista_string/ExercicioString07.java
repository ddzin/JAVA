package lista_string;

import java.util.Scanner;

public class ExercicioString07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		String numero = teclado.nextLine();
		
		char numeroChar[] = numero.toCharArray();
		String numeroString[] = new String[numeroChar.length];
		
		for(int i = 0; i < numeroString.length; i++) {
			switch(numeroChar[i]) {
				case '0': {
					numeroString[i] = "Zero";
					break;
				}
				case '1': {
					numeroString[i] = "Um";
					break;
				}
				case '2': {
					numeroString[i] = "Dois";
					break;
				}
				case '3': {
					numeroString[i] = "Três";
					break;
				}
				case '4': {
					numeroString[i] = "Quatro";
					break;
				}
				case '5': {
					numeroString[i] = "Cinco";
					break;
				}
				case '6': {
					numeroString[i] = "Seis";
					break;
				}
				case '7': {
					numeroString[i] = "Sete";
					break;
				}
				case '8': {
					numeroString[i] = "Oito";
					break;
				}
				case '9': {
					numeroString[i] = "Nove";
					break;
				}
			}
		}
		for(int i = 0; i < numeroString.length; i++) {
			if(i + 1 != numeroString.length) {
				System.out.print(numeroString[i] + ", ");
			} else {
				System.out.print(numeroString[i] + ".");
			}
		}
		
	}

}
