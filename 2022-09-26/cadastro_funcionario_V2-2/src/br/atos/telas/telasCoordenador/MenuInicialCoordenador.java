package br.atos.telas.telasCoordenador;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.atos.telas.telasCoordenador.controleTelasCoordenador.MenuInicialCoordenadorControle;

public class MenuInicialCoordenador {
	
	public void apresentarMenuInicialCoordenador(){
		
		String opcaoMenu = null;
		
		
		String menuInicialTexto = "Menu Inicial - Coordenadors";
		String opcaoUmMenuTexto = "[1]Cadastrar Novo Coordenadors";
		String opcaoDoisMenuTexto = "[2] Listar Coordenadors";
		String opcaoTresMenuTexto = "[3] Alterar Coordenador";
		String opcaoQuatroMenuTexto = "[4] Excluir Coordenador";
		String opcaoCincoMenuTexto = "[5] Voltar";
		String opcaoSeisMenuTexto = "[6] Sair";
		
		JFrame frameMenuInicialCoordenador = new JFrame();
		frameMenuInicialCoordenador.setSize(200, 300);
		frameMenuInicialCoordenador.setTitle("Cadastro de Coordenadors");
		frameMenuInicialCoordenador.setLocation(300,300);
		
		JPanel panelMenuInicial = new JPanel();
		
		JLabel menuInicialTextoLabel = new JLabel(menuInicialTexto);
		panelMenuInicial.add(menuInicialTextoLabel);
		
		JLabel opcaoUmMenuTextoLabel = new JLabel(opcaoUmMenuTexto);
		panelMenuInicial.add(opcaoUmMenuTextoLabel);
		
		JLabel opcaoDoisMenuTextoLabel = new JLabel(opcaoDoisMenuTexto );
		panelMenuInicial.add(opcaoDoisMenuTextoLabel);
		
		JLabel opcaoTresMenuTextoLabel = new JLabel(opcaoTresMenuTexto);
		panelMenuInicial.add(opcaoTresMenuTextoLabel);
		
		JLabel opcaoQuatroMenuTextoLabel = new JLabel(opcaoQuatroMenuTexto);
		panelMenuInicial.add(opcaoQuatroMenuTextoLabel);
		
		JLabel opcaoCincoMenuTextoLabel = new JLabel(opcaoCincoMenuTexto);
		panelMenuInicial.add(opcaoCincoMenuTextoLabel);
		
		JLabel opcaoSeisMenuTextoLabel = new JLabel(opcaoSeisMenuTexto);
		panelMenuInicial.add(opcaoSeisMenuTextoLabel);
		
		
		JTextField opcaoMenuJTextField = new JTextField(10);
		panelMenuInicial.add(opcaoMenuJTextField);

		
		JButton botaoMenu = new JButton("Enviar");
		panelMenuInicial.add(botaoMenu);
		
		
		frameMenuInicialCoordenador.add(panelMenuInicial);
		frameMenuInicialCoordenador.setVisible(true);
		
		MenuInicialCoordenadorControle menuInicialCoordenadorControle = new MenuInicialCoordenadorControle(opcaoMenuJTextField,frameMenuInicialCoordenador);
		
		botaoMenu.addActionListener(menuInicialCoordenadorControle);
	}

}
