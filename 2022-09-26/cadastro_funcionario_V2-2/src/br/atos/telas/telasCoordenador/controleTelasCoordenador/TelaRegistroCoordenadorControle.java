package br.atos.telas.telasCoordenador.controleTelasCoordenador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.atos.model.Coordenador;
import br.atos.repositorio.RepositorioCoordenador;

public class TelaRegistroCoordenadorControle implements ActionListener{
	
	JFrame frameTelaRegistro;
	JFrame frameMenuInicial;
	
	JTextField nomeTextField;
	JTextField cpfTextField;
	JTextField salarioLiquidoTextField;
	JTextField lojaTextField;
	JTextField metaDaLojaTextField;
	
	//Iniciar o repositorio geral da aplicação. 
	RepositorioCoordenador repositorioCoordenador;
	
	boolean validarSalvar = false;

	//Contrutor recebendo os parametros(sobrecarga)
	public TelaRegistroCoordenadorControle(JFrame frameTelaRegistro, JFrame frameMenuInicial,
			JTextField nomeTextField, JTextField cpfTextField, JTextField salarioLiquidoTextField,
			JTextField lojaTextField, JTextField metaDaLojaTextField, RepositorioCoordenador repositorioCoordenador) {
		super();
		this.frameTelaRegistro = frameTelaRegistro;
		this.frameMenuInicial = frameMenuInicial;
		this.nomeTextField = nomeTextField;
		this.cpfTextField = cpfTextField;
		this.salarioLiquidoTextField = salarioLiquidoTextField;
		this.lojaTextField = lojaTextField;
		this.metaDaLojaTextField = metaDaLojaTextField;
		this.repositorioCoordenador = repositorioCoordenador;
	}
	
	public TelaRegistroCoordenadorControle() {
		
	}

	public void actionPerformed(ActionEvent e) {
		acionarSalvar();
		frameMenuInicial.setVisible(true);
		frameTelaRegistro.setVisible(false);
		
	}

	
	//Inseri o evento da lista do repositorio.
	private void acionarSalvar() {
		
		Coordenador coordenador = new Coordenador();
		coordenador.setNome(nomeTextField.getText());
		coordenador.setCpf(cpfTextField.getText());
		coordenador.setSalarioLiquido(Double.parseDouble(salarioLiquidoTextField.getText()));
		coordenador.setLoja(lojaTextField.getText());
		coordenador.setMetaDaLoja(Double.parseDouble(metaDaLojaTextField.getText()));
		
		validarSalvar = repositorioCoordenador.salvarCoordenador(coordenador);
		
		if(validarSalvar) {
			
			JOptionPane.showMessageDialog(null, coordenador.getNome() + " Foi Registrado com sucesso!");
			//System.out.println(coordenador.getNome() + " Foi Registrado com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
			System.out.println("Erro durante o cadastro");
		}
		
	}

}
