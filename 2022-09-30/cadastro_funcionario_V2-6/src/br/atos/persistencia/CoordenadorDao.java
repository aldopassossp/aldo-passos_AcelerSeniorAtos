package br.atos.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.atos.model.Coordenador;
import br.atos.model.Endereco;
import br.atos.model.Gerente;

public class CoordenadorDao {

	public boolean salvarNoBanco(Coordenador coordenador) {
		
		String sql = "INSERT INTO coordenador (cpf, nome, salario_liquido, loja, meta_loja, estado,"
				+ " cidade, rua) values (?, ?, ?, ?, ?, ?, ?, ?)";
		boolean validaSalvar = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = FabricaDeConexao.criarConexaoComMySql();
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			pstm.setString(1, coordenador.getCpf());
			pstm.setString(2, coordenador.getNome());
			pstm.setDouble(3, coordenador.getSalarioLiquido());
			pstm.setString(4, coordenador.getLoja());
			pstm.setDouble(5, coordenador.getMetaDaLoja());
			pstm.setString(6, coordenador.getEndereco().getEstado());
			pstm.setString(7, coordenador.getEndereco().getCidade());
			pstm.setString(8, coordenador.getEndereco().getRua());
			
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
	
	public List<Coordenador> ListarCoordenador(){
		
		String sql = "Select * from coordenador";
		List<Coordenador> listarCoordenadores = new ArrayList<>();
		boolean validaSalvar = false;
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet resultSet = null;
		
		try {
			
			conn = FabricaDeConexao.criarConexaoComMySql();
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			resultSet = pstm.executeQuery();
			
			while(resultSet.next()) {
				Coordenador coordenador = new Coordenador();
				Endereco endereco = new Endereco();
				
				coordenador.setCpf(resultSet.getString("cpf"));
				coordenador.setNome(resultSet.getString("nome"));
				//System.out.println(resultSet.getString("nome"));
				coordenador.setSalarioLiquido(resultSet.getDouble("salario_liquido"));
				coordenador.setLoja(resultSet.getString("loja"));
				coordenador.setMetaDaLoja(resultSet.getDouble("meta_loja"));
				endereco.setEstado(resultSet.getString("estado"));
				endereco.setCidade(resultSet.getString("cidade"));
				endereco.setRua(resultSet.getString("rua"));
				
				coordenador.setEndereco(endereco);
				
				listarCoordenadores.add(coordenador);
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
				System.out.println("Erro ao listar coordenadores");
			}
		}
		
		return listarCoordenadores;
	}
	
	public boolean deletarCoordenador(String cpf) {
		
		String sql = "DELETE FROM coordenador WHERE cpf = ?";
		boolean validaSalvar = false;

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			
			conn = FabricaDeConexao.criarConexaoComMySql();
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			pstm.setString(1, cpf);
			pstm.execute();
			
			validaSalvar = true;
		
		}catch (Exception e) {
			
			System.out.println("Algo de errado aconteceu");
			e.printStackTrace();
			
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
				System.out.println("Erro ao fechar a conexão!");
			}
		}
		
		return validaSalvar;
	}
	
	public boolean alterarCoordenador(Coordenador coordenador) {
		
		
		String sql = "UPDATE gerente SET  nome = ?, salario_liquido = ?, loja = ?, meta_loja = ?,"
				+ " estado = ?, cidade = ?, rua = ? WHERE cpf = ?";
		
		boolean validaAlterar = false;

		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			
			conn = FabricaDeConexao.criarConexaoComMySql();
			pstm = (PreparedStatement)conn.prepareStatement(sql);
			
			pstm.setString(8, coordenador.getCpf());
			pstm.setString(1, coordenador.getNome());
			pstm.setDouble(2, coordenador.getSalarioLiquido());
			pstm.setString(3, coordenador.getLoja());
			pstm.setDouble(4, coordenador.getMetaDaLoja());
			pstm.setString(5, coordenador.getEndereco().getEstado());
			pstm.setString(6, coordenador.getEndereco().getCidade());
			pstm.setString(7, coordenador.getEndereco().getRua());
			
			pstm.execute();
			
			validaAlterar = true;
			
		} catch (Exception e) {

			System.out.println("Erro ao alterar coordenador!");
			e.printStackTrace();
			
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
				System.out.println("Erro ao encerrar conexão");
				
			}
			
		}
		
		return validaAlterar;
	}
}
