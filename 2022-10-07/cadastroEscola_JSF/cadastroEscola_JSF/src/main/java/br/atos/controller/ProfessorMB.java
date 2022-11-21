package br.atos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.atos.model.Endereco;
import br.atos.model.Professor;

@ManagedBean(name = "professorBean")
@SessionScoped
public class ProfessorMB extends PessoaMB{
	
	private List<Professor> professores = new ArrayList<>();
	Professor professor = new Professor();
	Endereco endereco = new Endereco();
	
	public String salvarProfessor() {

		professor.setEndereco(endereco);
		professores.add(professor);
		
		return "";
	}
	
	
	
	public List<Professor> getProfessores() {
		return professores;
	}
	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
