package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProdutoLista {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}
	
	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}
	
	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) {
		
		List<Produto> listaProdutos = new ArrayList<Produto>();
		Produto objProduto;
		
		//Entrada de dados
		do {
		objProduto = new Produto();
		objProduto.setTipo(texto("Tipo do produto: "));
		objProduto.setMarca(texto("Marca do produto: "));
		objProduto.setQuantidade(inteiro("Quantidade de produtos: "));
		objProduto.setValor(real("Valor do produto: "));
		
		// Escolhemos entre ecerrar ou adicionar mais um produto no carrinho de compras
		} while (JOptionPane.showConfirmDialog(null, "Adicionar mais produtos?", "CARRINHO DE COMPRAS",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ==0);
		
		//Saída com for
		for(Produto produto: listaProdutos) {
			System.out.println("Tipo: " + produto.getTipo() + 
							   "\nMarca: " + produto.getMarca() +
							   "\nQuantidade: " + produto.getQuantidade() + 
							   "\nValor: " + produto.getValor());
		}
	}

}