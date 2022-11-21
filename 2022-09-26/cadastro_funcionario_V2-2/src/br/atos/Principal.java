package br.atos;

import br.atos.controlador.ControleDeCadastro;

public class Principal {
	
	public static void main(String[] args) {

		ControleDeCadastro controleDeCadastro = new ControleDeCadastro();
		//Realizar chamado ao contrololador para iniciar o programa. 
		controleDeCadastro.iniciarPrograma();
	}
}
