package br.atos.telas.telasGerente;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.atos.repositorio.RepositorioGerente;
import br.atos.telas.telasGerente.controleTelasGerente.TelaRegistroGerenteControle;

public class TelaRegistroGerente {
	
	public void  registrarGerente(JTextField opcaoMenuJText, JFrame frameMenuInicialGerente, RepositorioGerente repositorioGerente) {
		
		// Strings que serão usadas na Label
		String nomeTexto = "Digite o nome do gerente:";
		String cpfTexto = "Digite o CPF:";
		String salarioLiquidoTexto = "Digite o Salario do gerente:";
		String regionalTexto = "Digite a regional do Gerente:";
		String metaDaRegionalTexto = "Digite a meta da regional:";
		
		// Criação do Frame (Janela)
		JFrame frameTelaRegistroGerente = new JFrame();
		frameTelaRegistroGerente.setSize(200, 300);
		frameTelaRegistroGerente.setTitle("Inserir Gerente");
		frameTelaRegistroGerente.setLocation(300,300);
		
		//Criação do painel
		JPanel painelTelaRegistro = new JPanel();
		
		//Criação da Labels
		JLabel nomeTextoLabel = new JLabel(nomeTexto );
		painelTelaRegistro.add(nomeTextoLabel);
		
		//Criação da Caixa de texto
		JTextField nomeTextField = new JTextField(10);
		painelTelaRegistro.add(nomeTextField);
		
		
		JLabel cpfTextoLabel = new JLabel(cpfTexto);
		painelTelaRegistro.add(cpfTextoLabel);
		
		JTextField cpfTextField = new JTextField(10);
		painelTelaRegistro.add(cpfTextField);
		
		JLabel salarioLiquidoTextoLabel = new JLabel(salarioLiquidoTexto);
		painelTelaRegistro.add(salarioLiquidoTextoLabel);
		
		JTextField salarioLiquidoTextField = new JTextField(10);
		painelTelaRegistro.add(salarioLiquidoTextField);
		
		JLabel regionalTextoLabel = new JLabel(regionalTexto);
		painelTelaRegistro.add(regionalTextoLabel);
		
		JTextField regionalTextField = new JTextField(10);
		painelTelaRegistro.add(regionalTextField);
		
		JLabel metaDaRegionalTextoLabel = new JLabel(metaDaRegionalTexto);
		painelTelaRegistro.add(metaDaRegionalTextoLabel);
		
		JTextField metaDaRegionalTextField = new JTextField(10);
		painelTelaRegistro.add(metaDaRegionalTextField);
		
		//Criação do botão
		JButton botaoCadastrar = new JButton("Registrar");
		painelTelaRegistro.add(botaoCadastrar);
		
		// Adiciona o painel "dentro" do frame(janela)
		frameTelaRegistroGerente.add(painelTelaRegistro);
		
		//Habilitar visibilidade do frame(janela)
		frameTelaRegistroGerente.setVisible(true);
		
		//Realiaza chamada do controlador enviado os parametros do objeto "programador" através do construtor.
		TelaRegistroGerenteControle telaRegistroGerenteControle = new TelaRegistroGerenteControle
				(frameTelaRegistroGerente, frameMenuInicialGerente, nomeTextField, cpfTextField, 
						salarioLiquidoTextField, regionalTextField, metaDaRegionalTextField, repositorioGerente);
		
		//Adicionar(relacionar) o botão da tela com o metodo de ação(actionPerformed)
		botaoCadastrar.addActionListener(telaRegistroGerenteControle);
	}

}
