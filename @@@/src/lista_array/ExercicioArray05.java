package lista_array;

import java.util.Random;

public class ExercicioArray05 {

	public static void main(String[] args) {
		Random gerador = new Random();

		int origem[] = new int[10];
		int resultado[] = new int[10];
		
		for(int i = 0; i < origem.length; i++) {
			origem[i] = gerador.nextInt(100);
			
			if(origem[i] % 2 == 0) {
				resultado[i] = 1;
			} else {
				resultado[i] = 0;
			}
			
		}
		
		System.out.println();
		
		for(int i = 0; i < origem.length; i++) {
			System.out.print(origem[i] + " - " + resultado[i] + " - ");
		}
		
	}

}
