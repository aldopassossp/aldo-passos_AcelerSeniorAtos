package br.atos.dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.atos.dataAccess.FabricaDeConexao;
import br.atos.model.UsuarioEntidade;

public class LoginDao {
	
	public boolean validaLogin(UsuarioEntidade loginEntidade) {
	
		boolean validar = false;
		
		String sql = "SELECT * FROM tb_usuario WHERE usuario = ? AND password = ?";
		
		try {
			Connection conn = FabricaDeConexao.criarConexaoComMySql();
			try {
				PreparedStatement pstm = (PreparedStatement)conn.prepareStatement(sql);
				
				pstm.setString(1, loginEntidade.getUsuario());
				pstm.setString(2, loginEntidade.getPassword());
				
				ResultSet result = pstm.executeQuery();
				
				validar = result.next();
				
			} catch (Exception e1) {
				e1.printStackTrace();
				System.out.println("Não foi pssível efetuar o Login!");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir a conexão!");
		}
		

		
		return validar;
	}

}
