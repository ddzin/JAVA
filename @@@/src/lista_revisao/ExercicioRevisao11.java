package lista_revisao;

import java.util.Random;

public class ExercicioRevisao11 {

	public static void main(String[] args) {
		Random gerador = new Random();
		
		int numero[] = new int[10];
		for(int i = 0; i < numero.length; i++) {
			numero[i] = gerador.nextInt(100);
		}
		
	}

}
