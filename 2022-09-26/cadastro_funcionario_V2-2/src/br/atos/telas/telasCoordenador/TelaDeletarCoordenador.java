package br.atos.telas.telasCoordenador;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.atos.model.Coordenador;
import br.atos.repositorio.RepositorioCoordenador;
import br.atos.telas.telasCoordenador.controleTelasCoordenador.TelaDeletarCoordenadorControle;

public class TelaDeletarCoordenador {
	
	public void deletarCoordenador(JFrame menuInicialFrame, RepositorioCoordenador repositorioCoordenador) {
		
		//Determina a quantidade de linhas da tabela
				int quantidadeDeLinhas = repositorioCoordenador.listarCoordenador().size();
				// Determina a quantidade de colunas
				int quantidadeDeColunas = 3;
				
				String stringTextoDeletar = "Digite o cpf que deseja deletar:";
				
				// Determina a matrix os itens de linhas e colunas da tabela
				
				String [][] tabelaString = new String [quantidadeDeLinhas][quantidadeDeColunas];
				
				int posicaoLinha = 0; // Determina a posição da coluna
				int posicaoColuna = 0;// Determina a posição da linha
				
				// Percorrer todos os itens da lista 
				for(Coordenador coordenador: repositorioCoordenador.listarCoordenador()) {
					
					//Adiciona a String Nome na celula atual de acordo com o valor das variaveis 
					//posição linha e coluna
					tabelaString [posicaoLinha][posicaoColuna] = coordenador.getNome();
					
					posicaoColuna++; // Incrementa a variavel coluna
					
					tabelaString [posicaoLinha][posicaoColuna] = coordenador.getCpf();
					posicaoColuna++;// Incrementa a variavel coluna
					
					
					tabelaString [posicaoLinha][posicaoColuna] = coordenador.getSalarioLiquido().toString();
					posicaoColuna = 0;
					posicaoLinha++; // Incrementa a Varivel linha
				
				}
				
				
				// Determina os titulos das coluna da lista
				String colunasTitulos[] = {"Nome", "Cpf", "Estado"};
				
				//Cria o frame (janela)
				JFrame frameListarCoordenador = new JFrame();
				frameListarCoordenador.setSize(500,600);
				
				//Cria o objeto do tipo tabela (interface grafica)
				JTable tabelaCoordenador = new JTable(tabelaString,colunasTitulos);
				tabelaCoordenador.setBounds(30,40,200,300);
				
				//Scroll
				JScrollPane scrollPaneTabela = new JScrollPane(tabelaCoordenador);
				JPanel panelListarCoordenador = new JPanel();
				
				JLabel stringTextoDeletarLabel = new JLabel(stringTextoDeletar);
				panelListarCoordenador.add(stringTextoDeletarLabel);
				
				JTextField cpfTextField = new JTextField(10);
				panelListarCoordenador.add(cpfTextField);
				
				JButton botaoDeletar = new JButton("Deletar");
				panelListarCoordenador.add(botaoDeletar);
				
				
				// Adiciona o scroll pane no painel
				panelListarCoordenador.add(scrollPaneTabela);
				
				// Adiciona o painel no frame e habilita a visibilidade do frame
				frameListarCoordenador.add(panelListarCoordenador);
				frameListarCoordenador.setVisible(true);
				
				TelaDeletarCoordenadorControle telaDeletarCoordenadorControle = new TelaDeletarCoordenadorControle(frameListarCoordenador, menuInicialFrame, cpfTextField, repositorioCoordenador);
				botaoDeletar.addActionListener(telaDeletarCoordenadorControle);
	}

}
