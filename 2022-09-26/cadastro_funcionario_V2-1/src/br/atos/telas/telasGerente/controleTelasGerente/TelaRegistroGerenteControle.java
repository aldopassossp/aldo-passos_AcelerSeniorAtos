package br.atos.telas.telasGerente.controleTelasGerente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.atos.model.Gerente;
import br.atos.repositorio.RepositorioGerente;

public class TelaRegistroGerenteControle implements ActionListener{

	JFrame frameTelaRegistro;
	JFrame frameMenuInicial;
	
	JTextField nomeTextField;
	JTextField cpfTextField;
	JTextField salarioLiquidoTextField;
	
	//Iniciar o repositorio geral da aplicação. 
	RepositorioGerente repositorioGerente;
	
	boolean validarSalvar = false;

	//Contrutor recebendo os parametros(sobrecarga)
	public TelaRegistroGerenteControle(JFrame frameTelaRegistro, JFrame frameMenuInicial, JTextField nomeTextField,
			JTextField cpfTextField, JTextField salarioLiquidoTextField, RepositorioGerente repositorioGerente) {
		super();
		this.frameTelaRegistro = frameTelaRegistro;
		this.frameMenuInicial = frameMenuInicial;
		this.nomeTextField = nomeTextField;
		this.cpfTextField = cpfTextField;
		this.salarioLiquidoTextField = salarioLiquidoTextField;
		this.repositorioGerente = repositorioGerente;
	}
	
	public TelaRegistroGerenteControle() {
		
	}

	public void actionPerformed(ActionEvent e) {
		acionarSalvar();
		frameMenuInicial.setVisible(true);
		frameTelaRegistro.setVisible(false);
		
	}

	
	//Inseri o evento da lista do repositorio.
	private void acionarSalvar() {
		
		Gerente programador = new Gerente();
		programador.setNome(nomeTextField.getText());
		programador.setCpf(cpfTextField.getText());
		programador.setSalarioLiquido(Double.parseDouble(salarioLiquidoTextField.getText()));
		
		validarSalvar = repositorioGerente.salvarGerente(programador);
		
		if(validarSalvar) {
			
			JOptionPane.showMessageDialog(null, programador.getNome() + " Foi Registrado com sucesso!");
			//System.out.println(programador.getNome() + " Foi Registrado com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
			System.out.println("Erro durante o cadastro");
		}
		
	}
	
}
