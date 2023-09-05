package br.com.fiap.main;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import br.com.fiap.DAO.ProdutoDAO;
import br.com.fiap.beans.Produto;

public class TesteCadastro {

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
		ProdutoDAO dao = new ProdutoDAO();

		Produto objProduto = new Produto();
		
		objProduto.setCodigo(inteiro("Codigo: "));
		objProduto.setTipo(texto("Tipo: "));
		objProduto.setMarca(texto("Marca: "));
		objProduto.setValorVenda(decimal("Valor de venda: "));
		objProduto.setValorCompra(decimal("Valor de compra: "));
		
		System.out.println(dao.inserir(objProduto));
	}

}
