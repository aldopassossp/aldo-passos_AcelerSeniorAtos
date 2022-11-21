package br.atos.dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.atos.model.UsuarioEntidade;

public class CadastroUsuarioDao {
	public boolean validaCadastroUsuario(UsuarioEntidade loginEntidade) {
		
		boolean validar = false;
		
		if(ValidaUsuario(loginEntidade)) {
			
			validar = false;
			
		}else {
		
			String sql = "INSERT INTO tb_usuario (usuario, password) VALUES ( ?, ?)";
			
			try {
				Connection conn = FabricaDeConexao.criarConexaoComMySql();
				try {
					PreparedStatement pstm = (PreparedStatement)conn.prepareStatement(sql);
					
					pstm.setString(1, loginEntidade.getUsuario());
					pstm.setString(2, loginEntidade.getPassword());
					
					pstm.execute();
					
					validar = true;
					
				} catch (Exception e1) {
					e1.printStackTrace();
					System.out.println("Não foi pssível realizar o cadastro!");
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erro ao abrir a conexão!");
			}
		}
		
		return validar;
	}
	
	public boolean ValidaUsuario(UsuarioEntidade loginEntidade){
		
		boolean validarUsuario = false;
		
		String sql = "SELECT * FROM tb_usuario WHERE usuario = ?";
		
		try {
			Connection conn = FabricaDeConexao.criarConexaoComMySql();
			try {
				PreparedStatement pstm = (PreparedStatement)conn.prepareStatement(sql);
				
				pstm.setString(1, loginEntidade.getUsuario());
				
				ResultSet result = pstm.executeQuery();
				
				validarUsuario = result.next();
				
			} catch (Exception e1) {
				e1.printStackTrace();
				System.out.println("Login já existe! Tente outro!");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao abrir a conexão!");
		}
		return validarUsuario;
		
	}

}
