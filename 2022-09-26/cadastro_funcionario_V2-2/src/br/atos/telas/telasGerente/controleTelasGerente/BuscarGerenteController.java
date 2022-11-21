package br.atos.telas.telasGerente.controleTelasGerente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import br.atos.model.Gerente;
import br.atos.repositorio.RepositorioGerente;
import br.atos.telas.telasGerente.TelaAlterarGerente;

public class BuscarGerenteController implements ActionListener {
	
	JFrame frameListarGerente;
	JFrame frameMenuInicial;
	JTextField cpfField;
	
	RepositorioGerente repositorioGerente;
	
	TelaAlterarGerente telaAlterarGerente = new TelaAlterarGerente();
	

	public BuscarGerenteController(JFrame frameListarGerente, JFrame frameMenuInicial, JTextField cpfField,
			RepositorioGerente repositorioGerente) {
		super();
		this.frameListarGerente = frameListarGerente;
		this.frameMenuInicial = frameMenuInicial;
		this.cpfField = cpfField;
		this.repositorioGerente = repositorioGerente;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Gerente gerenteAtual = new Gerente();
		
		gerenteAtual = repositorioGerente.BuscarGerente(cpfField.getText());
		
		if (!(gerenteAtual == null)) {
			frameListarGerente.setVisible(false);
			telaAlterarGerente.alterarGerente(frameMenuInicial, repositorioGerente, gerenteAtual);
		}
	
	}

}
