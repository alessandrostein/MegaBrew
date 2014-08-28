package br.com.magabrew.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.com.megabrew.dao.ProdutoDAO;
import br.com.megabrew.model.Cliente;
import br.com.megabrew.model.Produto;

@WebService
public class ProdutosService {

	@WebResult(name = "produtos")
	public List<Produto> listarProdutos() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		return produtoDAO.obterProdutos();
	}

	private ProdutoDAO obterDAO() {
		return new ProdutoDAO();
	}

	public void incluirProduto(@WebParam(name = "produto") Produto produto,
			@WebParam(name = "cliente", header = true) Cliente cliente)
			throws UsuarioNaoAutorizadoException {		
		
		if (cliente.getLogin().equals("admin") && cliente.getSenha().equals("admin")){
			obterDAO().adicionarProduto(produto);
		} else {
			throw new UsuarioNaoAutorizadoException("Nao autorizado");
		}				
	}


}
