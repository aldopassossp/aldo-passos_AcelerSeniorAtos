package br.atos.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.atos.model.Funcionario;

public class RepositorioFuncionario implements InterfaceRepositorioFuncionario{
	
	List<Funcionario> listaDeFuncionarios = new ArrayList<>();
	
	@Override
	public boolean salvarFuncionario(Funcionario funcionario) {
		
		try {
			
			listaDeFuncionarios.add(funcionario);
			
		}catch(Exception e) {
			System.out.println("Erro ao salvar o cadastro!" + e);
			return false;
		}
		
		return true;
	}
	
	@Override
	public List<Funcionario> listarFuncionario(){
		return listaDeFuncionarios;
	}

	@Override
	public boolean deletarFuncionario(String cpf) {
		
		for (Funcionario funcionario : listaDeFuncionarios) {
			//Verificar se vai funcionar
			if(funcionario.getCpf().equals(cpf)) {
				
				listaDeFuncionarios.remove(funcionario);
				return true;
			}
			
		}
		
		return false;
	}

	
}
