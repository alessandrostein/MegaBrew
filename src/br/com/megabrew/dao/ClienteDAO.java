package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.megabrew.model.Cliente;

public class ClienteDAO {

	static List<Cliente> Clientes = new ArrayList<Cliente>();

	static {
		Cliente cliente1 = new Cliente(1, "LEONARDO VITAZIK NETO",
				"47 3370-0000", "leonardo", "leonardo");
		Cliente cliente2 = new Cliente(2, "CLEITON DOS SANTOS GARCIA",
				"47 3370-0000", "clieiton", "clieiton");
		Cliente cliente3 = new Cliente(3, "MANFRED HEIL JUNIOR",
				"47 3370-0000", "manfred", "manfred");
		Cliente cliente4 = new Cliente(4, "FABIO TAVARES DIPPOLD ",
				"47 3370-0000", "fabio", "fabio");
		Cliente cliente5 = new Cliente(5, "ANDRE VINICIUS CASTOLDI",
				"47 3370-0000", "andre", "andre");

		Clientes.add(cliente1);
		Clientes.add(cliente2);
		Clientes.add(cliente3);
		Clientes.add(cliente4);
		Clientes.add(cliente5);

	}
	
	public List<Cliente> obterClientes(){			
		return Clientes;
	}
	
	public void adicinarCliente(Cliente cliente){
		Clientes.add(cliente);
	}

}
