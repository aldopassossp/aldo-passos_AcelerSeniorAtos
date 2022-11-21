public class Pessoa{
	String nome;
	String cpf;

	public Pessoa(String nome, String cpf){
	
		this.cpf = nome;
		this.nome = cpf;	

	}	

	public String getCpf() {
	
		return cpf;

	}

	public  String getNome() {
	
		return nome;	

	}

	public void setCpf(String cpf) {

	        this.cpf = cpf;
    	
	}

	public void setNome(String nome) {

	        this.nome = nome;
    	
	}

}