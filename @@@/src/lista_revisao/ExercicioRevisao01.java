package lista_revisao;

import java.util.Random;

public class ExercicioRevisao01 {

	public static void main(String[] args) {
		Random gerador = new Random();

		for(int i = 0; i < 10; i++) {
			int dado = gerador.nextInt(6) + 1;			
			System.out.println(dado);
		}
		
	}

}
