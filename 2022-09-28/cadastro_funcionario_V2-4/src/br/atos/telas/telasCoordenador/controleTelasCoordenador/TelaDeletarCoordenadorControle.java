package br.atos.telas.telasCoordenador.controleTelasCoordenador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.atos.repositorio.RepositorioCoordenador;

public class TelaDeletarCoordenadorControle implements ActionListener{
	
	JFrame frameListarCoordenador;
	JFrame menuInicialFrame;
	JTextField cpfField;
	RepositorioCoordenador repositorioCoordenador;
	//frameListarCoordenador, menuInicialFrame, cpfTextField, repositorioCoordenador
	
	boolean validaDelete;
	
	public TelaDeletarCoordenadorControle(JFrame frameListarCoordenador, JFrame menuInicialFrame, JTextField cpfField,
			RepositorioCoordenador repositorioCoordenador) {
		super();
		this.frameListarCoordenador = frameListarCoordenador;
		this.menuInicialFrame = menuInicialFrame;
		this.cpfField = cpfField;
		this.repositorioCoordenador = repositorioCoordenador;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		validaDelete = repositorioCoordenador.deletarCoordenador(cpfField.getText());
	
		if(validaDelete) {
			JOptionPane.showMessageDialog(null, "Coordenador excluido com Sucesso");
			menuInicialFrame.setVisible(true);
			frameListarCoordenador.setVisible(false);
			
		}else {
			JOptionPane.showMessageDialog(null, "Coordenador não encontrado!!");
			menuInicialFrame.setVisible(true);
			frameListarCoordenador.setVisible(false);
		
		}	
	
	}

}
