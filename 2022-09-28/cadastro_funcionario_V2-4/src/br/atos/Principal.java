package br.atos;

import java.sql.Connection;

import br.atos.controlador.ControleDeCadastro;
import br.atos.model.Endereco;
import br.atos.model.Gerente;
import br.atos.persistencia.FabricaDeConexao;
import br.atos.persistencia.GerenteDao;

public class Principal {
	
	public static void main(String[] args) throws Exception {

		ControleDeCadastro controleDeCadastro = new ControleDeCadastro();
		//Realizar chamado ao contrololador para iniciar o programa. 
		controleDeCadastro.iniciarPrograma();
		
//		FabricaDeConexao fabricaDeConexao = new FabricaDeConexao();
//		
//		Connection connectionTeste = fabricaDeConexao.criarConexaoComMySql();
//		
//		if(!(connectionTeste == null)) {
//			System.out.println("Conectado");
//		}else {
//			System.out.println("Erro");
//		}
//		
//		
//		GerenteDao dao = new GerenteDao();
//		Gerente gerente = new Gerente();
//		Endereco endereco = new Endereco();
//		
//		endereco.setEstado("MG");
//		endereco.setCidade("Patos");
//		endereco.setRua("Teste");
//		
//		gerente.setCpf("123");
//		gerente.setNome("Aldo");
//		gerente.setSalarioLiquido(10.0);
//		gerente.setRegional("Patos");
//		gerente.setMetaRegional(20.0);
//		gerente.setEndereco(endereco);
//		
//		boolean teste = dao.salvarNoBanco(gerente);
//		
//		if(teste) {
//			System.out.println("Deu certo");
//		}else {
//			System.out.println("Deu errado!");
//		}
//		
//		
	}
}
