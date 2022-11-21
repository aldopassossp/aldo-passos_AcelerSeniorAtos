package br.atos.telas.telasGerente.controleTelasGerente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.atos.repositorio.RepositorioGerente;
import br.atos.telas.telasGerente.BuscarGerenteEditar;
import br.atos.telas.telasGerente.ListarGerente;
import br.atos.telas.telasGerente.TelaDeletarGerente;
import br.atos.telas.telasGerente.TelaRegistroGerente;

public class MenuInicialGerenteControle implements ActionListener {
	
	JTextField opcaoMenuJTextField;
	JFrame frameMenuInicial;
	
	ListarGerente listarGerente = new ListarGerente();
	
	TelaDeletarGerente telaDeletar = new TelaDeletarGerente();
	
	TelaRegistroGerente telaRegistroGerente = new TelaRegistroGerente();
	
	RepositorioGerente repositorioGerente = new RepositorioGerente();
	
	BuscarGerenteEditar buscarGerenteEditar= new BuscarGerenteEditar();
	
	public MenuInicialGerenteControle() {
		
	}
	
	public MenuInicialGerenteControle(JTextField opcaoMenuJTextFieldCr,JFrame frameMenuInicialCr) {
		this.opcaoMenuJTextField = opcaoMenuJTextFieldCr;
		this.frameMenuInicial = frameMenuInicialCr;
	}

	public void actionPerformed(ActionEvent e) {
		if(opcaoMenuJTextField.getText().equals("1")|| opcaoMenuJTextField.getText().equals("2") || opcaoMenuJTextField.getText().equals("3")
				|| opcaoMenuJTextField.getText().equals("4") || opcaoMenuJTextField.getText().equals("5") ){
			
			frameMenuInicial.setVisible(false);
			
			switch (opcaoMenuJTextField.getText()) {
			case "1":
				telaRegistroGerente.registrarGerente(opcaoMenuJTextField, frameMenuInicial, repositorioGerente);
				
				System.out.println("Cadastre o gerente!");
				break;
			
			case "2":
				
				listarGerente.apresentarLista(repositorioGerente.listarGerente(), frameMenuInicial);
				System.out.println("Lista programadores");				
				break;
			
			case "3":
				buscarGerenteEditar.buscarGerente(frameMenuInicial, repositorioGerente);			
				break;
				
			case "4":
				telaDeletar.deletarGerente(frameMenuInicial, repositorioGerente);
				break;
				
			case "5":
				System.out.println("Você encerrou");
				break;
			
			
			}
			
			
		}else {
			
			System.out.println("Opção Invalida!!");
		}
			
		
	}

}
