package br.atos.repositorio;

import java.util.List;

import br.atos.model.Coordenador;

public interface InterfaceRepositorioCoordenador {
	
	public boolean salvarCoordenador(Coordenador coordenador);
	public List<Coordenador> listarCoordenador();
	public boolean deletarCoordenador(String cpf);
	public Coordenador BuscarCoordenador(String cpf);
	public boolean alterarCoordenador(Coordenador coordenadorAtual,Coordenador coordenadorNovo);

}
