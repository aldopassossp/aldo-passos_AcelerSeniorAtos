package br.atos.model;

public class Coordenador extends Funcionario{

	Endereco endereco;
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	private String loja;
	private Double metaDaLoja;
	
	public String getLoja(){
		return loja;
	}
	
	public void setLoja(String loja){
		this.loja = loja;
	}
	
	public Double getMetaDaLoja(){
		return metaDaLoja;
	}
	
	public void setMetaDaLoja(Double metaDaLoja){
		this.metaDaLoja = metaDaLoja;
	}

	
}
