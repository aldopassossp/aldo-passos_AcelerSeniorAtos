package br.atos.telas.telasGerente;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.atos.controlador.SoNumeros;
import br.atos.telas.controleTelas.MenuInicialControle;
import br.atos.telas.telasGerente.controleTelasGerente.MenuInicialGerenteControle;

public class MenuInicialGerente {
	
	public void apresentarMenuInicialGerente(){
		
		String opcaoMenu = null;
		
		
		String menuInicialTexto =     "   Menu Inicial - Gerentes  ";
		String opcaoUmMenuTexto =     "[1]Cadastrar Novo Gerentes  ";
		String opcaoDoisMenuTexto =   "[2] Listar Gerentes         ";
		String opcaoTresMenuTexto =   "[3] Alterar Gerente         ";
		String opcaoQuatroMenuTexto = "[4] Excluir Gerente         ";
		String opcaoCincoMenuTexto =  "[5] Voltar                  ";
		String opcaoSeisMenuTexto =   "[6] Sair                    ";
		
		JFrame frameMenuInicialGerente = new JFrame();
		frameMenuInicialGerente.setSize(200, 250);
		frameMenuInicialGerente.setTitle("Cadastro de Gerentes");
		frameMenuInicialGerente.setLocation(150,150);
		
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
		opcaoMenuJTextField.setDocument(new SoNumeros());
		panelMenuInicial.add(opcaoMenuJTextField);

		
		JButton botaoMenu = new JButton("Enviar");
		panelMenuInicial.add(botaoMenu);
		
		
		frameMenuInicialGerente.add(panelMenuInicial);
		frameMenuInicialGerente.setVisible(true);
		
		MenuInicialGerenteControle menuInicialGerenteControle = new MenuInicialGerenteControle(opcaoMenuJTextField,frameMenuInicialGerente);
		
		botaoMenu.addActionListener(menuInicialGerenteControle);
	}

}
