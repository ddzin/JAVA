package oo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExecutaCalculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		CalculadoraCientifica calc = new CalculadoraCientifica();
		
		double numero1 = 0;
		double numero2 = 0;	
		double angulo = 0;
		do {
			System.out.println("Calculadora");
			System.out.println("0 - Cancela");
			System.out.println("1 - Adi��o");
			System.out.println("2 - Subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Seno");
			System.out.println("6 - Cosseno");
			System.out.print("Digite uma op��o: ");
			int opcao = teclado.nextInt();
			
			if(opcao == 0) {
				break;
			}
			
			if(opcao == 5 || opcao == 6) {
				System.out.println("Digite o �ngulo: ");
				angulo = teclado.nextDouble();
			} else {
				System.out.print("Digite o primeiro n�mero: ");
				numero1 = teclado.nextDouble();
				System.out.print("Digite o segundo n�mero: ");
				numero2 = teclado.nextDouble();
			}
							
			switch(opcao) {
				case 1: {			
					System.out.println("Resultado: " + df.format(calc.adicao(numero1, numero2)));			
					break;
				}	
				case 2: {			
					System.out.println("Resultado: " + df.format(calc.subtrair(numero1, numero2)));			
					break;
				}
				case 3: {		
					System.out.println("Resultado: " + df.format(calc.multiplicar(numero1, numero2)));	
					break;
				}
				case 4: {					
					System.out.println("Resultado: " + df.format(calc.dividir(numero1, numero2)));					
					break;
				}
				case 5: {					
					System.out.println("Resultado: " + df.format(calc.seno(angulo)));					
					break;
				}
				case 6: {					
					System.out.println("Resultado: " + df.format(calc.cosseno(angulo)));					
					break;
				}
				default: {
					System.out.println("Op��o inv�lida!");
				}
			}
			System.out.println("-------------------------");
		} while(true);			
	}
}