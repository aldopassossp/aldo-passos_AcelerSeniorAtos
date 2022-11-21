package br.atos.model;

public class Gerente extends Funcionario{

	private String regional;
	private Double metaRegional;
	
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
