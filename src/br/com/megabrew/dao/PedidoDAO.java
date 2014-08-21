package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.megabrew.model.Pedido;

public class PedidoDAO {

	static List<Pedido> Pedidos = new ArrayList<Pedido>();
	
	static {
		
	}
	
	public List<Pedido> obterPedidos(){
		return Pedidos;
	}
	
	public Pedido obterPedidoID(int id){
		Pedido retorno = null;

		for (Pedido pedido : Pedidos) {
			if (pedido.getId() == id) {
				retorno = pedido;
			}
		}

		return retorno;
	}
	
	public void adicionarPedido(Pedido pedido){
		Pedidos.add(pedido);
	}
}
