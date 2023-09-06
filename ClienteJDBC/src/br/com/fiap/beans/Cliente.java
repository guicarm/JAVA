package br.com.fiap.beans;

public class Cliente {

	private int codigo;
	private String nome;
	private String email;
	private int idade;
	private double valorMensalidade;
	
//------------------------------------------------------------	
	public Cliente() {
		super();
	}

	public Cliente(int codigo, String nome, String email, int idade, double valorMensalidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.valorMensalidade = valorMensalidade;
}
//-------------------------------------------------------------
public int getCodigo() {
	return codigo;
}

public void setCodigo(int codigo) {
	this.codigo = codigo;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public double getValorMensalidade() {
	return valorMensalidade;
}

public void setValorMensalidade(double valorMensalidade) {
	this.valorMensalidade = valorMensalidade;
}
}
