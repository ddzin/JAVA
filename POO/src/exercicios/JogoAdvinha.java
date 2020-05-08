package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha {

	private static Scanner teclado;

	public static void main(String[] args) {

		Random gerador = new Random();
		teclado = new Scanner(System.in);
		int numAdvinha = gerador.nextInt(9);
		int num;
		System.out.println("Foi gerado um número entre 1 e 9 aleatoriamente. Você tem 5 chances para advinhar!");
		System.out.println("Digite um número: ");
		num = teclado.nextInt();

		for (int i = 4; i > 0; i--) {
			if (num == numAdvinha) {
				System.out.println("Parabéns! Você acertou!");
				break;

			} else {
				System.out.println("Tentativas sobrando: " + i + ". Tente outra vez:");
				num = teclado.nextInt();
				if (i == 1) {
					System.out.println("Você perdeu. Tente denovo!");

				}

			}
		}

	}
}