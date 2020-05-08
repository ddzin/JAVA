package exemplos;

import java.util.Scanner;

public class EstruturasJava {

	private static Scanner keyboard;

	public static void main(usandoString[] args) {

		keyboard = new Scanner(System.in);

		int num = keyboard.nextInt();

		System.out.print("Digite um número: ");

		if (num % 2 == 0) {
			System.out.println("O número é par");

		} else {
			System.out.println("O número é ímpar");
		}

	}

}
