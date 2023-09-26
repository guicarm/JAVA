package br.com.fiap.main;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.fiap.DAO.LivroDAO;
import br.com.fiap.beans.Livro;

public class TesteSelecionar {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Instânciar
		
		LivroDAO dao = new LivroDAO();

		ArrayList<Livro> listaLivros = (ArrayList<Livro>) dao.selecionar();
		
		if(listaLivros != null) {
			for(Livro livro : listaLivros) {
				System.out.println(livro.getCodigo() + "\n" +
								   livro.getTitulo() + "\n" +
								   livro.getAutor() + "\n" +
								   livro.getEditora() + "\n" +
								   livro.getValor());
			}
		}
	}

}
