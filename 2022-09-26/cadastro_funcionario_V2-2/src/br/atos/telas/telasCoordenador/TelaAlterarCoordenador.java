package br.atos.telas.telasCoordenador;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.atos.model.Coordenador;
import br.atos.repositorio.RepositorioCoordenador;
import br.atos.telas.telasCoordenador.controleTelasCoordenador.TelaAlterarCoordenadorControle;

public class TelaAlterarCoordenador {
	
	public void alterarCoordenador(JFrame frameMenuInicial, RepositorioCoordenador repositorioCoordenador, Coordenador coordenadorAtual) {
		
		
	// Strings que serão usadas na Label
			String nomeTexto = "Digite o nome do coordenador:";
			String cpfTexto = "Digite o CPF:";
			String salarioLiquidoTexto = "Digite o salario:";
			String loja = "Digite a loja do COordenador:";
			String metaDaLoja = "Digite a meta da loja";
			
			// Criação do Frame (Janela)
			JFrame frameTelaAlterar = new JFrame();
			frameTelaAlterar.setSize(200, 300);
			frameTelaAlterar.setTitle("Inserir Coordenador");
			frameTelaAlterar.setLocation(300,300);
			
			//Criação do painel
			JPanel painelTelaAlterar = new JPanel();
			
			//Criação da Labels
			JLabel nomeTextoLabel = new JLabel(nomeTexto );
			painelTelaAlterar.add(nomeTextoLabel);
			
			//Criação da Caixa de texto
			JTextField nomeTextField = new JTextField(10);
			nomeTextField.setText(coordenadorAtual.getNome()); // Adiciona na caixa de texto os valores do coordenador que será alterado
			painelTelaAlterar.add(nomeTextField);
			
			
			JLabel cpfTextoLabel = new JLabel(cpfTexto);
			painelTelaAlterar.add(cpfTextoLabel);
			
			JTextField cpfTextField = new JTextField(10);
			cpfTextField.setText(coordenadorAtual.getCpf());
			painelTelaAlterar.add(cpfTextField);
			
			JLabel salarioLiquidoTextoLabel = new JLabel(salarioLiquidoTexto);
			painelTelaAlterar.add(salarioLiquidoTextoLabel);
			
			JTextField salarioLiquidoTextField = new JTextField(10);
			salarioLiquidoTextField.setText(coordenadorAtual.getSalarioLiquido().toString());
			painelTelaAlterar.add(salarioLiquidoTextField);
			
			JLabel lojaTextoLabel = new JLabel(loja);
			painelTelaAlterar.add(lojaTextoLabel);
			
			JTextField lojaTextField = new JTextField(10);
			painelTelaAlterar.add(lojaTextField);
			
			JLabel metaDaLojaTextoLabel = new JLabel(metaDaLoja);
			painelTelaAlterar.add(metaDaLojaTextoLabel);
			
			JTextField metaDaLojaTextField = new JTextField(10);
			painelTelaAlterar.add(metaDaLojaTextField);
			
			//Criação do botão
			JButton botaoAlterar = new JButton("Alterar");
			painelTelaAlterar.add(botaoAlterar);
			
			// Adiciona o painel "dentro" do frame(janela)
			frameTelaAlterar.add(painelTelaAlterar);
			
			//Habilitar visibilidade do frame(janela)
			frameTelaAlterar.setVisible(true);
			
			TelaAlterarCoordenadorControle alterarCoordenadorControle = new TelaAlterarCoordenadorControle
					(frameTelaAlterar, frameMenuInicial, nomeTextField, cpfTextField, 
							salarioLiquidoTextField, lojaTextField, metaDaLojaTextField, repositorioCoordenador, coordenadorAtual);
			botaoAlterar.addActionListener(alterarCoordenadorControle);
	}

}
