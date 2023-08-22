package br.com.fiap.conexoes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	
// ------------------- Método de conexão
	public Connection conexao() throws ClassNotFoundException, SQLException {
	// DRIVER
	Class.forName("oracle.jdbc.driver.OracleDriver");

	
	return DriverManager.getConnection("jtdc:oracle:thin:@oracle.fiap.com.br:1521:orcl",
		   "rm98874", "170505");
	}
}
