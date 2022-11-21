package br.atos.telas.telasGerente.controleTelasGerente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.atos.repositorio.RepositorioGerente;
import br.atos.telas.MenuInicial;
import br.atos.telas.telasGerente.BuscarGerenteEditar;
import br.atos.telas.telasGerente.ListarGerente;
import br.atos.telas.telasGerente.TelaDeletarGerente;
import br.atos.telas.telasGerente.TelaRegistroGerente;

public class MenuInicialGerenteControle implements ActionListener {
	
	JTextField opcaoMenuJTextField;
	JFrame frameMenuInicialGerente;
	
	ListarGerente listarGerente = new ListarGerente();
	
	TelaDeletarGerente telaDeletar = new TelaDeletarGerente();
	
	TelaRegistroGerente telaRegistroGerente = new TelaRegistroGerente();
	
	RepositorioGerente repositorioGerente = new RepositorioGerente();
	
	BuscarGerenteEditar buscarGerenteEditar= new BuscarGerenteEditar();
	
	MenuInicial menuInicial = new MenuInicial(); 
	
	public MenuInicialGerenteControle() {
		
	}
	
	public MenuInicialGerenteControle(JTextField opcaoMenuJTextFieldCr,JFrame frameMenuInicialGerente) {
		this.opcaoMenuJTextField = opcaoMenuJTextFieldCr;
		this.frameMenuInicialGerente = frameMenuInicialGerente;
	}

	public void actionPerformed(ActionEvent e) {
		if(opcaoMenuJTextField.getText().equals("1") || opcaoMenuJTextField.getText().equals("2") || 
				opcaoMenuJTextField.getText().equals("3") || opcaoMenuJTextField.getText().equals("4") || 
				opcaoMenuJTextField.getText().equals("5") || opcaoMenuJTextField.getText().equals("6") ){
			
			frameMenuInicialGerente.setVisible(false);
			
			switch (opcaoMenuJTextField.getText()) {
			case "1":
				telaRegistroGerente.registrarGerente(opcaoMenuJTextField, frameMenuInicialGerente, repositorioGerente);
				
				System.out.println("Cadastre o gerente!");
				break;
			
			case "2":
				
				listarGerente.apresentarLista(repositorioGerente.listarGerente(), frameMenuInicialGerente);
				System.out.println("Lista programadores");				
				break;
			
			case "3":
				buscarGerenteEditar.buscarGerente(frameMenuInicialGerente, repositorioGerente);			
				break;
				
			case "4":
				telaDeletar.deletarGerente(frameMenuInicialGerente, repositorioGerente);
				break;
				
			case "5":
				menuInicial.apresentarMenuInicial();
				System.out.println("Voltar para o menu anterior");
				break;
			
			case "6":
				System.out.println("Você encerrou");
				break;
			
			
			}
			
			
		}else {
			
			System.out.println("Opção Invalida!!");
		}
			
		
	}

}
