package br.atos.telas.telasGerente.validaGerente;

import br.atos.model.Gerente;
import br.atos.repositorio.RepositorioGerente;

public class ValidaGerente {
	
	public String validarGerente(Gerente gerente, RepositorioGerente repositorioGerente) {
		
		String mensagemErro = null;
		
		if((repositorioGerente.BuscarGerente(gerente.getCpf())) != null) {
			
			mensagemErro = "CPF já cadastrado!";
			return mensagemErro;
		}
		
		if(gerente.getCpf().length() < 3) {
			
			mensagemErro = "CPF precisa ter no mínimo 3 digitos!";
			return mensagemErro;
		}
		
		if(gerente.getNome().length() < 1) {
			
			mensagemErro = "Nome precisa ter no mínimo 1 digitos!";
			return mensagemErro;
		}
		

		
		if(gerente.getNome().length() > 10) {
			
			mensagemErro = "Nome pode ter no máximo 10 caracteres!";
			return mensagemErro;
		}
		
		return mensagemErro;
	}

}
