package br.atos.telas.telasCoordenador.controleTelasCoordenador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.atos.repositorio.RepositorioCoordenador;
import br.atos.telas.telasCoordenador.BuscarCoordenadorEditar;
import br.atos.telas.telasCoordenador.ListarCoordenador;
import br.atos.telas.telasCoordenador.TelaDeletarCoordenador;
import br.atos.telas.telasCoordenador.TelaRegistroCoordenador;

public class MenuInicialCoordenadorControle implements ActionListener{
	
	JTextField opcaoMenuJTextField;
	JFrame frameMenuInicial;
	
	ListarCoordenador listarCoordenador = new ListarCoordenador();
	
	TelaDeletarCoordenador telaDeletar = new TelaDeletarCoordenador();
	
	TelaRegistroCoordenador telaRegistroCoordenador = new TelaRegistroCoordenador();
	
	RepositorioCoordenador repositorioCoordenador = new RepositorioCoordenador();
	
	BuscarCoordenadorEditar buscarCoordenadorEditar= new BuscarCoordenadorEditar();
	
	public MenuInicialCoordenadorControle() {
		
	}
	
	public MenuInicialCoordenadorControle(JTextField opcaoMenuJTextFieldCr,JFrame frameMenuInicialCr) {
		this.opcaoMenuJTextField = opcaoMenuJTextFieldCr;
		this.frameMenuInicial = frameMenuInicialCr;
	}

	public void actionPerformed(ActionEvent e) {
		if(opcaoMenuJTextField.getText().equals("1") || opcaoMenuJTextField.getText().equals("2") || 
				opcaoMenuJTextField.getText().equals("3") || opcaoMenuJTextField.getText().equals("4") || 
				opcaoMenuJTextField.getText().equals("5") || opcaoMenuJTextField.getText().equals("6") ){
			
			frameMenuInicial.setVisible(false);
			
			switch (opcaoMenuJTextField.getText()) {
			case "1":
				telaRegistroCoordenador.registrarCoordenador(opcaoMenuJTextField, frameMenuInicial, repositorioCoordenador);
				
				System.out.println("Cadastre o coordenador!");
				break;
			
			case "2":
				
				listarCoordenador.apresentarLista(repositorioCoordenador.listarCoordenador(), frameMenuInicial);
				System.out.println("Lista programadores");				
				break;
			
			case "3":
				buscarCoordenadorEditar.buscarCoordenador(frameMenuInicial, repositorioCoordenador);			
				break;
				
			case "4":
				telaDeletar.deletarCoordenador(frameMenuInicial, repositorioCoordenador);
				break;
				
			case "5":
				frameMenuInicial.setVisible(true);
				System.out.println("Retornar ao menu anterior");
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
