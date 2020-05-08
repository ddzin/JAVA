package lista_array;

import java.text.DecimalFormat;
import java.util.Random;

public class ExercicioArray03 {

	public static void main(String[] args) {
		Random gerador = new Random();
		DecimalFormat df = new DecimalFormat("0.00");
		
		int arr[] = new int[10];
		double somaImpar = 0;
		int contImpar = 0;
				
		for(int i = 0; i < arr.length; i++) {
			arr[i] = gerador.nextInt(10);
					
			if(arr[i] % 2 != 0) {
				somaImpar += arr[i];
				contImpar++;
			}
			
			System.out.println(arr[i]);			
		}
		
		System.out.println("A média dos ímpares é: " + df.format(somaImpar / contImpar));

	}

}
