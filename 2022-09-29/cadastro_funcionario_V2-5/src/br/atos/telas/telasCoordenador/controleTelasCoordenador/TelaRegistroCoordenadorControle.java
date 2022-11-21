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

public class TelaRegistroCoordenadorControle implements ActionListener{
	
	JFrame frameTelaRegistro;
	JFrame frameMenuInicial;
	
	JTextField nomeTextField;
	JTextField cpfTextField;
	JTextField salarioLiquidoTextField;
	JTextField lojaTextField;
	JTextField metaDaLojaTextField;
	JTextField estadoTextField;
	JTextField cidadeTextField;
	JTextField ruaTextField;
	
	//Iniciar o repositorio geral da aplicação. 
	RepositorioCoordenador repositorioCoordenador;
	
	ValidaCoordenador validaCoordenador = new ValidaCoordenador();
	String mensagemErro = null;
	
	boolean validarSalvar = false;

	//Contrutor recebendo os parametros(sobrecarga)
	public TelaRegistroCoordenadorControle(JFrame frameTelaRegistro, JFrame frameMenuInicial,
			JTextField nomeTextField, JTextField cpfTextField, JTextField salarioLiquidoTextField,
			JTextField lojaTextField, JTextField metaDaLojaTextField, RepositorioCoordenador repositorioCoordenador,
			JTextField estadoTextField, JTextField cidadeTextField, JTextField ruaTextField) {
		super();
		this.frameTelaRegistro = frameTelaRegistro;
		this.frameMenuInicial = frameMenuInicial;
		this.nomeTextField = nomeTextField;
		this.cpfTextField = cpfTextField;
		this.salarioLiquidoTextField = salarioLiquidoTextField;
		this.lojaTextField = lojaTextField;
		this.metaDaLojaTextField = metaDaLojaTextField;
		this.repositorioCoordenador = repositorioCoordenador;
		this.estadoTextField = estadoTextField;
		this.cidadeTextField = cidadeTextField;
		this.ruaTextField = ruaTextField;
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

}
