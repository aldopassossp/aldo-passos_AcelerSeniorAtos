package br.atos.telas;

import java.util.List;

import javax.swing.JFrame;

import br.atos.model.Funcionario;

public class ListarFuncionario {
	
	public void apresentarLista(List<Funcionario> listaDeFuncionarios, JFrame menuInicial) {
		
		int quantidadeDeLinhas = listaDeFuncionarios.size();
		
		String [][] tabelaString = new String [quantidadeDeLinhas][3];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(Funcionario funcionario: listaDeFuncionarios) {
			
			tabelaString[posicaoLinha][posicaoColuna] = funcionario.getNome();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = funcionario.getCpf();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = funcionario.getSalarioLiquido().toString();
			posicaoColuna = 0;
			posicaoLinha++;
		}
	}

}
