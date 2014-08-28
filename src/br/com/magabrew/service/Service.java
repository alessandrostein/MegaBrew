package br.com.magabrew.service;

import javax.xml.ws.Endpoint;

public class Service {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8180/produtos", new ProdutosService());
		Endpoint.publish("http://localhost:8180/pedidos", new PedidosService());
		Endpoint.publish("http://localhost:8180/clientes", new ClientesService());
		System.out.print("Serviço inicializado!");
	}
}
