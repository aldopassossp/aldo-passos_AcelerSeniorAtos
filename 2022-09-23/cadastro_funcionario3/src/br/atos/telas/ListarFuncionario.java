package br.atos.telas;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
			
			tabelaString[posicaoLinha][posicaoColuna] = Double.toString(funcionario.getSalarioLiquido());
			posicaoColuna = 0;
			posicaoLinha++;
		}
		
		String colunasTitulos[] = {"Nome", "CPF", "Salário Liquido"};
		
		JFrame frameListarFuncionario = new JFrame();
		frameListarFuncionario.setSize(100,100);
		
		JTable tabelaFuncionario = new JTable(tabelaString, colunasTitulos);
		tabelaFuncionario.setBounds(30,40,200,300);
		
		JScrollPane scrollPaneTabela = new JScrollPane(tabelaFuncionario);
		JPanel panelListarFuncionario = new JPanel();
		
		panelListarFuncionario.add(scrollPaneTabela);
		
		frameListarFuncionario.add(panelListarFuncionario);
		frameListarFuncionario.setVisible(true);
		
	}

}
