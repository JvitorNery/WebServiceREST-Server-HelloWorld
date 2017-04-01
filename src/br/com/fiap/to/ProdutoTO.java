package br.com.fiap.to;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement //para converter objeto para json e vice e versa
public class ProdutoTO {
	
	private int codigo;
	
	String nome;
	
	private double preco;
	
	private int quantidade;
	
	public ProdutoTO(){
		super();
	}

	public ProdutoTO(int codigo, String nome, double preco, int quantidade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
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

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	
	
}
