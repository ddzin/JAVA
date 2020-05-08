package lista_string;

import java.util.Scanner;

public class ExercicioString08 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite sua data de nascimento: ");
		String data = teclado.nextLine();
		
		String dataSeparada[] = data.split("/");
		String mes = "";
		
		switch(dataSeparada[1]) {
			case "01": {
				mes = "janeiro";
				break;
			}
			case "02": {
				mes = "fevereiro";
				break;
			}
			case "03": {
				mes = "março";
				break;
			}
			case "04": {
				mes = "abril";
				break;
			}
			case "05": {
				mes = "maio";
				break;
			}
			case "06": {
				mes = "junho";
				break;
			}
			case "07": {
				mes = "julho";
				break;
			}
			case "08": {
				mes = "agosto";
				break;
			}
			case "09": {
				mes = "setembro";
				break;
			}
			case "10": {
				mes = "outubro";
				break;
			}
			case "11": {
				mes = "novembro";
				break;
			}
			case "12": {
				mes = "dezembro";
				break;
			}
		}
		System.out.println("Você nasceu em " + dataSeparada[0] + " de " + mes + " de " + dataSeparada[2] + ".");

	}

}
