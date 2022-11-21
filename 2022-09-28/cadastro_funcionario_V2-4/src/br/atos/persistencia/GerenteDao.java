package br.atos.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.atos.model.Coordenador;
import br.atos.model.Endereco;
import br.atos.model.Gerente;

public class GerenteDao {

	public boolean salvarNoBanco(Gerente gerente) {
		
		String sql = "INSERT INTO gerente (cpf, nome, salario_liquido, regional, meta_regional, estado,"
				+ " cidade, rua) values (?, ?, ?, ?, ?, ?, ?, ?)";
		boolean validaSalvar = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = FabricaDeConexao.criarConexaoComMySql();
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			pstm.setString(1, gerente.getCpf());
			pstm.setString(2, gerente.getNome());
			pstm.setDouble(3, gerente.getSalarioLiquido());
			pstm.setString(4, gerente.getRegional());
			pstm.setDouble(5, gerente.getMetaRegional());
			pstm.setString(6, gerente.getEndereco().getEstado());
			pstm.setString(7, gerente.getEndereco().getCidade());
			pstm.setString(8, gerente.getEndereco().getRua());
			
			pstm.execute();
			
			System.out.println("Registrado com sucesso!");
			validaSalvar = true;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("Erro ao salvar dados!");
			
		}finally {
			
			try {
				
				if(pstm != null) {
					pstm.close();
				}
				if(conn != null) {
					conn.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
				System.out.println("Erro ao tentar encerrar a conexão!");
			}
			
		}
		
		return validaSalvar;
	}
	
	public List<Gerente> ListarGerente(){
		
		String sql = "Select * from gerente";
		List<Gerente> listarGerentes = new ArrayList<>();
		boolean validaSalvar = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet resultSet = null;
		
		try {
			
			conn = FabricaDeConexao.criarConexaoComMySql();
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			resultSet = pstm.executeQuery();
			
			while(resultSet.next()) {
				Gerente gerente = new Gerente();
				Endereco endereco = new Endereco();
				
				gerente.setCpf(resultSet.getString("cpf"));
				gerente.setNome(resultSet.getString("nome"));
				gerente.setSalarioLiquido(resultSet.getDouble("salario_liquido"));
				gerente.setRegional(resultSet.getString("regional"));
				gerente.setMetaRegional(resultSet.getDouble("meta_regional"));
				endereco.setEstado(resultSet.getString("estado"));
				endereco.setCidade(resultSet.getString("cidade"));
				endereco.setRua(resultSet.getString("rua"));
				
				gerente.setEndereco(endereco);
				
				listarGerentes.add(gerente);
			}
			
			
		} catch (Exception e) {
			
			System.out.println("Algo de errado aconteceu");
			e.printStackTrace();
			
		}finally {
			
			try {
				
				if(resultSet != null) {
					resultSet.close();
				}
				
				if(conn != null) {
					conn.close();
				}
				
				if(pstm != null) {
					pstm.close();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
				System.out.println("Erro ao listar gerentes");
			}
		}
		
		return listarGerentes;
	}
}
