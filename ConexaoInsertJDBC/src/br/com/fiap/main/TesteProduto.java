package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;
import br.com.fiap.excecoes.Excecao;

public class TesteProduto{

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double decimal(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}
	
// ====================================================================
	public static void main(String[] args) throws Exception{
		// Instânciar 
		Produto objProduto = new Produto();
		
		// try catch
		try {
			objProduto.setCodigo(inteiro("Codigo"));
		} catch (Exception e) {
			throw new Excecao(e);
		} finally {
			
		}
		
		
		// saída de dados
		System.out.println("Código: " + objProduto.getCodigo());

	}

}
