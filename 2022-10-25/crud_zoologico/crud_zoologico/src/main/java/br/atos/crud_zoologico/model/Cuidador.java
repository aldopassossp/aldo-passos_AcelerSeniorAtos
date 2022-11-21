package br.atos.crud_zoologico.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cuidador implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCuidador;
	private String matricula;
	private String nome;
	
	@ManyToMany
	private List<Jaula> jaulas;
	
	public Long getIdCuidador() {
		return idCuidador;
	}
	public void setIdCuidador(Long idCuidador) {
		this.idCuidador = idCuidador;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Jaula> getJaulas() {
		return jaulas;
	}
	public void setJaulas(List<Jaula> jaulas) {
		this.jaulas = jaulas;
	}
	
	
}
