package br.com.megabrew.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pedido {

	private int id;
	private Cliente cliente;
	private double valorTotal;
	
	@XmlElementWrapper(name = "itens")
	@XmlElement(name = "item")
	private ArrayList<PedidoItem> item;
	
	public Pedido() {
		super();
	}

	public Pedido(int id, Cliente cliente, double valorTotal,
			ArrayList<PedidoItem> item) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public ArrayList<PedidoItem> getItem() {
		return item;
	}

	public void setItem(ArrayList<PedidoItem> item) {
		this.item = item;
	}
		
}
