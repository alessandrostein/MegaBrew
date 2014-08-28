package br.com.magabrew.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.megabrew.dao.ClienteDAO;
import br.com.megabrew.model.Cliente;
import br.com.megabrew.model.Pedido;

@WebService
public class ClientesService {

	@WebResult(name = "clientes")
	public List<Cliente> listarClientes() {
		ClienteDAO clienteDAO = new ClienteDAO();
		return clienteDAO.obterClientes();
	}

	private ClienteDAO obterDAO() {
		return new ClienteDAO();
	}

	public void incluirCliente(@WebParam(name = "cliente") Cliente cliente,
			@WebParam(name = "cliente", header = true) Cliente aut)
			throws UsuarioNaoAutorizadoException {

		if (obterDAO().autenticarCliente(aut)) {
			obterDAO().adicionarCliente(cliente);
		} else {
			throw new UsuarioNaoAutorizadoException("Nao autorizado");
		}

	}

}
