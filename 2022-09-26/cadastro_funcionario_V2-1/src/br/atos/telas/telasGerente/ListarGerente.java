package br.atos.telas.telasGerente;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.atos.model.Gerente;
import br.atos.telas.telasGerente.controleTelasGerente.ListarGerenteControle;

public class ListarGerente {
	
	public void apresentarLista(List<Gerente> listaDeGerentees, JFrame frameMenuInicial) {
		
		//Determina a quantidade de linhas da tabela
		int quantidadeDeLinhas = listaDeGerentees.size();
		// Determina a quantidade de colunas
		int quantidadeDeColunas = 3;
		
		
		// Determina a matrix os itens de linhas e colunas da tabela
		
		String [][] tabelaString = new String [quantidadeDeLinhas][quantidadeDeColunas];
		
		int posicaoLinha = 0; // Determina a posição da coluna
		int posicaoColuna = 0;// Determina a posição da linha
		
		// Percorrer todos os itens da lista 
		for(Gerente programador: listaDeGerentees) {
			
			//Adiciona a String Nome na celula atual de acordo com o valor das variaveis 
			//posição linha e coluna
			tabelaString [posicaoLinha][posicaoColuna] = programador.getNome();
			
			posicaoColuna++; // Incrementa a variavel coluna
			
			tabelaString [posicaoLinha][posicaoColuna] = programador.getCpf();
			posicaoColuna++;// Incrementa a variavel coluna
			
			
			tabelaString [posicaoLinha][posicaoColuna] = programador.getSalarioLiquido().toString();
			posicaoColuna = 0;
			posicaoLinha++; // Incrementa a Varivel linha
		
		}
		
		
		// Determina os titulos das coluna da lista
		String colunasTitulos[] = {"Nome", "Cpf", "Salário Liquido"};
		
		//Cria o frame (janela)
		JFrame frameListarGerente = new JFrame();
		frameListarGerente.setSize(500,600);
		
		//Cria o objeto do tipo tabela (interface grafica)
		JTable tabelaGerente = new JTable(tabelaString,colunasTitulos);
		tabelaGerente.setBounds(30,40,200,300);
		
		//Scroll
		JScrollPane scrollPaneTabela = new JScrollPane(tabelaGerente);
		JPanel panelListarGerente = new JPanel();
		
		// Adiciona o scroll pane no painel
		panelListarGerente.add(scrollPaneTabela);
		
		// Adiciona o painel no frame e habilita a visibilidade do frame
		frameListarGerente.add(panelListarGerente);
		frameListarGerente.setVisible(true);
		
		
		JButton botaoVoltar = new JButton("Menu");
		panelListarGerente.add(botaoVoltar);
		
		ListarGerenteControle listarGerenteControle = new ListarGerenteControle(frameMenuInicial, frameListarGerente);
		botaoVoltar.addActionListener(listarGerenteControle);
	
	}

}
