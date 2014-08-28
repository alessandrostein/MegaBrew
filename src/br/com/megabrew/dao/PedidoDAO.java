package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.megabrew.model.Pedido;
import br.com.megabrew.model.PedidoItem;

public class PedidoDAO {

	static List<Pedido> Pedidos = new ArrayList<Pedido>();
	
	static {
		
		// Criar itens
		PedidoItem item1 = new PedidoItem(1, 1, 5, 5.0, (5 * 5.0));
		PedidoItem item2 = new PedidoItem(2, 2, 4, 4.0, (4 * 4.0));
		PedidoItem item3 = new PedidoItem(3, 3, 3, 3.0, (3 * 3.0));
		PedidoItem item4 = new PedidoItem(4, 4, 2, 2.0, (2 * 2.0));
					
		// Criar Array para os pedidos		
		List<PedidoItem> arrayItem1 = new ArrayList<PedidoItem>();
		arrayItem1.add(item4);
		arrayItem1.add(item2);
		
		List<PedidoItem> arrayItem2 = new ArrayList<PedidoItem>();
		arrayItem2.add(item3);
		arrayItem2.add(item1);
		
		List<PedidoItem> arrayItem3 = new ArrayList<PedidoItem>();
		arrayItem3.add(item2);
		arrayItem3.add(item3);
		
		List<PedidoItem> arrayItem4 = new ArrayList<PedidoItem>();
		arrayItem4.add(item1);
		arrayItem4.add(item4);
		
		// Cria pedido 
		Pedido ped1 = new Pedido(1, 1, 25.0, arrayItem1);
		Pedido ped2 = new Pedido(2, 5, 25.0, arrayItem2);
		Pedido ped3 = new Pedido(3, 3, 25.0, arrayItem3);
		Pedido ped4 = new Pedido(4, 2, 25.0, arrayItem4);
		
		// Armazema mockus
		Pedidos.add(ped1);
		Pedidos.add(ped2);
		Pedidos.add(ped3);
		Pedidos.add(ped4);
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
