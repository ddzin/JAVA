package exemplos;

import java.util.Scanner;

public class EstruturasJava {

	private static Scanner keyboard;

	public static void main(usandoString[] args) {

		keyboard = new Scanner(System.in);

		int num = keyboard.nextInt();

		System.out.print("Digite um n�mero: ");

		if (num % 2 == 0) {
			System.out.println("O n�mero � par");

		} else {
			System.out.println("O n�mero � �mpar");
		}

	}

}
