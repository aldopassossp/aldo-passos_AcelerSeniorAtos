package br.atos.crud_zoologico.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Jaula implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idJaula;
	private String nomeZoologico;
	private String bloco;
	private int numeroJaula;
	
	@ManyToMany
	private List<Cuidador> cuidadores;
	
	public Long getIdJaula() {
		return idJaula;
	}
	public void setIdJaula(Long idJaula) {
		this.idJaula = idJaula;
	}
	public String getNomeZoologico() {
		return nomeZoologico;
	}
	public void setNomeZoologico(String nomeZoologico) {
		this.nomeZoologico = nomeZoologico;
	}
	public String getBloco() {
		return bloco;
	}
	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	public int getNumeroJaula() {
		return numeroJaula;
	}
	public void setNumeroJaula(int numeroJaula) {
		this.numeroJaula = numeroJaula;
	}
	public List<Cuidador> getCuidadores() {
		return cuidadores;
	}
	public void setCuidadores(List<Cuidador> cuidadores) {
		this.cuidadores = cuidadores;
	}


}
