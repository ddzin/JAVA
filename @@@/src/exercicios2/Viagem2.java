package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Viagem2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		double horasViagem;
		double velocidadeMedia;
		double autonomia;
		
		System.out.print("Tempo de viagem: ");
		horasViagem = teclado.nextDouble();
		
		System.out.print("Velocidade m�dia: ");
		velocidadeMedia = teclado.nextDouble();
		
		System.out.print("Autonomia: ");
		autonomia = teclado.nextDouble();
		
		
		double distanciaPercorrida = velocidadeMedia * horasViagem;
		
		double combustivelGasto = distanciaPercorrida / autonomia;
		
		System.out.println("Dist�ncia percorrida: " + distanciaPercorrida);
		System.out.println("Combust�vel gasto: " + df.format(combustivelGasto));

	}

}
