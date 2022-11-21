package br.atos.telas.telasCoordenador;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import br.atos.model.Coordenador;
import br.atos.telas.telasCoordenador.controleTelasCoordenador.ListarCoordenadorControle;

public class ListarCoordenador {
	
	public void apresentarLista(List<Coordenador> listaDeCoordenadores, JFrame frameMenuInicial) {
		
		//Determina a quantidade de linhas da tabela
		int quantidadeDeLinhas = listaDeCoordenadores.size();
		// Determina a quantidade de colunas
		int quantidadeDeColunas = 8;
		
		
		// Determina a matrix os itens de linhas e colunas da tabela
		
		String [][] tabelaString = new String [quantidadeDeLinhas][quantidadeDeColunas];
		
		int posicaoLinha = 0; // Determina a posição da coluna
		int posicaoColuna = 0;// Determina a posição da linha
		
		// Percorrer todos os itens da lista 
		for(Coordenador coordenador: listaDeCoordenadores) {
			
			//Adiciona a String Nome na celula atual de acordo com o valor das variaveis 
			//posição linha e coluna
			tabelaString [posicaoLinha][posicaoColuna] = coordenador.getNome();
			posicaoColuna++; // Incrementa a variavel coluna
			
			tabelaString [posicaoLinha][posicaoColuna] = coordenador.getCpf();
			posicaoColuna++;// Incrementa a variavel coluna
			
			
			tabelaString [posicaoLinha][posicaoColuna] = coordenador.getSalarioLiquido().toString();
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = coordenador.getLoja();
			posicaoColuna++;// Incrementa a variavel coluna
			
			
			tabelaString [posicaoLinha][posicaoColuna] = coordenador.getMetaDaLoja().toString();
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = coordenador.getEndereco().getEstado();
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = coordenador.getEndereco().getCidade();
			posicaoColuna++;
			
			tabelaString [posicaoLinha][posicaoColuna] = coordenador.getEndereco().getRua();
			posicaoColuna = 0;
			posicaoLinha++; // Incrementa a Varivel linha
		
		}
		
		
		// Determina os titulos das coluna da lista
		String colunasTitulos[] = {"Nome", "Cpf", "Salário Liquido","Loja","Meta da Loja","Estado","Cidade","Rua"};
		
		//Cria o frame (janela)
		JFrame frameListarCoordenador = new JFrame();
		frameListarCoordenador.setLocation(150,150);
		frameListarCoordenador.setSize(500,600);
		
		//Cria o objeto do tipo tabela (interface grafica)
		JTable tabelaCoordenador = new JTable(tabelaString,colunasTitulos);
		tabelaCoordenador.setBounds(30,40,250,300);
		
		//Scroll
		JScrollPane scrollPaneTabela = new JScrollPane(tabelaCoordenador);
		JPanel panelListarCoordenador = new JPanel();
		
		// Adiciona o scroll pane no painel
		panelListarCoordenador.add(scrollPaneTabela);
		
		// Adiciona o painel no frame e habilita a visibilidade do frame
		frameListarCoordenador.add(panelListarCoordenador);
		frameListarCoordenador.setVisible(true);
		
		
		JButton botaoVoltar = new JButton("Menu");
		panelListarCoordenador.add(botaoVoltar);
		
		ListarCoordenadorControle listarCoordenadorControle = new ListarCoordenadorControle(frameMenuInicial, frameListarCoordenador);
		botaoVoltar.addActionListener(listarCoordenadorControle);
	
	}

}
