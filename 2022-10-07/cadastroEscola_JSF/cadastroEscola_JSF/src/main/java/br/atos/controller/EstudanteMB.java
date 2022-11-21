package br.atos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.atos.model.Endereco;
import br.atos.model.Estudante;

@ManagedBean(name = "estudanteBean")
@SessionScoped
public class EstudanteMB {
	
	private String turmaBean;
	private Double mediaBean;
	Estudante estudante = new Estudante();
	Endereco endereco = new Endereco();
	

	public String salvarEstudante() {

		estudante.setEndereco(endereco);
		estudantes.add(estudante);
		
		return "";
	}
	
	
	public Estudante getEstudante() {
		return estudante;
	}
	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	private List<Estudante> estudantes = new ArrayList<>();
	
	
	public List<Estudante> getEstudantes() {
		return estudantes;
	}
	public void setEstudantes(List<Estudante> estudantes) {
		this.estudantes = estudantes;
	}
	public String getTurmaBean() {
		return turmaBean;
	}
	public void setTurmaBean(String turmaBean) {
		this.turmaBean = turmaBean;
	}
	public Double getMediaBean() {
		return mediaBean;
	}
	public void setMediaBean(Double mediaBean) {
		this.mediaBean = mediaBean;
	}
	
	

}
