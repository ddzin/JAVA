package exemplos;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.printf("Digite um n�mero: ");
		
		int num = teclado.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("O n�mero � par");
		} else {
			System.out.println("O n�mero � �mpar");
		}
		
	}
}
