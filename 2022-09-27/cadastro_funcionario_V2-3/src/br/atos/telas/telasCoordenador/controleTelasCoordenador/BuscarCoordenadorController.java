package br.atos.telas.telasCoordenador.controleTelasCoordenador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.atos.model.Coordenador;
import br.atos.repositorio.RepositorioCoordenador;
import br.atos.telas.telasCoordenador.TelaAlterarCoordenador;

public class BuscarCoordenadorController implements ActionListener {
	
	JFrame frameListarCoordenador;
	JFrame frameMenuInicial;
	JTextField cpfField;
	
	RepositorioCoordenador repositorioCoordenador;
	
	TelaAlterarCoordenador telaAlterarCoordenador = new TelaAlterarCoordenador();
	

	public BuscarCoordenadorController(JFrame frameListarCoordenador, JFrame frameMenuInicial, JTextField cpfField,
			RepositorioCoordenador repositorioCoordenador) {
		super();
		this.frameListarCoordenador = frameListarCoordenador;
		this.frameMenuInicial = frameMenuInicial;
		this.cpfField = cpfField;
		this.repositorioCoordenador = repositorioCoordenador;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Coordenador coordenadorAtual = new Coordenador();
		
		coordenadorAtual = repositorioCoordenador.BuscarCoordenador(cpfField.getText());
		
		if (!(coordenadorAtual == null)) {
			frameListarCoordenador.setVisible(false);
			telaAlterarCoordenador.alterarCoordenador(frameMenuInicial, repositorioCoordenador, coordenadorAtual);
		}
	
	}

}
