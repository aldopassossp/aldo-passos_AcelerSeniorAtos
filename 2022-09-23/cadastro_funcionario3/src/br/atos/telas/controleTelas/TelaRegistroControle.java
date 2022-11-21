package br.atos.telas.controleTelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.atos.model.Funcionario;
import br.atos.repositorio.RepositorioFuncionario;

public class TelaRegistroControle implements ActionListener{
	
	JFrame frameTelaRegistro;
	JFrame frameMenuInicial;
	
	JTextField nomeTextField;
	JTextField cpfTextField;
	JTextField salarioInicialTextField;
	
	RepositorioFuncionario repositorioFuncionario;
	
	boolean validarSalvar = false;
	
	public TelaRegistroControle(JFrame frameTelaRegistro, JFrame frameMenuInicial, JTextField nomeTextField,
									JTextField cpfTextField, JTextField salarioInicialTextField, RepositorioFuncionario repositorioFuncionario) {
		super();
		this.frameTelaRegistro = frameTelaRegistro;
		this.frameMenuInicial = frameMenuInicial;
		this.nomeTextField = nomeTextField;
		this.cpfTextField = cpfTextField;
		this.salarioInicialTextField = salarioInicialTextField;
		this.repositorioFuncionario = repositorioFuncionario;
		
	}
	
	public TelaRegistroControle() {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		acionarSalvar();
		frameMenuInicial.setVisible(true);
		frameTelaRegistro.setVisible(false);
		
	}
	
	private void acionarSalvar() {
		Funcionario funcionario = new Funcionario();
		funcionario.setNome(nomeTextField.getText());
		funcionario.setCpf(cpfTextField.getText());
		funcionario.setSalarioLiquido(Double.parseDouble(salarioInicialTextField.getText()));
		
		validarSalvar = repositorioFuncionario.salvarFuncionario(funcionario);
		
		if(validarSalvar) {
			System.out.println(funcionario.getNome() + " Foi registrado com Sucesso!");
		}else {
			System.out.println("Erro ao efetuar o cadastro");
		}
	}
	
}
