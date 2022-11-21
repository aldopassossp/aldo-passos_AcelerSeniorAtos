package br.atos.telas.telasCoordenador.controleTelasCoordenador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import br.atos.telas.telasCoordenador.controleTelasCoordenador.ListarCoordenadorControle;

public class ListarCoordenadorControle implements ActionListener {
	
	JFrame frameMenuInicial;
	JFrame frameListar;

	
	public ListarCoordenadorControle(JFrame frameMenuInicial, JFrame frameListar) {
		super();
		this.frameMenuInicial = frameMenuInicial;
		this.frameListar = frameListar;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		frameListar.setVisible(false);
		frameMenuInicial.setVisible(true);
		
	}

}
