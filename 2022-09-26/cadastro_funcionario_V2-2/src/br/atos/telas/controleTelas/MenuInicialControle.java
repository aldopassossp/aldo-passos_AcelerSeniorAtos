package br.atos.telas.controleTelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.atos.telas.telasGerente.MenuInicialGerente;
import br.atos.telas.telasCoordenador.MenuInicialCoordenador;

public class MenuInicialControle implements ActionListener{

	JTextField opcaoMenuJTextField;
	JFrame frameMenuInicial;
	
	public MenuInicialControle() {
		
	}
	
	public MenuInicialControle(JTextField opcaoMenuJTextFieldCr,JFrame frameMenuInicialCr) {
		this.opcaoMenuJTextField = opcaoMenuJTextFieldCr;
		this.frameMenuInicial = frameMenuInicialCr;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(opcaoMenuJTextField.getText().equals("1")|| opcaoMenuJTextField.getText().equals("2")
				|| opcaoMenuJTextField.getText().equals("3")){
			
			frameMenuInicial.setVisible(false);
			
			switch (opcaoMenuJTextField.getText()) {
			case "1":
				MenuInicialGerente menuInicialGerente = new MenuInicialGerente();
				menuInicialGerente.apresentarMenuInicialGerente();
				System.out.println("Cadastro de Gerentes!");
				break;
			
			case "2":
				
				MenuInicialCoordenador menuInicialCoordenador = new MenuInicialCoordenador();
				menuInicialCoordenador.apresentarMenuInicialCoordenador();
				System.out.println("Lista programadores");
						
				break;
			
			case "3":
				System.out.println("Você encerrou");
				break;
				
			
			}
			
			
		}else {
			
			System.out.println("Opção Invalida!!");
		}
			
	}
	
}
