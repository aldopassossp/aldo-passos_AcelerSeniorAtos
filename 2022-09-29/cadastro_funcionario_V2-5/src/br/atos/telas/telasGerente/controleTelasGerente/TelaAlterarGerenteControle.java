package br.atos.telas.telasGerente.controleTelasGerente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.atos.model.Endereco;
import br.atos.model.Gerente;
import br.atos.repositorio.RepositorioGerente;
import br.atos.telas.telasGerente.validaGerente.ValidaGerente;

public class TelaAlterarGerenteControle implements ActionListener {
	
	JFrame frameTelaAlterar;
	JFrame frameMenuInicial;
	
	JTextField nomeTextField;
	JTextField cpfTextField;
	JTextField salarioLiquidoTextField;
	JTextField regionalTextField;
	JTextField metaDaRegionalTextField;
	JTextField estadoTextField;
	JTextField cidadeTextField;
	JTextField ruaTextField;
	
	RepositorioGerente repositorioGerente;
	Gerente gerenteAtual;
	
	ValidaGerente validaGerente = new ValidaGerente();
	String mensagemErro = null;
	
	boolean validarSalvar;
	
	public TelaAlterarGerenteControle(JFrame frameTelaAlterar, JFrame frameMenuInicial, 
			JTextField nomeTextField, JTextField cpfTextField, JTextField salarioLiquidoTextField,
			JTextField regionalTextField, JTextField metaDaRegionalTextField, RepositorioGerente repositorioGerente,
			Gerente gerenteAtual, JTextField estadoTextField, JTextField cidadeTextField, JTextField ruaTextField) {
		super();
		this.frameTelaAlterar = frameTelaAlterar;
		this.frameMenuInicial = frameMenuInicial;
		this.nomeTextField = nomeTextField;
		this.cpfTextField = cpfTextField;
		this.salarioLiquidoTextField = salarioLiquidoTextField;
		this.regionalTextField = regionalTextField;
		this.metaDaRegionalTextField = metaDaRegionalTextField;
		this.repositorioGerente = repositorioGerente;
		this.gerenteAtual = gerenteAtual;
		this.estadoTextField = estadoTextField;
		this.cidadeTextField = cidadeTextField;
		this.ruaTextField = ruaTextField;
	}

	public void actionPerformed(ActionEvent e) {
		acionarAlterar();
		frameMenuInicial.setVisible(true);
		frameTelaAlterar.setVisible(false);
		
		
	}

	private void acionarAlterar() {
		
		if(salarioLiquidoTextField.getText().trim().isEmpty() || metaDaRegionalTextField.getText().trim().isEmpty() ) {
			JOptionPane.showMessageDialog(null, "Horas trabalhadas e meta regional não pode estar em beranco!");
		}else {
			Gerente gerente = new Gerente();
			Endereco endereco = new Endereco();
			
			gerente.setNome(nomeTextField.getText());
			gerente.setCpf(cpfTextField.getText());
			gerente.setSalarioLiquido(gerente.calcularSalario(Double.parseDouble(salarioLiquidoTextField.getText()),1));
			gerente.setRegional(regionalTextField.getText());
			gerente.setMetaRegional(Double.parseDouble(metaDaRegionalTextField.getText()));
			
			endereco.setEstado(estadoTextField.getText());
			endereco.setCidade(estadoTextField.getText());
			endereco.setRua(ruaTextField.getText());
			
			gerente.setEndereco(endereco);
			
			mensagemErro = validaGerente.validarGerente(gerente, repositorioGerente);
			
			if(mensagemErro == null) {
				validarSalvar = repositorioGerente.salvarGerente(gerente);
				
				if(validarSalvar) {
					
					JOptionPane.showMessageDialog(null, gerente.getNome() + " Foi alterado com sucesso!");
					//System.out.println(gerente.getNome() + " Foi Registrado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(null, "Erro ao alterar");
					System.out.println("Erro durante a alteração");
				}
			}else {
				JOptionPane.showMessageDialog(null, mensagemErro);
			}
		}
	
	}
}
