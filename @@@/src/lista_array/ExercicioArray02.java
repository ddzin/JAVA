package lista_array;

import java.util.Random;

public class ExercicioArray02 {

	public static void main(String[] args) {
		Random gerador = new Random();
				
		int arr[] = new int[10];
		int somaArray = 0;
				
		for(int i = 0; i < arr.length; i++) {
			arr[i] = gerador.nextInt(10);
					
			somaArray += arr[i];
			
			System.out.println(arr[i]);
		}
		
		System.out.println("A soma dos elementos é: " + somaArray);

	}

}
