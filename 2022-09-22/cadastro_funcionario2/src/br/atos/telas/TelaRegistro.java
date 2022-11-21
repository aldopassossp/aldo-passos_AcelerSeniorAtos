package br.atos.telas;

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
		frameTelaRegistro.setSize(500,500);
		frameTelaRegistro.setTitle("Cadastrar Funcionario");
		frameTelaRegistro.setLocation(150,150);
		
		JPanel painelTelaRegistro = new JPanel();
		
		JLabel nomeTextLabel = new JLabel(nomeTexto);
		painelTelaRegistro.add(nomeTextLabel);
		
		JTextField nomeTextField = new JTextField(10);
		painelTelaRegistro.add(nomeTextField);

		JLabel cpfTextLabel = new JLabel(cpfTexto);
		painelTelaRegistro.add(cpfTextLabel);
		
		JTextField cpfTextField = new JTextField(10);
		painelTelaRegistro.add(cpfTextField);
		
		JLabel salarioTextLabel = new JLabel(salarioTexto);
		painelTelaRegistro.add(salarioTextLabel);
		
		JTextField estadoTextField = new JTextField(10);
		painelTelaRegistro.add(estadoTextField);
		
		JButton botaoCadastrar = new JButton("Salvar");
		painelTelaRegistro.add(botaoCadastrar);
		
		frameTelaRegistro.add(painelTelaRegistro);
		
		frameTelaRegistro.setVisible(true);
		
		TelaRegistroControle telaRegistroControle = new TelaRegistroControle(frameTelaRegistro, 
				frameMenuInicial, nomeTextField, cpfTextField, estadoTextField, repositorioFuncionario);
		
		
	}
	

}
