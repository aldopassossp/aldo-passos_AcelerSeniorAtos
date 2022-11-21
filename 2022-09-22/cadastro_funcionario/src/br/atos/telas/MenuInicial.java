package br.atos.telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MenuInicial {
	
	public void apresentarMenuInicial() {
		
		String opcaoMenu = null;
		
		String menuInicialTexto = "Menu Inicial";
		String opcaoUmMenuTexto = "[1] Cadastro de Funcionários";
		String opcaoDoisMenuTexto = "[2] Listar Funcionários";
		String opcaoTresMenuTexto = "[3] Encerrar";
		
		JFrame frameMenuInicial = new JFrame();
		frameMenuInicial.setSize(600, 600);
		frameMenuInicial.setTitle("Cadastro de Funcionários");
		frameMenuInicial.setLocation(100, 100);
		
		JPanel panelMenuInicial = new JPanel();
		
		JLabel menuInicialTextoLabel = new JLabel(menuInicialTexto);
		panelMenuInicial.add(menuInicialTextoLabel);
		
		JLabel opcaoUmMenuTextoLabel = new JLabel(opcaoUmMenuTexto);
		panelMenuInicial.add(opcaoUmMenuTextoLabel);
		
		JLabel opcaoDoisMenuTextoLabel = new JLabel(opcaoDoisMenuTexto);
		panelMenuInicial.add(opcaoDoisMenuTextoLabel);
		
		JLabel opcaoTresMenuTextoLabel = new JLabel(opcaoTresMenuTexto);
		panelMenuInicial.add(opcaoTresMenuTextoLabel);
		
		JTextField opcaoMenuJTextField = new JTextField(10);
		panelMenuInicial.add(opcaoMenuJTextField);
		
		JButton botaoMenu = new JButton("Enviar");
		panelMenuInicial.add(botaoMenu);
	}

}
