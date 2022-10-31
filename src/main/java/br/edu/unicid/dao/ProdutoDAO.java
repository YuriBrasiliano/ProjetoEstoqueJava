package br.edu.unicid.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.edu.unicid.bean.Produto;
import br.edu.unicid.util.ConnectionFactory;

public class ProdutoDAO {
	
	private Produto produto;
	private Connection conn; // conecta com o banco de dados
	private PreparedStatement ps; // permite executar querys
	private ResultSet rs; // tabela

	public ProdutoDAO() throws Exception {
		try {
			conn = ConnectionFactory.getConnection();

		} catch (Exception erro) {
			throw new Exception("Erro " + erro.getMessage());
		}
	}

	public void salvar(Produto produto) throws Exception {
		try {
			String sql = "INSERT INTO tb_produto(codigo, nome, descricao, quantidade)" 
								  + "values (?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, produto.getCodigo());
			ps.setString(2, produto.getNome());
			ps.setString(3, produto.getDescricao());
			ps.setInt(4, produto.getQuantidade());
			
			ps.executeUpdate();
		} catch (Exception erro) {
			throw new Exception("Erro " + erro.getMessage());
		}finally {
		    try { rs.close(); } catch (Exception e) { /* Ignored */ }
		    try { ps.close(); } catch (Exception e) { /* Ignored */ }
		    try { conn.close(); } catch (Exception e) { /* Ignored */ }
		}
	}

	public void atualizar(Produto produto) throws Exception {
		try {
			String sql = "UPDATE tb_produto SET nome = ?, descricao = ?, quantidade = ? WHERE codigo = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, produto.getNome());
			ps.setString(2, produto.getDescricao());
			ps.setInt(3, produto.getQuantidade());
			ps.setInt(4, produto.getCodigo());
			
			ps.executeUpdate();
		} catch (Exception erro) {
			throw new Exception("Erro " + erro.getMessage());
		}finally {
		    try { rs.close(); } catch (Exception e) { /* Ignored */ }
		    try { ps.close(); } catch (Exception e) { /* Ignored */ }
		    try { conn.close(); } catch (Exception e) { /* Ignored */ }
		}
	}

	public void excluir(int codigo) throws Exception {
		try {
			String sql = "DELETE FROM tb_produto " + "WHERE codigo=?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, codigo);
			ps.executeUpdate();
		} catch (Exception erro) {
			throw new Exception("Erro " + erro.getMessage());
		}finally {
		    try { rs.close(); } catch (Exception e) { /* Ignored */ }
		    try { ps.close(); } catch (Exception e) { /* Ignored */ }
		    try { conn.close(); } catch (Exception e) { /* Ignored */ }
		}
		

	}

	
	public Produto consultar(int codigo) throws Exception {

		try {


			String sql = "SELECT * FROM tb_produto WHERE codigo=?";

			ps = conn.prepareStatement(sql);
			ps.setInt(1, codigo);
			rs = ps.executeQuery();

			while (rs.next()) {
				produto = new Produto();
				produto.setCodigo(rs.getInt(1));
				produto.setNome(rs.getString(2));
				produto.setDescricao(rs.getString(3));
				produto.setQuantidade(rs.getInt(4));

			}

			return produto;

		} catch (Exception e) {
			throw new Exception("Erro: " + e.getMessage());
		}finally {
		    try { rs.close(); } catch (Exception e) { /* Ignored */ }
		    try { ps.close(); } catch (Exception e) { /* Ignored */ }
		    try { conn.close(); } catch (Exception e) { /* Ignored */ }
		}

	}
	
		public List<Produto> consultartodos() throws Exception {
			List<Produto> list = new ArrayList<>();
			try {
				conn = this.conn;
				ps = conn.prepareStatement("SELECT * FROM tb_produto");
				rs = ps.executeQuery();
				
				while(rs.next()) {
					Produto produto = new Produto();
					produto.setCodigo(rs.getInt(1));
					produto.setNome(rs.getString(2));
					produto.setDescricao(rs.getString(3));
					produto.setQuantidade(rs.getInt(4));
					list.add(produto);			
				}
				return list;
						
			}catch (Exception e) {
				throw new Exception(e.getMessage());
			}
			finally {
			    try { rs.close(); } catch (Exception e) { /* Ignored */ }
			    try { ps.close(); } catch (Exception e) { /* Ignored */ }
			    try { conn.close(); } catch (Exception e) { /* Ignored */ }
			}
	}
		

	

	}
	
	
