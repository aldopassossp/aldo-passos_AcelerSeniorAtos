package br.atos.controller;

import br.atos.model.Endereco;

public class PessoaMB {
	
	private String nomeBean;
	private String cpfBean;
	
	Endereco enderecoBean;

	public String getNomeBean() {
		return nomeBean;
	}

	public void setNomeBean(String nomeBean) {
		this.nomeBean = nomeBean;
	}

	public String getCpfBean() {
		return cpfBean;
	}

	public void setCpfBean(String cpfBean) {
		this.cpfBean = cpfBean;
	}

	public Endereco getEnderecoBean() {
		return enderecoBean;
	}

	public void setEnderecoBean(Endereco enderecoBean) {
		this.enderecoBean = enderecoBean;
	}



}
