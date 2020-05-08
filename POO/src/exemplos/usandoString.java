package exemplos;

public class usandoString {

	public static void main(String[] args) {
		String disciplina = new String();
		disciplina = "Programação Orientada a Objetos";
		
		String curso = new String("Análise e Desenvolvimento de Sistemas");
		
		String aula = "Aula sobre Strings";
		
		String assunto = null;
		
		System.out.println(disciplina);
		System.out.println(curso);
		System.out.println(aula);
		System.out.println(assunto);
		
		System.out.println(disciplina.length());
		
		
		System.out.println(disciplina.charAt(12));
		
		char[] letras = new char[11];
		
		disciplina.getChars(0, 2, letras, 0);
		
		for (int i = 0; i < letras.length; i++) {
			System.out.println("O caracter da posição " + i + " é : " + letras[i]);
		}
		
		String aula2 = new String  ("Aula sobre Strings");
		
		if (aula == aula2) {
			System.out.println("São nomes iguais");
		} else {
			System.out.println("São nomes diferentes");
		}
		
		if (aula.equals(aula2)) {
			System.out.println("São nomes iguais");
		} else {
			System.out.println("São nomes diferentes");
		}
	}

}
