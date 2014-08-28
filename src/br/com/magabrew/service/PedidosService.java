package br.com.magabrew.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.megabrew.dao.PedidoDAO;
import br.com.megabrew.model.Cliente;
import br.com.megabrew.model.Pedido;

@WebService
public class PedidosService {

	@WebResult(name = "pedidos")
	public List<Pedido> listarPedidos() {
		PedidoDAO pedidoDAO = new PedidoDAO();
		return pedidoDAO.obterPedidos();
	}

	private PedidoDAO obterDAOPedido() {
		return new PedidoDAO();
	}



	public void incluirPedido(@WebParam(name = "pedido") Pedido pedido,
			@WebParam(name = "cliente", header = true) Cliente cliente)
			throws UsuarioNaoAutorizadoException {

		if (cliente.getLogin().equals("admin")
				&& cliente.getSenha().equals("admin")) {
			obterDAOPedido().adicionarPedido(pedido);		

		} else {
			throw new UsuarioNaoAutorizadoException("Nao autorizado");
		}
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8180/pedidos", new PedidosService());
		System.out.print("Serviço inicializado!");
	}

}