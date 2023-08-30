package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Produto;

public class TesteProdutoVetor {

	
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
		
// ------------ CRIAR VETOR DOS PRODUTOS -----------------------------------------------
		Produto[] vetorProduto = new Produto[5];   // <-------- quantia de índices máximos do vetor

// -------- CRIAR VARIÁVEL PRA CONTAR OS ÍNDICES ---------------------------------------
		int indice = 0;
		
// ----------- DOWHILE PRA ISTANCIAR OBJETOS -------------------------------------------
	do {
		vetorProduto[indice] = new Produto();
		vetorProduto[indice].setTipo(texto("Tipo de produto: "));
		vetorProduto[indice].setMarca(texto("Marca do produto: "));
		vetorProduto[indice].setQuantidade(inteiro("Quantidade de produtos: "));
		vetorProduto[indice].setValor(real("Valor do produto: "));
		
		indice++;
		
// --------- Enquanto o usuário digitar "SIM", serão adicionados mais produtos ----------
	} while (JOptionPane.showConfirmDialog(null, "Adicionar produtos?", "PRODUTOS",
			JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);
	
// ---------------- SAÍDA DE DADOS COM O FOR --------------------------------------------
	for(int cont = 0; cont < indice; cont ++) {
		System.out.println("============ PRODUTO " + (cont + 1) + " ============" +
						"\nTIPO: " + vetorProduto[cont].getTipo() + 
						"\nMARCA: " + vetorProduto[cont].getMarca() + 
						"\nQUANTIDADE: " + vetorProduto[cont].getQuantidade() + 
						"\nVALOR: " + vetorProduto[cont].getValor());
		
		}
	}
}
