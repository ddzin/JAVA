package lista_array;

import java.util.Random;

public class ExercicioArray01 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int arr[] = new int[10];
		int contPar = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = gerador.nextInt(9) + 1;
			
			if(arr[i] % 2 == 0) {
				contPar++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println(contPar + " números são pares");

	}

}
