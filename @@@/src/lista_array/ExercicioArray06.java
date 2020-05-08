package lista_array;

import java.util.Scanner;

public class ExercicioArray06 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int arr[] = new int[3];

		for(int i = 0; i < arr.length; i++) {
			System.out.println("Digite um valor de 1 a 9: ");
			arr[i] = teclado.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.println(arr[i] + " X " + j + " = " + arr[i] * j);
			}
			
			System.out.println("--------------------");
		}
	}

}
