package lista_revisao;

import java.util.Random;

public class ExercicioRevisao06 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int mat[][] = new int[3][3];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {								
				if(i == j) {
					mat[i][j] = (gerador.nextInt(10) + 1) * 4;
				} else {
					mat[i][j] = (gerador.nextInt(10) + 1) * 2;
				}
				
				System.out.print(mat[i][j] + "  |  ");
			}
			System.out.println();
		}
		
		
	}

}
