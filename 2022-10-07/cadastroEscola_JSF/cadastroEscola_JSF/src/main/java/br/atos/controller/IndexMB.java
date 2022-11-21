package br.atos.controller;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "index")
public class IndexMB {
	
	public String cadastrarEstudante() {
		return "cadastroestudante.xhtml";
	}
	
	public String cadastrarProfessor() {
		return "cadastroprofessor.xhtml";
	}
}
