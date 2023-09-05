package br.com.fiap.beans;

public class Produto {
	
	private int codigo;
	private String tipo;
	private String marca;
	private double valorVenda;
	private double valorCompra;
	
//------------------------------------------------------------	
	public Produto() {
		super();
	}

	public Produto(int codigo, String tipo, String marca, double valorVenda, double valorCompra) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.marca = marca;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}

//-----------------------------------------------------------
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
}
