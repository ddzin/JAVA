package lista_polimorfismo;

import java.util.Random;
import java.text.DecimalFormat;

public class Executavel {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("0.00");
		Random valor = new Random();
		Forma_geometrica[] formas = new Forma_geometrica[7];

		for (int i = 0; i < formas.length; i++) {
			int tipo = valor.nextInt(7);
			switch (tipo) {
			case 0: {
				Quadrado quadrado = new Quadrado("Quadrado", (valor.nextInt(9) + 1));
				formas[i] = quadrado;
				break;
			}
			case 1: {
				Circulo circulo = new Circulo("Circulo", (valor.nextDouble()));
				formas[i] = circulo;
				break;
			}
			case 2: {
				Retangulo retangulo = new Retangulo("Retangulo", (valor.nextDouble()), (valor.nextDouble()));
				formas[i] = retangulo;
				break;
			}
			case 3: {
				Losango losango = new Losango("Losango", valor.nextDouble(), valor.nextDouble(),
						valor.nextDouble(), valor.nextDouble());
				formas[i] = losango;
				break;
			}
			case 4: {
				TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo("Triangulo Retangulo", valor.nextDouble(), valor.nextDouble());
				formas[i] = trianguloRetangulo;
				break;
			}
			case 5: {
				TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero("Triangulo Equilatero", valor.nextDouble());
				formas[i] = trianguloEquilatero;
				break;
			}
			case 6: {
				TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles("Triangulo Isosceles", valor.nextDouble(), valor.nextDouble());
				formas[i] = trianguloIsosceles;
				break;
			}
			
		}
	}
	    for (int i = 0; i < formas.length; i++) {
	        System.out.println("Nome da Figura: " + formas[i].getNome());
	        System.out.println("Perimetro: " + df.format(formas[i].calcularPerimetro()));
	        System.out.println("Area: " + df.format(formas[i].calcularArea()));
	    	   
}
}
}