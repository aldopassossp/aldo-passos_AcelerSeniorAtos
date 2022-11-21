package br.atos.crud_zoologico.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Animal implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnimal;
	private String nomeAnimal;
	private String especie;
	private String raca;
	private Date dataNascimento;
	
	@ManyToOne
	private Jaula jaula;
	
	public Long getIdAnimal() {
		return idAnimal;
	}
	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}
	public String getNomeAnimal() {
		return nomeAnimal;
	}
	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Jaula getJaula() {
		return jaula;
	}
	public void setJaula(Jaula jaula) {
		this.jaula = jaula;
	}

}
