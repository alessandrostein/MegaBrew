package br.com.magabrew.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.megabrew.dao.PedidoDAO;
import br.com.megabrew.model.Pedido;

@WebService
public class PedidosService {

	@WebResult(name = "produtos")
	public List<Pedido> listarProdutos() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		return pedidoDAO.obterPedidos();
	}

	private PedidoDAO obterDAO() {
		return new PedidoDAO();
	}

	public void incluirPedido(@WebParam(name = "pedido") Pedido pedido) {
		obterDAO().adicionarPedido(pedido);
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8180/pedidos", new PedidosService());
		System.out.print("Serviço inicializado!");
	}

}