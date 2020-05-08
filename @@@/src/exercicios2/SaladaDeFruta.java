package exercicios2;

import java.util.Random;
import java.util.Scanner;

public class SaladaDeFruta {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random gerador = new Random();

		String fruta[] = new String[6];

		for (int i = 0; i < fruta.length; i++) {
			System.out.println("Digite uma fruta: ");
			fruta[i] = teclado.nextLine();
		}

		System.out.println("Quantas saladas de fruta serão formadas? ");
		int quantidade = teclado.nextInt();

		String salada[][] = new String[quantidade][3];

		for (int i = 0; i < quantidade; i++) {
			for (int j = 0; j < salada.length; j++) {
				salada[i][j] = fruta[gerador.nextInt(6)];
			}
		}

		for (int i = 0; i < salada.length; i++) {
			for (int j = 0; j < salada[i].length; j++) {
				System.out.print(salada[i][j] + " ");
			}
			System.out.println();
		}

	}

}
