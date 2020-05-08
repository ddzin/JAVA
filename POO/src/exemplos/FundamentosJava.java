package exemplos;

public class FundamentosJava {

	public static void main(usandoString[] args) {
		
		byte n1 = 7;
		short n2 = 7;
		int resultado = n1 + n2;
	
		System.out.println(resultado);
		
		//byte num1 = 7;
		//int num2 = 7;
		//short resultado1 = num1 + num2;
		
		//Operação inválida pelo fato de uma variável do tipo short(16bits) não comportar uma variável do tipo int(32bits)
		
		byte num1 = 7;
		short num2 = 7;
		int resultado1 = num1++ + num2; //14
		int resultado2 = ++num1 + num2; //16
		
		System.out.println(resultado1 + " - " + resultado2);	

		int valor1 = 10;
		int valor2 = 20;
	    System.out.println(valor1/valor2);
	    //Cuidado com divisão de numero inteiros
	    
	    
	    char letra = 83;
	    System.out.println(letra);
	    
	    
	 
	    
	
	}

}
