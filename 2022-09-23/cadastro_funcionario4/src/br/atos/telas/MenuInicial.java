package br.atos.telas;

import java.awt.Component;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.atos.telas.controleTelas.MenuInicialControle;

public class MenuInicial {
	
	public void apresentarMenuInicial() {
		
		String opcaoMenu = null;
		
		Box box = Box.createVerticalBox();
		
		String menuInicialTexto = "Menu Inicial";
		String opcaoUmMenuTexto = "[1] Cadastro de Funcionários";
		String opcaoDoisMenuTexto = "[2] Listar Funcionários";
		String opcaoTresMenuTexto = "[3] Excluir";
		String opcaoQuatroMenuTexto = "[4] Encerrar";
		
		JFrame frameMenuInicial = new JFrame();
		frameMenuInicial.setSize(300, 300);
		frameMenuInicial.setTitle("Cadastro de Funcionários");
		frameMenuInicial.setLocation(100, 100);
		
		JPanel panelMenuInicial = new JPanel();
		
		JLabel menuInicialTextoLabel = new JLabel(menuInicialTexto);
		box.add(menuInicialTextoLabel);
		
		JLabel opcaoUmMenuTextoLabel = new JLabel(opcaoUmMenuTexto);
		opcaoUmMenuTextoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(opcaoUmMenuTextoLabel);
		
		JLabel opcaoDoisMenuTextoLabel = new JLabel(opcaoDoisMenuTexto);
		opcaoDoisMenuTextoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(opcaoDoisMenuTextoLabel);
		
		JLabel opcaoTresMenuTextoLabel = new JLabel(opcaoTresMenuTexto);
		opcaoTresMenuTextoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(opcaoTresMenuTextoLabel);
		
		JLabel opcaoQuatroMenuTextoLabel = new JLabel(opcaoQuatroMenuTexto);
		opcaoQuatroMenuTextoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
		box.add(opcaoQuatroMenuTextoLabel);
		
		JTextField opcaoMenuJTextField = new JTextField(10);
		box.add(opcaoMenuJTextField);
		
		JButton botaoMenu = new JButton("Enviar");
		box.add(botaoMenu);
		
		panelMenuInicial.add(box);
		
		
		frameMenuInicial.add(panelMenuInicial);
		frameMenuInicial.setVisible(true);
		
		MenuInicialControle menuInicialControle = new MenuInicialControle(opcaoMenuJTextField, frameMenuInicial);
		
		botaoMenu.addActionListener(menuInicialControle);
		
	}

}
