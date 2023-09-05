package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Produto;
import br.com.fiap.conexoes.ConexaoFactory;

public class ProdutoDAO {

	// Instânciar conexão
	public Connection minhaConexao;

// ============== CONSTRUTOR ================
	public ProdutoDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
// ============ MÉTODO INSERT ===============
	public String inserir (Produto produto) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement
				("insert into T_FIAP_PRODUTO (?,?,?,?,?)");
		stmt.setInt(1, produto.getCodigo());
		stmt.setString(2, produto.getTipo());
		stmt.setString(3, produto.getMarca());
		stmt.setDouble(4, produto.getValorVenda());
		stmt.setDouble(5, produto.getValorVenda());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com sucesso!‎";
	}
	
	
	
	
	
	
	
	
}
