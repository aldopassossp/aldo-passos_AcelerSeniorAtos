package br.atos.telas.telasCoordenador.controleTelasCoordenador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.atos.model.Coordenador;
import br.atos.repositorio.RepositorioCoordenador;

public class TelaAlterarCoordenadorControle implements ActionListener {
	
	JFrame frameTelaAlterar;
	JFrame frameMenuInicial;
	JTextField nomeTextField;
	JTextField cpfTextField;
	JTextField salarioLiquidoTextField;
	JTextField lojaTextField;
	JTextField metaDaLojaTextField;
	
	RepositorioCoordenador repositorioCoordenador;
	Coordenador coordenadorAtual;
	
	boolean validaAlterar;
	
	public TelaAlterarCoordenadorControle(JFrame frameTelaAlterar, JFrame frameMenuInicial, 
			JTextField nomeTextField, JTextField cpfTextField, JTextField salarioLiquidoTextField, 
			JTextField lojaTextField, JTextField metaDaLojaTextField, RepositorioCoordenador repositorioCoordenador,
			Coordenador coordenadorAtual) {
		super();
		this.frameTelaAlterar = frameTelaAlterar;
		this.frameMenuInicial = frameMenuInicial;
		this.nomeTextField = nomeTextField;
		this.cpfTextField = cpfTextField;
		this.salarioLiquidoTextField = salarioLiquidoTextField;
		this.lojaTextField = lojaTextField;
		this.metaDaLojaTextField = metaDaLojaTextField;
		this.repositorioCoordenador = repositorioCoordenador;
		this.coordenadorAtual = coordenadorAtual;
	}

	public void actionPerformed(ActionEvent e) {
		acionarAlterar();
		frameMenuInicial.setVisible(true);
		frameTelaAlterar.setVisible(false);
		
		
	}

	private void acionarAlterar() {
	Coordenador coordenadorNovo = new Coordenador();
	
	coordenadorNovo.setNome(nomeTextField.getText());
	coordenadorNovo.setCpf(cpfTextField.getText());
	coordenadorNovo.setSalarioLiquido(Double.parseDouble(salarioLiquidoTextField.getText()));
	coordenadorNovo.setLoja(lojaTextField.getText());
	coordenadorNovo.setMetaDaLoja(Double.parseDouble(metaDaLojaTextField.getText()));
	
	validaAlterar = repositorioCoordenador.alterarCoordenador(coordenadorAtual, coordenadorNovo);
	
	if(validaAlterar) {
		JOptionPane.showMessageDialog(null,coordenadorNovo.getNome() + "Foi Alterado!!");
	}else {
		JOptionPane.showMessageDialog(null,"Erro na Alteração!!");
	}
	
	}

}
