package br.com.fiap.excecoes;

public class Excecao extends Exception {

	public Excecao() {
		super();
		System.out.println("Mensagem de falha");
	}

	public Excecao(Exception e) {
		super();
		if (e.getClass().toString().equals("class java.lang.NumberFormatException")) {
			System.out.println("Você digitou letra ao invés de número.");
		} else {
			System.out.println("Falha desconhecida.");
		}

	}
}
