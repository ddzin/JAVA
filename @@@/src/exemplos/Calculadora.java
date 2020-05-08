package exemplos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int opcao;
		int numero1;
		double numero2;
		
		do {
			System.out.println("Calculadora");
			System.out.println("1 - Adição");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("5 - Cancela");
			System.out.print("Digite uma opção: ");
			
			opcao = teclado.nextInt();

			System.out.print("Digite o primeiro número: ");
			numero1 = teclado.nextInt();
			System.out.print("Digite o segundo número: ");
			numero2 = teclado.nextDouble();
			
			
		switch(opcao) {
			case 1: {
				
				System.out.println("Resultado: " + (numero1 + numero2));
				
				break;
			}	
			case 2: {
				
				System.out.println("Resultado: " + (numero1 - numero2));
				
				break;
			}
			case 3: {
				
				System.out.println("Resultado: " + (numero1 * numero2));
				
				break;
			}
			case 4: {
								
				if(numero2 == 0) {
					System.out.println("Inválido, divisão por zero!");
					break;
				}
				
				System.out.println("Resultado: " + (numero1 / numero2));
				
				break;
			}
			case 5: {
				break;
			}
			default: {
				System.out.println("Opção inválida!");
			}
		}
		
		} while(opcao != 5);
		
	}

}
