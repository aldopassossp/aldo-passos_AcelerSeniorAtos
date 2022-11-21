package br.atos.telas.telasCoordenador.controleTelasCoordenador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.atos.model.Coordenador;
import br.atos.model.Endereco;
import br.atos.repositorio.RepositorioCoordenador;
import br.atos.telas.telasCoordenador.validaCoordenador.ValidaCoordenador;
import br.atos.telas.telasGerente.validaGerente.ValidaGerente;

public class TelaAlterarCoordenadorControle implements ActionListener {
	
	JFrame frameTelaAlterar;
	JFrame frameMenuInicial;
	JTextField nomeTextField;
	JTextField cpfTextField;
	JTextField salarioLiquidoTextField;
	JTextField lojaTextField;
	JTextField metaDaLojaTextField;
	JTextField estadoTextField;
	JTextField cidadeTextField;
	JTextField ruaTextField;
	
	RepositorioCoordenador repositorioCoordenador;
	Coordenador coordenadorAtual;

	ValidaCoordenador validaCoordenador = new ValidaCoordenador();
	String mensagemErro = null;
	
	boolean validarAlterar;
	
	public TelaAlterarCoordenadorControle(JFrame frameTelaAlterar, JFrame frameMenuInicial, 
			JTextField nomeTextField, JTextField cpfTextField, JTextField salarioLiquidoTextField, 
			JTextField lojaTextField, JTextField metaDaLojaTextField, RepositorioCoordenador repositorioCoordenador,
			Coordenador coordenadorAtual, JTextField estadoTextField, JTextField cidadeTextField, JTextField ruaTextField) {
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
		
		if(salarioLiquidoTextField.getText().trim().isEmpty() || metaDaLojaTextField.getText().trim().isEmpty() ) {
			JOptionPane.showMessageDialog(null, "Horas trabalhadas e meta regional não pode estar em beranco!");
		}else {
			
			Coordenador coordenador = new Coordenador();
			Endereco endereco = new Endereco();
			
			coordenador.setNome(nomeTextField.getText());
			coordenador.setCpf(cpfTextField.getText());
			coordenador.setSalarioLiquido(coordenador.calcularSalario(Double.parseDouble(salarioLiquidoTextField.getText()),2));
			coordenador.setLoja(lojaTextField.getText());
			coordenador.setMetaDaLoja(Double.parseDouble(metaDaLojaTextField.getText()));
			
			endereco.setEstado(estadoTextField.getText());
			endereco.setCidade(estadoTextField.getText());
			endereco.setRua(ruaTextField.getText());
			
			coordenador.setEndereco(endereco);
			
			validarAlterar = repositorioCoordenador.salvarCoordenador(coordenador);
			
			if(validarAlterar) {
				
				JOptionPane.showMessageDialog(null, coordenador.getNome() + " Foi alterado com sucesso!");
				//System.out.println(coordenador.getNome() + " Foi Registrado com sucesso!");
			}else {
				JOptionPane.showMessageDialog(null, "Erro ao Cadastrar");
				System.out.println("Erro durante o cadastro");
			}
		}	
	}

}
