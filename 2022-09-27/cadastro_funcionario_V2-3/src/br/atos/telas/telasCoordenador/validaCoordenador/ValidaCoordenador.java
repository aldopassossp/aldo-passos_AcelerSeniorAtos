package br.atos.telas.telasCoordenador.validaCoordenador;

import br.atos.model.Coordenador;
import br.atos.repositorio.RepositorioCoordenador;

public class ValidaCoordenador {
	
	public String validarCoordenador(Coordenador coordenador, RepositorioCoordenador repositorioCoordenador) {
		
		String mensagemErro = null;
		
		if((repositorioCoordenador.BuscarCoordenador(coordenador.getCpf())) != null) {
			mensagemErro = "CPF já cadastrado!";
			return mensagemErro;
		}
		
		if(coordenador.getCpf().length() < 3) {
			
			mensagemErro = "CPF precisa ter no mínimo 3 digitos!";
			return mensagemErro;
		}
		
		if(coordenador.getNome().length() < 1) {
			
			mensagemErro = "Nome precisa ter no mínimo 1 digitos!";
			return mensagemErro;
		}
		
		if(coordenador.getNome().length() > 10) {
			
			mensagemErro = "Nome pode ter no máximo 10 caracteres!";
			return mensagemErro;
		}
		
		return mensagemErro;
	}

}
