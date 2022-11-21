package br.atos.telas.telasGerente.controleTelasGerente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.atos.model.Gerente;
import br.atos.repositorio.RepositorioGerente;

public class TelaAlterarGerenteControle implements ActionListener {
	
	JFrame frameTelaAlterar;
	JFrame frameMenuInicial;
	JTextField nomeTextField;
	JTextField cpfTextField;
	JTextField salarioLiquidoTextField;
	
	RepositorioGerente repositorioGerente;
	Gerente gerenteAtual;
	
	boolean validaAlterar;
	
	public TelaAlterarGerenteControle(JFrame frameTelaAlterar, JFrame frameMenuInicial, JTextField nomeTextField,
			JTextField cpfTextField, JTextField salarioLiquidoTextField, RepositorioGerente repositorioGerente,
			Gerente gerenteAtual) {
		super();
		this.frameTelaAlterar = frameTelaAlterar;
		this.frameMenuInicial = frameMenuInicial;
		this.nomeTextField = nomeTextField;
		this.cpfTextField = cpfTextField;
		this.salarioLiquidoTextField = salarioLiquidoTextField;
		this.repositorioGerente = repositorioGerente;
		this.gerenteAtual = gerenteAtual;
	}

	public void actionPerformed(ActionEvent e) {
		acionarAlterar();
		frameMenuInicial.setVisible(true);
		frameTelaAlterar.setVisible(false);
		
		
	}

	private void acionarAlterar() {
	Gerente gerenteNovo = new Gerente();
	
	gerenteNovo.setNome(nomeTextField.getText());
	gerenteNovo.setCpf(cpfTextField.getText());
	gerenteNovo.setSalarioLiquido(Double.parseDouble(salarioLiquidoTextField.getText()));
	
	validaAlterar = repositorioGerente.alterarGerente(gerenteAtual, gerenteNovo);
	
	if(validaAlterar) {
		JOptionPane.showMessageDialog(null,gerenteNovo.getNome() + "Foi Alterado!!");
	}else {
		JOptionPane.showMessageDialog(null,"Erro na Alteração!!");
	}
	
	}

}
