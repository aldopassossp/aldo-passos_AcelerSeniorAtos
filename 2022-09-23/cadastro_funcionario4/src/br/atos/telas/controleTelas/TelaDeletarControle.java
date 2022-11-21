package br.atos.telas.controleTelas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.atos.model.Funcionario;
import br.atos.repositorio.RepositorioFuncionario;

public class TelaDeletarControle implements ActionListener{
	
	JFrame frameListarFuncionario;
	JFrame menuInicialFrame;
	JTextField cpfField;
	RepositorioFuncionario repositorioFuncionario;
	
	boolean validaDelete;
	
	public TelaDeletarControle(JFrame frameListarFuncionario, JFrame menuInicialFrame, JTextField cpfField,
			RepositorioFuncionario repositorioFuncionario) {
		super();
		this.frameListarFuncionario = frameListarFuncionario;
		this.menuInicialFrame = menuInicialFrame;
		this.cpfField = cpfField;
		this.repositorioFuncionario = repositorioFuncionario;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		validaDelete = repositorioFuncionario.deletarFuncionario(cpfField.getText());
	
		if(validaDelete) {
			JOptionPane.showMessageDialog(null, "Funcionario excluido com Sucesso");
			menuInicialFrame.setVisible(true);
			frameListarFuncionario.setVisible(false);
			
		}else {
			JOptionPane.showMessageDialog(null, "Funcionario não encontrado!!");
			menuInicialFrame.setVisible(true);
			frameListarFuncionario.setVisible(false);
		
		}
		
	
	}
	
	
}
