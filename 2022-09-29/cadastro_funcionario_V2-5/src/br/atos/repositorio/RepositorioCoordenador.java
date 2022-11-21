package br.atos.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.atos.model.Coordenador;
import br.atos.persistencia.CoordenadorDao;

public class RepositorioCoordenador implements InterfaceRepositorioCoordenador{
	
	List<Coordenador> listaDeCoordenadores = new ArrayList<>();
	CoordenadorDao coordenadorDao = new CoordenadorDao();
	
	@Override
	public boolean salvarCoordenador(Coordenador coordenador) {
		
		
		try {
			//listaDeCoordenadores.add(coordenador);
			coordenadorDao.salvarNoBanco(coordenador);
			
		} catch (Exception e) {
			System.out.println("Deu erro no cadastro" + e);
			return false;
		}
		

		return true;
	}

	@Override
	public List<Coordenador> listarCoordenador() {
		
		return coordenadorDao.ListarCoordenador();
	}

	@Override
	public boolean deletarCoordenador(String cpf) {
		
		boolean validaDelete;
		for (Coordenador coordenador : listaDeCoordenadores) {
			//Verificar se vai funcionar
			if(coordenador.getCpf().equals(cpf)) {
				
//				listaDeCoordenadores.remove(coordenador);
				validaDelete = coordenadorDao.deletarCoordenador(coordenador.getCpf());
				return validaDelete;
			}
			
		}
		
		return false;
		
	}

	@Override
	public Coordenador BuscarCoordenador(String cpf) {
		
		for(Coordenador coordenador: coordenadorDao.ListarCoordenador()) {
			if(coordenador.getCpf().equals(cpf)) {
				
				return coordenador;
			}
			
		}
		
		return null;
	}

	@Override
	public boolean alterarCoordenador(Coordenador coordenadorAtual, Coordenador coordenadorNovo) {
		
//		for(Coordenador coordenador: listaDeCoordenadores) {
//			if(coordenador == coordenadorAtual) {
//				listaDeCoordenadores.remove(coordenadorAtual);
//				listaDeCoordenadores.add(coordenadorNovo);
//				return true;
//				
//			}
//
//		}
		
		for(Coordenador coordenador: coordenadorDao.ListarCoordenador()) {
			if(coordenador.getCpf().equals(coordenadorAtual.getCpf())) {
//				listaDeCoordenadores.remove(coordenadorAtual);
//				listaDeCoordenadores.add(coordenadorNovo);
				coordenadorDao.alterarCoordenador(coordenadorNovo);
				return true;
				
			}

		}
		
		return false;
		
	}

}
