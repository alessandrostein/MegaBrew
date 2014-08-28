package br.com.magabrew.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.megabrew.dao.ClienteDAO;
import br.com.megabrew.model.Cliente;

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

	public void incluirCliente(
			@WebParam(name = "cliente", header = true) Cliente cliente)
			throws UsuarioNaoAutorizadoException {

		if (cliente.getLogin().equals("admin")
				&& cliente.getSenha().equals("admin")) {
			obterDAO().adicionarCliente(cliente);
		} else {
			throw new UsuarioNaoAutorizadoException("Nao autorizado");
		}

	}
}
