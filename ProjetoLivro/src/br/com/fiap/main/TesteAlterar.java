package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.LivroDAO;
import br.com.fiap.beans.Livro;

public class TesteAlterar {

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
		// Instânciar objetos
		
		Livro objLivro = new Livro();
		
		LivroDAO dao = new LivroDAO();
		
		objLivro.setCodigo(inteiro("Digite o código do livro a ser alterado: "));
		objLivro.setTitulo(texto("Título: "));
		objLivro.setAutor(texto("Autor: "));
		objLivro.setEditora(texto("Editora: "));
		objLivro.setValor(decimal("Valor: "));
		
		System.out.println(dao.alterar(objLivro));
		

	}

}
