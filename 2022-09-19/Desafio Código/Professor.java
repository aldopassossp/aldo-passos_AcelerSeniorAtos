public class Professor extends Pessoa{
	private String disciplina;
	private String salario;	
	
	public Professor(String nome, String cpf) {
	
		super(nome, cpf);

	}

	public String getDisciplina(){
	
		return disciplina;

	}

	public String getSalario() {
	
		return salario;	

	}	

	public void setDisciplina(String disciplina) {

	        this.disciplina = disciplina;
    	
	}

	public void setSalario(String salario) {

	        this.salario = salario;
    	
	}
}