package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.megabrew.model.Pedido;
import br.com.megabrew.model.PedidoItem;

public class PedidoItemDAO {
	
	static List<PedidoItem> PedidoItems = new ArrayList<PedidoItem>();
	
	static {
		
	}
	
	public PedidoItem obterItemsPedido(Pedido pedido){
		PedidoItem retorno = null;

		for (PedidoItem item : PedidoItems) {
			if (item.getId() == pedido.getId()) {
				retorno = item;
			}
		}

		return retorno;
		
	}
	
	public void adicionarItem(PedidoItem item){
		PedidoItems.add(item);
	}

}
