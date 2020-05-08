package lista_revisao;

import java.util.Random;

public class ExercicioRevisao02 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int numeros[] = new int[5];
		int resultado[] = new int[5];
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = gerador.nextInt(10) + 1;
			
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " * 2 = " + (resultado[i] = numeros[i] * 2));
			} else {
				System.out.println(numeros[i] + " * 3 = " + (resultado[i] = numeros[i] * 3));
			}
		}
	}

}
