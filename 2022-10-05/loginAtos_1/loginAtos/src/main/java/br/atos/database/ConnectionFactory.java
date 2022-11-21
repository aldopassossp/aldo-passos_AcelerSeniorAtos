package br.atos.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static String USERNAME = "ugcscmhjgyzvq5al";
	private static String  PASSWORD = "Rv7Sw8DWdQhYWekoNqrb";

	private static String DATABASE_URL = "jdbc:mysql://ugcscmhjgyzvq5al:Rv7Sw8DWdQhYWekoNqrb@b6zssunkogtibmcmggtn-mysql.services.clever-cloud.com:3306/b6zssunkogtibmcmggtn";
	
	public static Connection criarConexaoComMySql() throws Exception {
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection conexao = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);

			
			return conexao;
		} catch (Exception e) {
			// TODO: handle exception
		}

		return null;
	}

}
