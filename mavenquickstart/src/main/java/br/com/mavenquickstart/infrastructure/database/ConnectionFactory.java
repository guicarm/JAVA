package br.com.mavenquickstart.infrastructure.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import oracle.jdbc.driver.OracleDriver;

public class ConnectionFactory {
	
	public Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL", "RM98874", "170505");
	}
}
