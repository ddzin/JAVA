package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Viagem2 {

	private static Scanner keyboard;

	public static void main(String[] args) {
		keyboard = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Digite a autonomia do veículo: ");
		double autonomia = keyboard.nextDouble();
		System.out.println("Digite o tempo da viagem: ");
		double tempo = keyboard.nextDouble();
		System.out.println("Digite a velocidade média da viagem: ");
		double velocidade = keyboard.nextDouble();

		double distanciaPercorrida = tempo * velocidade;
		double combustivelGasto = distanciaPercorrida / autonomia;

		System.out.println("Distância percorrida: " + distanciaPercorrida);
		System.out.println("Combustível gasto: " + df.format(combustivelGasto));

	}

}
