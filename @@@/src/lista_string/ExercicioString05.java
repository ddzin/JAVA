package lista_string;

import java.util.Scanner;

public class ExercicioString05 {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.print("Digite um verbo regular: ");
		String verbo = teclado.nextLine();
		
		/*
		String conjugar[] = new String[6];		
		conjugar[0] = verbo.replace("ar", "o");
		conjugar[1] = verbo.replace("ar", "as");
		conjugar[2] = verbo.replace("ar", "a");
		conjugar[3] = verbo.replace("ar", "amos");
		conjugar[4] = verbo.replace("ar", "ais");
		conjugar[5] = verbo.replace("ar", "am");
		
		for(int i = 0; i < conjugar.length; i++) {
			System.out.println(conjugar[i]);
		}
		*/
		
		String radical = verbo.substring(0, (verbo.length() - 2));
		System.out.println("Verbo " + verbo);
		System.out.println("Eu " + radical + "o");
		System.out.println("Tu " + radical + "as");
		System.out.println("Ele " + radical + "a");
		System.out.println("Nós " + radical + "amos");
		System.out.println("Vós " + radical + "ais");
		System.out.println("Eles " + radical + "am");
		
		/*
		System.out.println("Verbo " + verbo);
		System.out.println("Eu " + verbo.toLowerCase().replaceAll("ar$", "o"));
		System.out.println("Tu " + verbo.toLowerCase().replaceAll("ar$", "as"));
		System.out.println("Ele " + verbo.toLowerCase().replaceAll("ar$", "a"));
		System.out.println("Nós " + verbo.toLowerCase().replaceAll("ar$", "amos"));
		System.out.println("Vós " + verbo.toLowerCase().replaceAll("ar$", "ais"));
		System.out.println("Eles " + verbo.toLowerCase().replaceAll("ar$", "am"));
		*/
	}

}
