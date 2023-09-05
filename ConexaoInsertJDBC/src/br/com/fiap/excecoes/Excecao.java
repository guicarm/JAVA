package br.com.fiap.excecoes;

public class Excecao extends Exception{
	
// ------ CONSTRUTOR VAZIO -------
	public Excecao() {
		super();
	}
	
// ------ CONSTRUTOR CHEIO -------
	public Excecao(Exception e) {
		super();
		if(e.getClass().toString().equals("class java.lang.NumberFormatException")){
			System.out.println("Digite um número inteiro.");
		}else {	
			System.out.println("Falha desconhecida.");
			
		}
		
		
	}
}
