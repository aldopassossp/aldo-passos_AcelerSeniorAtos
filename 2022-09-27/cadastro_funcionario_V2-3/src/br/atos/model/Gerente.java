package br.atos.model;

public class Gerente extends Funcionario {

	private String regional;
	private Double metaRegional;
	
	Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getRegional(){
		return regional;
	}
	
	public void setRegional(String regional){
		this.regional = regional;
	}
	
	public Double getMetaRegional(){
		return metaRegional;
	}
	
	public void setMetaRegional(Double metaRegional){
		this.metaRegional = metaRegional;
	}
	
}
