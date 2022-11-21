package br.atos.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "endereco")
@SessionScoped
public class EnderecoMB {
	
	private String estadoBean;
	private String cidadeBean;
	private String ruaBean;
	
	public String getEstadoBean() {
		return estadoBean;
	}
	public void setEstadoBean(String estadoBean) {
		this.estadoBean = estadoBean;
	}
	public String getCidadeBean() {
		return cidadeBean;
	}
	public void setCidadeBean(String cidadeBean) {
		this.cidadeBean = cidadeBean;
	}
	public String getRuaBean() {
		return ruaBean;
	}
	public void setRuaBean(String ruaBean) {
		this.ruaBean = ruaBean;
	}

}
