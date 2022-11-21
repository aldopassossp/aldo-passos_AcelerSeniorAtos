package br.atos.telas;

import java.awt.Component;
import java.util.List;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.atos.model.Funcionario;
import br.atos.repositorio.RepositorioFuncionario;
import br.atos.telas.controleTelas.TelaDeletarControle;
import br.atos.telas.controleTelas.TelaRegistroControle;

public class TelaDeletar {

	public void deletarFuncionario(JFrame menuInicialFrame, RepositorioFuncionario repositorioFuncionario) {
		
				//Determina a quantidade de linhas da tabela
				int quantidadeDeLinhas = repositorioFuncionario.listarFuncionario().size();
				// Determina a quantidade de colunas
				int quantidadeDeColunas = 3;
				
				String stringTextoDeletar = "Digite o cpf que deseja deletar:";
				
				// Determina a matrix os itens de linhas e colunas da tabela
				
				String [][] tabelaString = new String [quantidadeDeLinhas][quantidadeDeColunas];
				
				int posicaoLinha = 0; // Determina a posição da coluna
				int posicaoColuna = 0;// Determina a posição da linha
				
				// Percorrer todos os itens da lista 
				for(Funcionario funcionario: repositorioFuncionario.listarFuncionario()) {
					
					//Adiciona a String Nome na celula atual de acordo com o valor das variaveis 
					//posição linha e coluna
					tabelaString [posicaoLinha][posicaoColuna] = funcionario.getNome();
					
					posicaoColuna++; // Incrementa a variavel coluna
					
					tabelaString [posicaoLinha][posicaoColuna] = funcionario.getCpf();
					posicaoColuna++;// Incrementa a variavel coluna
					
					
					tabelaString [posicaoLinha][posicaoColuna] = funcionario.getSalarioLiquido().toString();
					posicaoColuna = 0;
					posicaoLinha++; // Incrementa a Varivel linha
				
				}
				
				
				// Determina os titulos das coluna da lista
				String colunasTitulos[] = {"Nome", "Cpf", "Estado"};
				
				//Cria o frame (janela)
				JFrame framelistarFuncionario = new JFrame();
				framelistarFuncionario.setSize(500,600);
				
				//Cria o objeto do tipo tabela (interface grafica)
				JTable tabelaFuncionario = new JTable(tabelaString,colunasTitulos);
				tabelaFuncionario.setBounds(30,40,200,300);
				
				//Scroll
				JScrollPane scrollPaneTabela = new JScrollPane(tabelaFuncionario);
				JPanel panellistarFuncionario = new JPanel();
				
				JLabel stringTextoDeletarLabel = new JLabel(stringTextoDeletar);
				panellistarFuncionario.add(stringTextoDeletarLabel);
				
				JTextField cpfTextField = new JTextField(10);
				panellistarFuncionario.add(cpfTextField);
				
				JButton botaoDeletar = new JButton("Deletar");
				panellistarFuncionario.add(botaoDeletar);
				
				
				// Adiciona o scroll pane no painel
				panellistarFuncionario.add(scrollPaneTabela);
				
				// Adiciona o painel no frame e habilita a visibilidade do frame
				framelistarFuncionario.add(panellistarFuncionario);
				framelistarFuncionario.setVisible(true);
				
				TelaDeletarControle telaDeletarControle = new TelaDeletarControle(framelistarFuncionario, menuInicialFrame, cpfTextField, repositorioFuncionario);
				botaoDeletar.addActionListener(telaDeletarControle);
	}
}

