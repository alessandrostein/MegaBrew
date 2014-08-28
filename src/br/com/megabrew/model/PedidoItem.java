package br.com.megabrew.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class PedidoItem {
	
	private int id;
	private int produtoID;
	private int quantidade;
	private double valorUnitario;
	private double valorTotal;
	
	public PedidoItem() {
		super();
	}

	public PedidoItem(int id, int produtoID,
			int quantidade, double valorUnitario, double valorTotal) {
		super();
		this.id = id;
		this.produtoID = produtoID;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.valorTotal = valorTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	

	public int getProdutoID() {
		return produtoID;
	}

	public void setProduto(int produtoID) {
		this.produtoID = produtoID;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
}
