package br.atos.telas.telasGerente.controleTelasGerente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.atos.model.Gerente;
import br.atos.repositorio.RepositorioGerente;

public class TelaDeletarGerenteControle implements ActionListener {

	JFrame frameListarGerente;
	JFrame menuInicialFrame;
	JTextField cpfField;
	RepositorioGerente repositorioGerente;
	//frameListarGerente, menuInicialFrame, cpfTextField, repositorioGerente
	
	boolean validaDelete;
	
	public TelaDeletarGerenteControle(JFrame frameListarGerente, JFrame menuInicialFrame, JTextField cpfField,
			RepositorioGerente repositorioGerente) {
		super();
		this.frameListarGerente = frameListarGerente;
		this.menuInicialFrame = menuInicialFrame;
		this.cpfField = cpfField;
		this.repositorioGerente = repositorioGerente;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		validaDelete = repositorioGerente.deletarGerente(cpfField.getText());
	
		if(validaDelete) {
			JOptionPane.showMessageDialog(null, "Gerente excluido com Sucesso");
			menuInicialFrame.setVisible(true);
			frameListarGerente.setVisible(false);
			
		}else {
			JOptionPane.showMessageDialog(null, "Gerente não encontrado!!");
			menuInicialFrame.setVisible(true);
			frameListarGerente.setVisible(false);
		
		}	
	
	}
	
}
