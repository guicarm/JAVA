package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ClienteDAO;
import br.com.fiap.beans.Cliente;

public class TesteCliente {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		// Instânciar
		ClienteDAO dao = new ClienteDAO();

		Cliente objCliente = new Cliente();
		
		objCliente.setCodigo(inteiro("Codigo: "));
		objCliente.setNome(texto("nome: "));
		objCliente.setEmail(texto("email: "));
		objCliente.setIdade(inteiro("idade: "));
		objCliente.setValorMensalidade(decimal("Valor de mensalidade: "));
		
		System.out.println(dao.inserir(objCliente));
	}

}