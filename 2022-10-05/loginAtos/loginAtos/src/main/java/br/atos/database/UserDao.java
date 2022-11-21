package br.atos.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.atos.model.User;

public class UserDao {
	
	public boolean salvarNoBanco(User user){
		
			String sql = "INSERT INTO users (nome, senha, email, telefone) VALUES ( ?, ?, ?, ? )";
			
			boolean validaSalvar = false;
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				
				conn = ConnectionFactory.criarConexaoComMySql();
				pstm = conn.prepareStatement(sql);
				
				pstm.setString(1, user.getNome());
				pstm.setString(2, user.getSenha());
				pstm.setString(3, user.getEmail());
				pstm.setString(4, user.getTelefone());
				
				pstm.execute();
				validaSalvar = true;
				
			} catch (Exception e) {
				
				e.printStackTrace();
				System.out.println("Ocorreu um erro ao salvar os dados!");
				
			}finally {
				
				try {
					
					if(conn != null) {
						conn.close();
					}
					
					if(pstm != null) {
						pstm.close();
					}
					
				} catch (Exception e2) {

					e2.printStackTrace();
					System.out.println("Erro ao encerrar conexão!");
				}
			}			
		
		return validaSalvar;
	}
	
	public boolean validaLogin(User user) {
		
		String sql = "SELECT * FROM users WHERE nome = ? AND senha = ?";
		boolean validaLogin = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = ConnectionFactory.criarConexaoComMySql();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, user.getNome());
			pstm.setString(2, user.getSenha());
			
			ResultSet result = pstm.executeQuery();
			validaLogin = result.next();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Ocorreu um erro ao salvar os dados!");
			
		}finally {
			
			try {
				
				if(conn != null) {
					conn.close();
				}
				
				if(pstm != null) {
					pstm.close();
				}
				
			} catch (Exception e2) {

				e2.printStackTrace();
				System.out.println("Erro ao encerrar conexão!");
			}
		}
		
		return validaLogin;
	}

}
