package br.com.megabrew.model;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Pedido {

	private int id;
	private int clienteID;
	private double valorTotal;
	
	@XmlElementWrapper(name = "itens")
	@XmlElement(name = "item")
	private List<PedidoItem> item;
	
	@XmlJavaTypeAdapter(AdaptadorDate.class)	
	private Date dataDeCriacao = new Date();	
	
	public Pedido() {
		super();
	}

	public Pedido(int id, int clienteID, double valorTotal,
			List<PedidoItem> item) {
		super();
		this.id = id;
		this.clienteID = clienteID;
		this.valorTotal = valorTotal;
		this.item = item;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClienteID() {
		return clienteID;
	}

	public void setClienteID(int clienteID) {
		this.clienteID = clienteID;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<PedidoItem> getItem() {
		return item;
	}

	public void setItem(List<PedidoItem> item) {
		this.item = item;
	}
	
	public Date getDataDeCriacao() {
		return dataDeCriacao;
	}

	public void setDataDeCriacao(Date dataDeCriacao) {
		this.dataDeCriacao = dataDeCriacao;
	}

}
