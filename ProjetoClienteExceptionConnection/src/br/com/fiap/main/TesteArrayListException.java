package br.com.fiap.main;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Cliente;
import br.com.fiap.excecoes.Excecao;

public class TesteArrayListException {

	static String texto(String j) {
		return JOptionPane.showInputDialog(j);
	}

	static int inteiro(String j) {
		return Integer.parseInt(JOptionPane.showInputDialog(j));
	}

	static double real(String j) {
		return Double.parseDouble(JOptionPane.showInputDialog(j));
	}

	public static void main(String[] args) throws Excecao {
//  ---------------------------- Instânciar
		List<Cliente> listaClientes = new ArrayList<Cliente>();

		Cliente objCliente = null;

		do {
			try {
				objCliente = new Cliente();
				objCliente.setNome(texto("Nome: "));
				objCliente.setIdade(inteiro("Idade: "));
				objCliente.setAltura(real("Altura: "));

				listaClientes.add(objCliente);

			} catch (Exception e) {
				throw new Excecao(e);

			}
		} while (JOptionPane.showConfirmDialog(null, "Adicionar cliente?", "CADASTRO DE CLIENTES",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0);

//  ---------------------------- Saída (for)
		for (Cliente c : listaClientes) {
			System.out.println("Nome: " + c.getNome() +
							   "\nIdade: " + c.getIdade() +
							   "\nAltura: " + c.getAltura());
		}

	}
}
