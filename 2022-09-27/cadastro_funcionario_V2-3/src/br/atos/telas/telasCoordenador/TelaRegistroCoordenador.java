package br.atos.telas.telasCoordenador;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.atos.repositorio.RepositorioCoordenador;
import br.atos.telas.telasCoordenador.controleTelasCoordenador.TelaRegistroCoordenadorControle;

public class TelaRegistroCoordenador {
	
	public void  registrarCoordenador(JTextField opcaoMenuJText, JFrame frameMenuInicialCoordenador, RepositorioCoordenador repositorioCoordenador) {
		
		// Strings que serão usadas na Label
		String nomeTexto =      "Digite o nome do coordenador:";
		String cpfTexto =       "Digite o CPF:                ";
		String salarioLiquido = "Digite as horas trabalhadas: ";
		String loja =           "Digite a loja do COordenador:";
		String metaDaLoja =     "Digite a meta da loja        ";
		String estadoTexto =    "Digite o estado:             ";
		String cidadeTexto =    "Digite a cidade:             ";
		String ruaTexto =       "Digite a rua:                ";
		
		// Criação do Frame (Janela)
		JFrame frameTelaRegistroCoordenador = new JFrame();
		frameTelaRegistroCoordenador.setSize(200, 250);
		frameTelaRegistroCoordenador.setTitle("Inserir Coordenador");
		frameTelaRegistroCoordenador.setLocation(150,150);
		
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
		
		JLabel salarioLiquidoTextoLabel = new JLabel(salarioLiquido);
		painelTelaRegistro.add(salarioLiquidoTextoLabel);
		
		JTextField salarioLiquidoTextField = new JTextField(10);
		painelTelaRegistro.add(salarioLiquidoTextField);
		
		JLabel lojaTextoLabel = new JLabel(loja);
		painelTelaRegistro.add(lojaTextoLabel);
		
		JTextField lojaTextField = new JTextField(10);
		painelTelaRegistro.add(lojaTextField);
		
		JLabel metaDaLojaTextoLabel = new JLabel(metaDaLoja);
		painelTelaRegistro.add(metaDaLojaTextoLabel);
		
		JTextField metaDaLojaTextField = new JTextField(10);
		painelTelaRegistro.add(metaDaLojaTextField);
		
		JTextField estadoTextField = new JTextField(10);
		painelTelaRegistro.add(estadoTextField);
		
		JLabel cidadeTextoLabel = new JLabel(cidadeTexto);
		painelTelaRegistro.add(cidadeTextoLabel);
		
		JTextField cidadeTextField = new JTextField(10);
		painelTelaRegistro.add(cidadeTextField);
		
		JLabel ruaTextoLabel = new JLabel(ruaTexto);
		painelTelaRegistro.add(ruaTextoLabel);
		
		JTextField ruaTextField = new JTextField(10);
		painelTelaRegistro.add(ruaTextField);
		
		//Criação do botão
		JButton botaoCadastrar = new JButton("Registrar");
		painelTelaRegistro.add(botaoCadastrar);
		
		// Adiciona o painel "dentro" do frame(janela)
		frameTelaRegistroCoordenador.add(painelTelaRegistro);
		
		//Habilitar visibilidade do frame(janela)
		frameTelaRegistroCoordenador.setVisible(true);
		
		//Realiaza chamada do controlador enviado os parametros do objeto "coordenador" através do construtor.
		TelaRegistroCoordenadorControle telaRegistroCoordenadorControle = new TelaRegistroCoordenadorControle
				(frameTelaRegistroCoordenador, frameMenuInicialCoordenador, nomeTextField, 
						cpfTextField, salarioLiquidoTextField, lojaTextField, metaDaLojaTextField, 
						repositorioCoordenador, estadoTextField, cidadeTextField, ruaTextField);
		
		//Adicionar(relacionar) o botão da tela com o metodo de ação(actionPerformed)
		botaoCadastrar.addActionListener(telaRegistroCoordenadorControle);
	}

}
