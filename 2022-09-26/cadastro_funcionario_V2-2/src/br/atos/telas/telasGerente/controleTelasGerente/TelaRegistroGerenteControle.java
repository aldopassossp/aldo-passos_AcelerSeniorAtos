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
	JTextField regionalTextField;
	JTextField metaDaRegionalTextField;
	
	//Iniciar o repositorio geral da aplicação. 
	RepositorioGerente repositorioGerente;
	
	boolean validarSalvar = false;

	//Contrutor recebendo os parametros(sobrecarga)
	public TelaRegistroGerenteControle(JFrame frameTelaRegistro, JFrame frameMenuInicial, 
			JTextField nomeTextField, JTextField cpfTextField, JTextField salarioLiquidoTextField, 
			JTextField regionalTextField, JTextField metaDaRegionalTextField, RepositorioGerente repositorioGerente) {
		super();
		this.frameTelaRegistro = frameTelaRegistro;
		this.frameMenuInicial = frameMenuInicial;
		this.nomeTextField = nomeTextField;
		this.cpfTextField = cpfTextField;
		this.salarioLiquidoTextField = salarioLiquidoTextField;
		this.regionalTextField = regionalTextField;
		this.metaDaRegionalTextField = metaDaRegionalTextField;
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
		
		Gerente gerente = new Gerente();
		gerente.setNome(nomeTextField.getText());
		gerente.setCpf(cpfTextField.getText());
		gerente.setSalarioLiquido(Double.parseDouble(salarioLiquidoTextField.getText()));
		gerente.setRegional(regionalTextField.getText());
		gerente.setMetaRegional(Double.parseDouble(metaDaRegionalTextField.getText()));
		
		validarSalvar = repositorioGerente.salvarGerente(gerente);
		
		if(validarSalvar) {
			
			JOptionPane.showMessageDialog(null, gerente.getNome() + " Foi Registrado com sucesso!");
			//System.out.println(gerente.getNome() + " Foi Registrado com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
			System.out.println("Erro durante o cadastro");
		}
		
	}
	
}
