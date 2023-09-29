package br.com.mavenquickstart.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.mavenquickstart.infrastructure.database.ConnectionFactory;

public class ProdutoDAO {

	private final Connection connection;
	
	public ProdutoDAO() throws SQLException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
// --------- CREATE ---------------
	public void Inserir(Produto produto) throws SQLException {
		String sql = "INSERT INTO PRODUTO(ID, NOME, PRECO) VALUES (?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
				statement.setInt(1, produto.getId());
				statement.setString(2, produto.getNome());
				statement.setDouble(3, produto.getPreco());
				statement.execute();
				statement.close();
	}
	
// --------- UPDATE ----------------
	public void Alterar(Produto produto) throws SQLException {
		String sql = "UPDATE PRODUTO SET NOME = ?, PRECO = ? WHERE ID = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
				statement.setInt(3, produto.getId());
				statement.setString(1, produto.getNome());
				statement.setDouble(2, produto.getPreco());
				statement.executeUpdate();
				statement.close();
	}

// --------- DELETE ----------------
	public void Deletar(int id) throws SQLException {
			String sql = " DELETE FROM PRODUTO WHERE ID = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
					statement.setInt(1 , id);
					statement.executeUpdate();
					statement.close();
	}
	
// --------- SELECT ----------------
	public List<Produto> Buscar() throws SQLException{
		ArrayList<Produto> listaDeProdutos = new ArrayList<Produto>();
		String sql = "SELECT * FROM PRODUTO";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet rs = statement.executeQuery();
		while(rs.next()) {
			Produto produto = new Produto();
			produto.setId(rs.getInt(1));
			produto.setNome(rs.getString(2));
			produto.setPreco(rs.getDouble(3));
			listaDeProdutos.add(produto);
		}
		return listaDeProdutos;
	}

}
