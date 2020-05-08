package exemplos;

import java.util.Random;

public class AplicandoArrays {

	public static void main(usandoString[] args) {

		Random gerador = new Random();

		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = gerador.nextInt(9) + 1;

		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");

		}
		
		
		// Imprimir na ordem reversa
		System.out.println();
		for (int i = array.length - 1; i >=0; i--) {
			System.out.print(array[i] + " ");

		}
	}
}
