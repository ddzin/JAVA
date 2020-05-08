package lista_revisao;

import java.util.Random;

public class ExercicioRevisao05 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int matA[][] = new int[4][4];
		int matB[][] = new int[4][4];
		int subtracao[][] = new int[4][4];

		for(int i = 0; i < matA.length; i++) {
			for(int j = 0; j < matA[i].length; j++) {
				matA[i][j] = gerador.nextInt(10);
				matB[i][j] = gerador.nextInt(10);				
				subtracao[i][j] = matA[i][j] - matB[i][j]; 
			}
		}
		
		for(int i = 0; i < matA.length; i++) {
			for(int j = 0; j < matA[i].length; j++) {
				System.out.print(matA[i][j] + " | ");
			}			
			System.out.println();
		}
		System.out.println("-------------------");
		for(int i = 0; i < matB.length; i++) {
			for(int j = 0; j < matB[i].length; j++) {
				System.out.print(matB[i][j] + " | ");
			}			
			System.out.println();
		}
		System.out.println("-------------------");
		for(int i = 0; i < subtracao.length; i++) {
			for(int j = 0; j < subtracao[i].length; j++) {
				System.out.print(subtracao[i][j] + " | ");
			}			
			System.out.println();
		}
		
	}

}
