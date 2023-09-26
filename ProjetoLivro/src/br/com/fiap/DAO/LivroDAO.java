package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.beans.Livro;
import br.com.fiap.conexoes.ConexaoFactory;

public class LivroDAO {

	public Connection minhaConexao;
	
// ================ MÉTODO CONSTRUTOR COM CONEXÃO ===================
	public LivroDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
// ================ MÉTODO INSERT ===================
	public String inserir (Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement("insert into T_FIAP_LIVRO values (?, ?, ?, ?, ?)");
		stmt.setInt(1, livro.getCodigo());
		stmt.setString(2, livro.getTitulo());
		stmt.setString(3, livro.getAutor());
		stmt.setString(4, livro.getEditora());
		stmt.setDouble(5, livro.getValor());
		stmt.execute();
		stmt.close();
		
		
		return "Livro cadastrado com sucesso!";
	}
	
// ================ MÉTODO DELETE ===================
	public String deletar(Livro livro) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(" delete from T_FIAP_LIVRO where CODIGO_LIVRO = ?");
		stmt.setInt(1 , livro.getCodigo());
		stmt.executeUpdate();
		stmt.close();
		
		return "Deletado com sucesso!";

		}

// ================ MÉTODO UPDATE ===================
	public String alterar(Livro livro ) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(" Update T_FIAP_LIVRO set TITULO_LIVRO = ? , AUTOR_LIVRO = ? , EDITORA_LIVRO = ? , VALOR_LIVRO = ? , where CODIGO_LIVVRO = ? ");
		stmt.setString(1, livro.getTitulo());
		stmt.setString(2, livro.getAutor());
		stmt.setString(3, livro.getEditora());
		stmt.setDouble(4, livro.getValor());
		stmt.executeUpdate();
		stmt.close();		
				
		return "Alterado com sucesso!";
	}
	

// ================ MÉTODO SELECT ===================
	public List<Livro> selecionar() throws SQLException{
		List<Livro> listaLivros = new ArrayList <Livro> ();
		PreparedStatement stmt = minhaConexao.prepareStatement(" Select * from T_FIAP_LIVRO");
		
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			Livro livro = new Livro();
			livro.setCodigo(rs.getInt(1));
			livro.setTitulo(rs.getString(2));
			livro.setAutor(rs.getString(3));
			livro.setEditora(rs.getString(4));
			livro.setValor(rs.getDouble(5));
			listaLivros.add(livro);
		}
		
		return listaLivros;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
