package lista_construtores;

public class OficinaExecutavel {

	public static void main(String[] args) {
		
		
		// Ex.1
		Furadeira furadeira = new Furadeira();
		furadeira.setModelo("Bosch 650");
		furadeira.setFabricante("Bosch");
		furadeira.setPeso(2);
		furadeira.setDesgaste(2);
		furadeira.setPotencia(650);
		furadeira.setRotacao(7200);
		furadeira.setTensao(220);
		
		// Ex. 2
		Lixadeira lixadeira = new Lixadeira("L Lixa 250", "Lixas Mais", 5, 2, 7200, 250, 220);
		
		
	}

}
