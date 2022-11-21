package br.atos.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaDeConexao {
	
	private static String USERNAME = "root";
	private static String  PASSWORD = "root";

	private static String DATABASE_URL = "jdbc:mysql://localhost:3306/banco_funcionario?useTImezone=true&serverTimezone=UTC";
	
	public static Connection criarConexaoComMySql() throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conexao = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);

		
		return conexao;
	}
}
