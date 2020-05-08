package exemplos;

import java.util.Scanner;

public class EstruturasJava {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o número de interações: ");
		int interacoes = teclado.nextInt();
		
		int resultado = 0;
		
		for(int i = 0; i < interacoes ; i++) {
			System.out.print("Digite um número: ");
			int numero = teclado.nextInt();
			
			if(numero % 2 == 0) {
				resultado = (resultado + i) * 2;
			} else {
				resultado = (resultado + i) * 3;				
			}
		}
		
		System.out.println("Resultado: " + resultado);

	}

}
