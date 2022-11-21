public class Funcionario{
	
	private String id;
	private String nome;
	private Double salarioLiquido;
	private String cpf;
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public Double getSalarioLiquido(){
		return salarioLiquido;
	}
	
	public void setSalarioLiquido(Double salarioLiquido){
		this.salarioLiquido = salarioLiquido;
	}
	
	public String getCpf(){
		return cpf;
	}
	
	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public Double calcularSalario(Double horaTrabalhada, int tipo){
		if(tipo == 1){
			Double salario = (60 * horaTrabalhada) - (((60 * horaTrabalhada)*15)/100);
			return salario;
		}
		else{
			Double salario = (40 * horaTrabalhada) - (((40 * horaTrabalhada)*7)/100);
			return salario;
		}
	}
	
	
}