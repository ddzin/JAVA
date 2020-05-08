package lista_associacao;

public class Empresa {
	
	private String nome;
	private Endereco enderecoEmpresa;
	private Contato contatoEmpresa;
	private Linha listaLinhas[];
	
	public Empresa(String nome, Endereco enderecoEmpresa, Contato contatoEmpresa, Linha[] listaLinhas) {
		super();
		this.nome = nome;
		this.enderecoEmpresa = enderecoEmpresa;
		this.contatoEmpresa = contatoEmpresa;
		this.listaLinhas = listaLinhas;
	}

	public Empresa() {
		super();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEnderecoEmpresa() {
		return enderecoEmpresa;
	}

	public void setEnderecoEmpresa(Endereco enderecoEmpresa) {
		this.enderecoEmpresa = enderecoEmpresa;
	}

	public Contato getContatoEmpresa() {
		return contatoEmpresa;
	}

	public void setContatoEmpresa(Contato contatoEmpresa) {
		this.contatoEmpresa = contatoEmpresa;
	}

	public Linha[] getListaLinhas() {
		return listaLinhas;
	}

	public void setListaLinhas(Linha[] listaLinhas) {
		this.listaLinhas = listaLinhas;
	}

	public void indentificarMotoristaMaisNovo() {
		Motorista maisNovo = this.getListaLinhas()[0].getOnibus().getMotorista();
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			if(maisNovo.getIdade() > this.getListaLinhas()[i].getOnibus().getMotorista().getIdade()) {
				maisNovo = this.getListaLinhas()[i].getOnibus().getMotorista();
			}
				
		}
		
		System.out.println("O nome do motorista mais novo é: " + maisNovo.getNome());
		System.out.println("Sua idade é: " + maisNovo.getIdade()+" anos");
		System.out.println("_______________________________________________________________");
		
	}

	public void calcularFaturamentoPorLinha() {
		double faturamento = 0;
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			faturamento = this.getListaLinhas()[i].calcularFaturamento();
			System.out.println(" ");
			System.out.println("Faturamento da linha " + (i+1) + ": " + "R$"+faturamento);
	
			
		}
		System.out.println("_______________________________________________________________");
		
	}

	public void recuperarContatoPorBairro(String bairro) {
		for(int i = 0; i < this.getListaLinhas().length; i++) {
			this.getListaLinhas()[i].recuperarContatoPassageiros(bairro);			
		}
		
	}
	
	
	
	
	
	
}
