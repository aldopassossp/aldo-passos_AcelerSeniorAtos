package br.atos.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.atos.model.Gerente;
import br.atos.persistencia.GerenteDao;

public class RepositorioGerente implements InterfaceRepositorioGerente{

	
	List<Gerente> listaDeGerentees = new ArrayList<>();
	GerenteDao gerenteDao = new GerenteDao();
	
	@Override
	public boolean salvarGerente(Gerente gerente) {
		
		
		try {
			//listaDeGerentees.add(gerente);
			gerenteDao.salvarNoBanco(gerente);
			
		} catch (Exception e) {
			System.out.println("Deu erro no cadastro" + e);
			return false;
		}
		

		return true;
	}

	@Override
	public List<Gerente> listarGerente() {
		// TODO Auto-generated method stub
		return gerenteDao.ListarGerente();
	}

	@Override
	public boolean deletarGerente(String cpf) {
		
		for (Gerente gerente : listaDeGerentees) {
			//Verificar se vai funcionar
			if(gerente.getCpf().equals(cpf)) {
				
				listaDeGerentees.remove(gerente);
				return true;
			}
			
		}
		
		return false;
	}

	@Override
	public Gerente BuscarGerente(String cpf) {
		
		for(Gerente gerente: listaDeGerentees) {
			if(gerente.getCpf().equals(cpf)) {
				return gerente;
				
			}
			
		}
		
		return null;
	}

	@Override
	public boolean alterarGerente(Gerente gerenteAtual, Gerente gerenteNovo) {
		
		for(Gerente gerente: listaDeGerentees) {
			if(gerente == gerenteAtual) {
				listaDeGerentees.remove(gerenteAtual);
				listaDeGerentees.add(gerenteNovo);
				return true;
				
			}

		}
		
		return false;
	}

}
