package br.atos.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.atos.model.Coordenador;

public class RepositorioCoordenador implements InterfaceRepositorioCoordenador{
	
	List<Coordenador> listaDeCoordenadores = new ArrayList<>();
	
	@Override
	public boolean salvarCoordenador(Coordenador coordenador) {
		
		
		try {
			listaDeCoordenadores.add(coordenador);
			
			
		} catch (Exception e) {
			System.out.println("Deu erro no cadastro" + e);
			return false;
		}
		

		return true;
	}

	@Override
	public List<Coordenador> listarCoordenador() {
		// TODO Auto-generated method stub
		return listaDeCoordenadores;
	}

	@Override
	public boolean deletarCoordenador(String cpf) {
		
		for (Coordenador coordenador : listaDeCoordenadores) {
			//Verificar se vai funcionar
			if(coordenador.getCpf().equals(cpf)) {
				
				listaDeCoordenadores.remove(coordenador);
				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public Coordenador BuscarCoordenador(String cpf) {
		
		for(Coordenador coordenador: listaDeCoordenadores) {
			if(coordenador.getCpf().equals(cpf)) {
				return coordenador;
				
			}
			
		}
		
		return null;
	}

	@Override
	public boolean alterarCoordenador(Coordenador coordenadorAtual, Coordenador coordenadorNovo) {
		
		for(Coordenador coordenador: listaDeCoordenadores) {
			if(coordenador == coordenadorAtual) {
				listaDeCoordenadores.remove(coordenadorAtual);
				listaDeCoordenadores.add(coordenadorNovo);
				return true;
				
			}

		}
		
		return false;
	}

}
