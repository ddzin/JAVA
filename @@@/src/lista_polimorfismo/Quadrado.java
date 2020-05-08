package lista_polimorfismo;

public class Quadrado extends Forma_geometrica {
	
	private int lado;
	
	
	public Quadrado(String nome, int lado) { //construtores com parametro
	    super(nome);
	    this.lado = lado;
	}


	public Quadrado() {   //super class sem parametro
	    super();
	}


	public double getLado() {  //get ands sets
	    return lado;
	}

	 
	public void setLado(int lado) { //get ands sets
	    this.lado = lado;
	}

	 


	@Override //metodos
	public double calcularArea() {
	    return (this.getLado()*2);
	}

	 

	@Override //metodos
	public double calcularPerimetro() {
	    return (this.getLado()*4);

	 

	    
	}

	 

	    
}
	
