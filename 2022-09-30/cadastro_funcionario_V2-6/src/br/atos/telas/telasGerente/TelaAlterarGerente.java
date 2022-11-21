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
			String nomeTexto =           "Digite o nome do gerente:    ";
			String cpfTexto =            "Digite o CPF:                ";
			String salarioLiquidoTexto = "Digite o salario:            ";
			String regionalTexto =       "Digite a regional do Gerente:";
			String metaDaRegionalTexto = "Digite a meta da regional:   ";	
			String estadoTexto =         "Digite o estado:             ";
			String cidadeTexto =         "Digite a cidade:             ";
			String ruaTexto =            "Digite a rua:                ";
			
			// Criação do Frame (Janela)
			JFrame frameTelaAlterarGer = new JFrame();
			frameTelaAlterarGer.setSize(200, 500);
			frameTelaAlterarGer.setTitle("Inserir Gerente");
			frameTelaAlterarGer.setLocation(150,150);
			
			//Criação do painel
			JPanel painelTelaAlterar = new JPanel();	
			
			JLabel cpfTextoLabel = new JLabel(cpfTexto);
			painelTelaAlterar.add(cpfTextoLabel);
			
			JTextField cpfTextField = new JTextField(10);
			cpfTextField.setText(gerenteAtual.getCpf());
			cpfTextField.setEnabled(false);
			painelTelaAlterar.add(cpfTextField);
			
			//Criação da Labels
			JLabel nomeTextoLabel = new JLabel(nomeTexto );
			painelTelaAlterar.add(nomeTextoLabel);
			
			//Criação da Caixa de texto
			JTextField nomeTextField = new JTextField(10);
			nomeTextField.setText(gerenteAtual.getNome()); // Adiciona na caixa de texto os valores do gerente que será alterado
			painelTelaAlterar.add(nomeTextField);
						
			JLabel salarioLiquidoTextoLabel = new JLabel(salarioLiquidoTexto);
			painelTelaAlterar.add(salarioLiquidoTextoLabel);
			
			JTextField salarioLiquidoTextField = new JTextField(10);
			salarioLiquidoTextField.setText(gerenteAtual.getSalarioLiquido().toString());
			painelTelaAlterar.add(salarioLiquidoTextField);
			
			JLabel regionalTextoLabel = new JLabel(regionalTexto);
			painelTelaAlterar.add(regionalTextoLabel);
			
			JTextField regionalTextField = new JTextField(10);
			regionalTextField.setText(gerenteAtual.getRegional());
			painelTelaAlterar.add(regionalTextField);
			
			JLabel metaDaRegionalTextoLabel = new JLabel(metaDaRegionalTexto);
			painelTelaAlterar.add(metaDaRegionalTextoLabel);
			
			JTextField metaDaRegionalTextField = new JTextField(10);
			metaDaRegionalTextField.setText(gerenteAtual.getMetaRegional().toString());
			painelTelaAlterar.add(metaDaRegionalTextField);
					
			JLabel estadoTextoLabel = new JLabel(estadoTexto);
			painelTelaAlterar.add(estadoTextoLabel);
			
			JTextField estadoTextField = new JTextField(10);
			estadoTextField.setText(gerenteAtual.getEndereco().getEstado());
			painelTelaAlterar.add(estadoTextField);
			
			JLabel cidadeTextoLabel = new JLabel(cidadeTexto);
			painelTelaAlterar.add(cidadeTextoLabel);
			
			JTextField cidadeTextField = new JTextField(10);
			cidadeTextField.setText(gerenteAtual.getEndereco().getCidade());
			painelTelaAlterar.add(cidadeTextField);
			
			JLabel ruaTextoLabel = new JLabel(ruaTexto);
			painelTelaAlterar.add(ruaTextoLabel);
			
			JTextField ruaTextField = new JTextField(10);
			ruaTextField.setText(gerenteAtual.getEndereco().getRua());
			painelTelaAlterar.add(ruaTextField);
			
			//Criação do botão
			JButton botaoAlterar = new JButton("Alterar");
			painelTelaAlterar.add(botaoAlterar);
			
			// Adiciona o painel "dentro" do frame(janela)
			frameTelaAlterarGer.add(painelTelaAlterar);
			
			//Habilitar visibilidade do frame(janela)
			frameTelaAlterarGer.setVisible(true);
			
			TelaAlterarGerenteControle alterarGerenteControle = new TelaAlterarGerenteControle
					(frameTelaAlterarGer, frameMenuInicial, nomeTextField, cpfTextField, 
							salarioLiquidoTextField, regionalTextField, metaDaRegionalTextField,
							repositorioGerente, gerenteAtual, estadoTextField, cidadeTextField, ruaTextField);
			
			botaoAlterar.addActionListener(alterarGerenteControle);
	}

}
