package exercicios;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinha2 {

	private static Scanner teclado;

	public static void main(String[] args) {

		Random gerador = new Random();
		teclado = new Scanner(System.in);
		int numAdvinha = gerador.nextInt(9) + 1;
		int num;
		int opcao;
		

		do {
			System.out.println("Jogo da Sorte");
			System.out.println("--------------");
			System.out.println("1 - Jogar com 3 tentativas");
			System.out.println("2 - Jogar com 5 tentativas");
			System.out.println("3 - Sair");
			System.out.println("Escolha um op��o:");
			
			opcao = teclado.nextInt();
			
		switch (opcao) {
		
		case 1: {
			System.out.println("Foi gerado um n�mero entre 1 e 9 aleatoriamente. Voc� tem 3 chances para advinhar!");
			System.out.println("Digite um n�mero: ");
			num = teclado.nextInt();
			for (int i = 2; i > 0; i--) {
				if (num == numAdvinha) {
					System.out.println("Parab�ns! Voc� acertou!");
					break;

				} else {
					System.out.println("Tentativas sobrando: " + i + ". Tente outra vez:");
					num = teclado.nextInt();
					if (i == 1) 
						System.out.println("Voc� perdeu. Tente denovo!");
					
					}

				}
			break;
			}
		case 2: {
			System.out.println("Foi gerado um n�mero entre 1 e 9 aleatoriamente. Voc� tem 5 chances para advinhar!");
			System.out.println("Digite um n�mero: ");
			num = teclado.nextInt();
			for (int i = 4; i > 0; i--) {
				if (num == numAdvinha) {
					System.out.println("Parab�ns! Voc� acertou!");
					break;

				} else {
					System.out.println("Tentativas sobrando: " + i + ". Tente outra vez:");
					num = teclado.nextInt();
					if (i == 1) 
						System.out.println("Voc� perdeu. Tente denovo!");

					}

				}
			}

		}
		

	} while (opcao != 3);
}
}