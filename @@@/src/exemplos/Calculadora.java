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
			System.out.println("1 - Adi��o");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Cancela");
			System.out.print("Digite uma op��o: ");
			
			opcao = teclado.nextInt();

			System.out.print("Digite o primeiro n�mero: ");
			numero1 = teclado.nextInt();
			System.out.print("Digite o segundo n�mero: ");
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
					System.out.println("Inv�lido, divis�o por zero!");
					break;
				}
				
				System.out.println("Resultado: " + (numero1 / numero2));
				
				break;
			}
			case 5: {
				break;
			}
			default: {
				System.out.println("Op��o inv�lida!");
			}
		}
		
		} while(opcao != 5);
		
	}

}
