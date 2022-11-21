package br.atos.telas.telasGerente;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.atos.model.Gerente;
import br.atos.repositorio.RepositorioGerente;
import br.atos.telas.telasGerente.controleTelasGerente.TelaAlterarGerenteControle;

public class TelaAlterarGerente {
	
	public void alterarGerente(JFrame frameMenuInicial, RepositorioGerente repositorioGerente, Gerente gerenteAtual) {
		
		
	// Strings que serão usadas na Label
			String nomeTexto = "Digite o nome do gerente:";
			String cpfTexto = "Digite o CPF:";
			String salarioLiquidoTexto = "Digite o salario:";
			String regionalTexto = "Digite a regional do Gerente:";
			String metaDaRegionalTexto = "Digite a meta da regional:";			
			
			// Criação do Frame (Janela)
			JFrame frameTelaAlterar = new JFrame();
			frameTelaAlterar.setSize(200, 300);
			frameTelaAlterar.setTitle("Inserir Gerente");
			frameTelaAlterar.setLocation(300,300);
			
			//Criação do painel
			JPanel painelTelaAlterar = new JPanel();
			
			//Criação da Labels
			JLabel nomeTextoLabel = new JLabel(nomeTexto );
			painelTelaAlterar.add(nomeTextoLabel);
			
			//Criação da Caixa de texto
			JTextField nomeTextField = new JTextField(10);
			nomeTextField.setText(gerenteAtual.getNome()); // Adiciona na caixa de texto os valores do gerente que será alterado
			painelTelaAlterar.add(nomeTextField);
			
			
			JLabel cpfTextoLabel = new JLabel(cpfTexto);
			painelTelaAlterar.add(cpfTextoLabel);
			
			JTextField cpfTextField = new JTextField(10);
			cpfTextField.setText(gerenteAtual.getCpf());
			painelTelaAlterar.add(cpfTextField);
			
			JLabel salarioLiquidoTextoLabel = new JLabel(salarioLiquidoTexto);
			painelTelaAlterar.add(salarioLiquidoTextoLabel);
			
			JTextField salarioLiquidoTextField = new JTextField(10);
			salarioLiquidoTextField.setText(gerenteAtual.getSalarioLiquido().toString());
			painelTelaAlterar.add(salarioLiquidoTextField);
			
			JLabel regionalTextoLabel = new JLabel(regionalTexto);
			painelTelaAlterar.add(regionalTextoLabel);
			
			JTextField regionalTextField = new JTextField(10);
			painelTelaAlterar.add(regionalTextField);
			
			JLabel metaDaRegionalTextoLabel = new JLabel(metaDaRegionalTexto);
			painelTelaAlterar.add(metaDaRegionalTextoLabel);
			
			JTextField metaDaRegionalTextField = new JTextField(10);
			painelTelaAlterar.add(metaDaRegionalTextField);
			
			//Criação do botão
			JButton botaoAlterar = new JButton("Alterar");
			painelTelaAlterar.add(botaoAlterar);
			
			// Adiciona o painel "dentro" do frame(janela)
			frameTelaAlterar.add(painelTelaAlterar);
			
			//Habilitar visibilidade do frame(janela)
			frameTelaAlterar.setVisible(true);
			
			TelaAlterarGerenteControle alterarGerenteControle = new TelaAlterarGerenteControle
					(frameTelaAlterar, frameMenuInicial, nomeTextField, cpfTextField, 
							salarioLiquidoTextField, regionalTextField, metaDaRegionalTextField, repositorioGerente, gerenteAtual);
			botaoAlterar.addActionListener(alterarGerenteControle);
	}

}
