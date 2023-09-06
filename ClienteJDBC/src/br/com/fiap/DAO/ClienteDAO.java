package br.com.fiap.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.beans.Cliente;
import br.com.fiap.conexoes.ConexaoFactory;

public class ClienteDAO {

	public Connection minhaConexao;
	
	public ClienteDAO() throws ClassNotFoundException, SQLException {
		super();
		this.minhaConexao = new ConexaoFactory().conexao();
	}
	
	public String inserir(Cliente cliente) throws SQLException {
		PreparedStatement stmt = minhaConexao.prepareStatement(" insert into T_FIAP_CLIENTE values(?, ?, ?, ?, ?)");
		stmt.setInt(1, cliente.getCodigo());
		stmt.setString(2, cliente.getNome());
		stmt.setString(3, cliente.getEmail());
		stmt.setInt(4, cliente.getIdade());
		stmt.setDouble(5, cliente.getValorMensalidade());
		stmt.execute();
		stmt.close();
		
		return "Cadastrado com sucesso.";
	}
}
