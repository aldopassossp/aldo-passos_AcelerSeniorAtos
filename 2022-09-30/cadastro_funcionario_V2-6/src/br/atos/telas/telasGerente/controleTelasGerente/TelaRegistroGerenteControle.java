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

public class TelaRegistroGerenteControle implements ActionListener{

	JFrame frameTelaRegistro;
	JFrame frameMenuInicialGerente;
	
	JTextField nomeTextField;
	JTextField cpfTextField;
	JTextField salarioLiquidoTextField;
	JTextField regionalTextField;
	JTextField metaDaRegionalTextField;
	JTextField estadoTextField;
	JTextField cidadeTextField;
	JTextField ruaTextField;
	
	//Iniciar o repositorio geral da aplicação. 
	RepositorioGerente repositorioGerente;
	
	ValidaGerente validaGerente = new ValidaGerente();
	String mensagemErro = null;
	
	boolean validarSalvar = false;

	//Contrutor recebendo os parametros(sobrecarga)
	public TelaRegistroGerenteControle(JFrame frameTelaRegistro, JFrame frameMenuInicialGerente, 
			JTextField nomeTextField, JTextField cpfTextField, JTextField salarioLiquidoTextField, 
			JTextField regionalTextField, JTextField metaDaRegionalTextField, RepositorioGerente repositorioGerente,
			JTextField estadoTextField, JTextField cidadeTextField, JTextField ruaTextField) {
		super();
		this.frameTelaRegistro = frameTelaRegistro;
		this.frameMenuInicialGerente = frameMenuInicialGerente;
		this.nomeTextField = nomeTextField;
		this.cpfTextField = cpfTextField;
		this.salarioLiquidoTextField = salarioLiquidoTextField;
		this.regionalTextField = regionalTextField;
		this.metaDaRegionalTextField = metaDaRegionalTextField;
		this.repositorioGerente = repositorioGerente;
		this.estadoTextField = estadoTextField;
		this.cidadeTextField = cidadeTextField;
		this.ruaTextField = ruaTextField;
	}
	
	public TelaRegistroGerenteControle() {
		
	}

	public void actionPerformed(ActionEvent e) {
		acionarSalvar();
		frameMenuInicialGerente.setVisible(true);
		frameTelaRegistro.setVisible(false);
		
	}

	
	//Inseri o evento da lista do repositorio.
	private void acionarSalvar() {
		
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
			
			mensagemErro = validaGerente.validarGerente(gerente, repositorioGerente, "Cadastrar");
			
			if(mensagemErro == null) {
				validarSalvar = repositorioGerente.salvarGerente(gerente);
				
				if(validarSalvar) {
					
					JOptionPane.showMessageDialog(null, gerente.getNome() + " Foi Registrado com sucesso!");
					//System.out.println(gerente.getNome() + " Foi Registrado com sucesso!");
				}else {
					JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
					System.out.println("Erro durante o cadastro");
				}
			}else {
				JOptionPane.showMessageDialog(null, mensagemErro);
			}
		}
	
	}
	
}
