package exemplos;

import java.util.Random;

public class Matrizes {

	public static void main(String[] args) {
		Random gerador = new Random();
			
		int[][] matrizA = new int[3][3];
		int[][] matrizB = new int[3][3];
		int[][] resultado = new int[3][3];
		
		
		for(int i = 0; i < matrizA.length; i++) {
			for(int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = gerador.nextInt(9) + 1;
				System.out.print(matrizA[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		for(int i = 0; i < matrizB.length; i++) {
			for(int j = 0; j < matrizB[i].length; j++) {
				matrizB[i][j] = gerador.nextInt(9) + 1;
				System.out.print(matrizB[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		for(int i = 0; i < resultado.length; i++) {
			for(int j = 0; j < resultado[i].length; j++) {
				resultado[i][j] = matrizA[i][j] + matrizB[i][j];
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}

	}

}
