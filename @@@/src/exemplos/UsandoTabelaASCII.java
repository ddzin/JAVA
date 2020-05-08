package exemplos;

public class UsandoTabelaASCII {

	public static void main(String[] args) {

		char letraG = 71;
		char letraU = 117;
		char letraS = 115;
		char letraT = 116;
		char letraA = 97;
		char letraV = 118;
		char letraO = 111;
		
		int resultado = letraG + letraU + letraS + letraT + letraA + letraV + letraO;
		
		if(resultado > 500) {
			System.out.println("Nome: " + letraG + letraU + letraS + letraT + letraA + letraV + letraO);
		} else {
			System.out.println("Nome: " + letraO + letraV + letraA + letraT + letraS + letraU + letraG);
		}
		
		
	}

}
