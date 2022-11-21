package br.atos.telas;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.atos.repositorio.RepositorioFuncionario;
import br.atos.telas.controleTelas.TelaRegistroControle;

public class TelaRegistro {
	
	public void registrarFuncionario(JTextField opcaoMenuJText, 
				JFrame frameMenuInicial, RepositorioFuncionario repositorioFuncionario) {
		
		String nomeTexto = "Digite o nome do Funcionario:";
		String cpfTexto = "Digite o CPF:";
		String salarioTexto = "Digite o salario do funcionário:";
		
		JFrame frameTelaRegistro = new JFrame();
		frameTelaRegistro.setSize(500,180);
		frameTelaRegistro.setTitle("Cadastrar Funcionario");
		frameTelaRegistro.setLocation(100,100);
		
		JPanel painelTelaRegistro = new JPanel();
		
		Box box = Box.createVerticalBox();
		
		JLabel nomeTextLabel = new JLabel(nomeTexto);
		nomeTextLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(nomeTextLabel);
		
		JTextField nomeTextField = new JTextField(10);
		nomeTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(nomeTextField);

		JLabel cpfTextLabel = new JLabel(cpfTexto);
		cpfTextLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(cpfTextLabel);
		
		JTextField cpfTextField = new JTextField(10);
		//cpfTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(cpfTextField);
		
		JLabel salarioInicialTextLabel = new JLabel(salarioTexto);
		salarioInicialTextLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(salarioInicialTextLabel);
		
		JTextField salarioInicialTextField = new JTextField(10);
		//salarioInicialTextField.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(salarioInicialTextField);
		
		JButton botaoCadastrar = new JButton("Salvar");
		box.add(botaoCadastrar);
		
		frameTelaRegistro.add(box);
		
		frameTelaRegistro.setVisible(true);
		
		TelaRegistroControle telaRegistroControle = new TelaRegistroControle(frameTelaRegistro, 
				frameMenuInicial, nomeTextField, cpfTextField, salarioInicialTextField, repositorioFuncionario);
		
		botaoCadastrar.addActionListener(telaRegistroControle);
	}
	

}
