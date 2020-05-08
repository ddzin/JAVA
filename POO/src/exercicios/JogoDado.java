package exercicios;

import java.util.Random;

public class JogoDado {

	public static void main(String[] args) {
		Random gerador = new Random();
		int[] dado = new int[5];

		for (int i = 0; i < dado.length; i++) {
			dado[i] = gerador.nextInt(6) + 1;
		}

		for (int i = 0; i < dado.length; i++) {
			System.out.print(dado[i] + " ");
		}

		System.out.println();
		for (int i = dado.length - 1; i >= 0; i--) {
			System.out.print(dado[i] + " ");

		}
	}
}
