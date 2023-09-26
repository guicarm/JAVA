package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.LivroDAO;
import br.com.fiap.beans.Livro;

public class TesteDeletarLivro {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		LivroDAO dao = new LivroDAO();
		
		Livro objLivro = new Livro();

		objLivro.setCodigo(inteiro("Digite o código do livro: "));
		
		System.out.println(dao.deletar(objLivro));
	}

}
