package br.com.magabrew.service;

import javax.xml.ws.WebFault;

@WebFault(
		targetNamespace = "http://service.acervo.catolicasc.org.br/excecoes/",
		name = "UsuarioNaoAutorizado")
public class UsuarioNaoAutorizadoException extends Exception{

	public UsuarioNaoAutorizadoException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioNaoAutorizadoException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UsuarioNaoAutorizadoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UsuarioNaoAutorizadoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UsuarioNaoAutorizadoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

}
