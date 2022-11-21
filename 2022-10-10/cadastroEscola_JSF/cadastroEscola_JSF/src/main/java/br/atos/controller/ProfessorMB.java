package br.atos.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.atos.model.Endereco;
import br.atos.model.Estudante;
import br.atos.model.Professor;

@ManagedBean(name = "professorBean")
@SessionScoped
public class ProfessorMB extends PessoaMB{
	
	private List<Professor> professores = new ArrayList<>();
	Professor professor = new Professor();
	Endereco endereco = new Endereco();
	
	public String salvarProfessor() {
		
		int valida = professores.indexOf(professor);
		if(valida < 0) {
			professores.add(professor);
		}
		
		limparProfessor();
		return "";
	}
	
	private void limparProfessor() {
		this.professor = new Professor();
		
	}

	public String excluirProfessor(Professor professorItem) {
		professores.remove(professorItem);
		return "";
	}
	
	public String editarProfessor(Professor professorItem) {
		professor = professorItem;
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
