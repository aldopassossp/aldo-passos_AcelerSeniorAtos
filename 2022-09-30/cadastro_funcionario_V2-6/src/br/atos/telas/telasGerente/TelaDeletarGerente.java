package br.atos.telas.telasGerente;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.atos.model.Gerente;
import br.atos.repositorio.RepositorioGerente;
import br.atos.telas.telasGerente.controleTelasGerente.TelaDeletarGerenteControle;

public class TelaDeletarGerente {
	
	public void deletarGerente(JFrame frameMenuInicialGerente, RepositorioGerente repositorioGerente) {
		
		//Determina a quantidade de linhas da tabela
				int quantidadeDeLinhas = repositorioGerente.listarGerente().size();
				// Determina a quantidade de colunas
				int quantidadeDeColunas = 3;
				
				String stringTextoDeletar = "Digite o cpf que deseja deletar:";
				
				// Determina a matrix os itens de linhas e colunas da tabela
				
				String [][] tabelaString = new String [quantidadeDeLinhas][quantidadeDeColunas];
				
				int posicaoLinha = 0; // Determina a posição da coluna
				int posicaoColuna = 0;// Determina a posição da linha
				
				// Percorrer todos os itens da lista 
				for(Gerente gerente: repositorioGerente.listarGerente()) {
					
					//Adiciona a String Nome na celula atual de acordo com o valor das variaveis 
					//posição linha e coluna
					tabelaString [posicaoLinha][posicaoColuna] = gerente.getNome();
					
					posicaoColuna++; // Incrementa a variavel coluna
					
					tabelaString [posicaoLinha][posicaoColuna] = gerente.getCpf();
					posicaoColuna++;// Incrementa a variavel coluna
					
					
					tabelaString [posicaoLinha][posicaoColuna] = gerente.getSalarioLiquido().toString();
					posicaoColuna = 0;
					posicaoLinha++; // Incrementa a Varivel linha
				
				}
				
				
				// Determina os titulos das coluna da lista
				String colunasTitulos[] = {"Nome", "Cpf", "Estado"};
				
				//Cria o frame (janela)
				JFrame frameDeletarGerente = new JFrame();
				frameDeletarGerente.setLocation(150,150);
				frameDeletarGerente.setSize(500,600);
				
				//Cria o objeto do tipo tabela (interface grafica)
				JTable tabelaGerente = new JTable(tabelaString,colunasTitulos);
				tabelaGerente.setBounds(30,40,200,300);
				
				//Scroll
				JScrollPane scrollPaneTabela = new JScrollPane(tabelaGerente);
				JPanel panelListarGerente = new JPanel();
				
				JLabel stringTextoDeletarLabel = new JLabel(stringTextoDeletar);
				panelListarGerente.add(stringTextoDeletarLabel);
				
				JTextField cpfTextField = new JTextField(10);
				panelListarGerente.add(cpfTextField);
				
				JButton botaoDeletar = new JButton("Deletar");
				panelListarGerente.add(botaoDeletar);
				
				
				// Adiciona o scroll pane no painel
				panelListarGerente.add(scrollPaneTabela);
				
				// Adiciona o painel no frame e habilita a visibilidade do frame
				frameDeletarGerente.add(panelListarGerente);
				frameDeletarGerente.setVisible(true);
				
				TelaDeletarGerenteControle telaDeletarGerenteControle = new TelaDeletarGerenteControle(frameDeletarGerente, frameMenuInicialGerente, cpfTextField, repositorioGerente);
				botaoDeletar.addActionListener(telaDeletarGerenteControle);
	}

}
