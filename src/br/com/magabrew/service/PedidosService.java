package br.com.magabrew.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import br.com.megabrew.dao.ClienteDAO;
import br.com.megabrew.dao.PedidoDAO;
import br.com.megabrew.dao.ProdutoDAO;
import br.com.megabrew.model.Cliente;
import br.com.megabrew.model.Pedido;
import br.com.megabrew.model.PedidoItem;

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

	private ProdutoDAO obterDAOProduto() {
		return new ProdutoDAO();
	}

	private ClienteDAO obterDAOCliente() {
		return new ClienteDAO();
	}

	public void incluirPedido(@WebParam(name = "pedido") Pedido pedido,
			@WebParam(name = "cliente", header = true) Cliente aut)
			throws UsuarioNaoAutorizadoException {

		if (obterDAOCliente().autenticarCliente(aut)) {

			for (PedidoItem item : pedido.getItem()) {
				obterDAOProduto().descontarEstoque(item.getId(),
						item.getQuantidade());
			}

			obterDAOPedido().adicionarPedido(pedido);

		} else {
			throw new UsuarioNaoAutorizadoException("Nao autorizado");
		}
	}

}