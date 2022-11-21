package br.atos.telas;

import java.awt.Component;
import java.awt.Rectangle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.atos.controlador.SoNumeros;
import br.atos.telas.controleTelas.MenuInicialControle;


public class MenuInicial {

	public void apresentarMenuInicial(){
		
		String opcaoMenu = null;
		
		
		String menuInicialTexto =   "        Menu Inicial           ";
		String opcaoUmMenuTexto =   "[1] Cadastro de Gerentes       ";
		String opcaoDoisMenuTexto = "[2] Cadastro de Coordenadores  ";
		String opcaoTresMenuTexto = "[3] Encerrar                   ";
		
		JFrame frameMenuInicial = new JFrame();
		frameMenuInicial.setSize(200, 300);
		frameMenuInicial.setTitle("Cadastro de Funcionários");
		frameMenuInicial.setLocation(150,150);
		
		JPanel panelMenuInicial = new JPanel();
		
		JLabel menuInicialTextoLabel = new JLabel(menuInicialTexto);
		menuInicialTextoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelMenuInicial.add(menuInicialTextoLabel);
		
		JLabel opcaoUmMenuTextoLabel = new JLabel(opcaoUmMenuTexto);
		opcaoUmMenuTextoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelMenuInicial.add(opcaoUmMenuTextoLabel);
		
		JLabel opcaoDoisMenuTextoLabel = new JLabel(opcaoDoisMenuTexto );
		panelMenuInicial.add(opcaoDoisMenuTextoLabel);
		
		JLabel opcaoTresMenuTextoLabel = new JLabel(opcaoTresMenuTexto);
		panelMenuInicial.add(opcaoTresMenuTextoLabel);
		
		
		JTextField opcaoMenuJTextField = new JTextField(10);
		opcaoMenuJTextField.setDocument(new SoNumeros());
		panelMenuInicial.add(opcaoMenuJTextField);

		
		JButton botaoMenu = new JButton("Enviar");
		panelMenuInicial.add(botaoMenu);
		
		
		frameMenuInicial.add(panelMenuInicial);
		frameMenuInicial.setVisible(true);
		
		MenuInicialControle menuInicialControle = new MenuInicialControle(opcaoMenuJTextField,frameMenuInicial);
		
		botaoMenu.addActionListener(menuInicialControle);
	}
}
