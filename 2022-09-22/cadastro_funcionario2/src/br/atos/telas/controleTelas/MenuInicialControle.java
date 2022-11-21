package br.atos.telas.controleTelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.atos.repositorio.RepositorioFuncionario;
import br.atos.telas.ListarFuncionario;
import br.atos.telas.TelaRegistro;

public class MenuInicialControle implements ActionListener{
	
	JTextField opcaoMenuJTextField;
	JFrame frameMenuInicial;
	
	ListarFuncionario listarFuncionario = new ListarFuncionario();
	
	TelaRegistro telaRegistro = new TelaRegistro();
	
	RepositorioFuncionario repositorioFuncionario = new RepositorioFuncionario();
	
	public MenuInicialControle() {
		
	}
	
	public MenuInicialControle(JTextField opcaoMenuJTextFieldCr, JFrame frameMenuInicialCr) {
		
		this.opcaoMenuJTextField = opcaoMenuJTextFieldCr;
		this.frameMenuInicial = frameMenuInicialCr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(opcaoMenuJTextField.getText().equals("1") || 
				opcaoMenuJTextField.getText().equals("2") || 
				opcaoMenuJTextField.getText().equals("3")) {
			
			frameMenuInicial.setVisible(false);
			
			switch(opcaoMenuJTextField.getText()) {
			case "1":
				telaRegistro.registrarFuncionario(opcaoMenuJTextField, frameMenuInicial, 
						repositorioFuncionario);
				
				System.out.println("Cadastre o funcionário");
				break;
				
			case "2":
				listarFuncionario.apresentarLista(repositorioFuncionario.listarFuncionario(), frameMenuInicial);
				
				System.out.println("Lista de funcionarios");
				break;
				
			case "3":
				System.out.println("Programa encerrado!");
				break;
			}
		}
		
	}
}
