package br.com.megabrew.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.megabrew.model.Produto;

public class ProdutoDAO {

	static List<Produto> Produtos = new ArrayList<Produto>();

	static {
		Produto cerveja1 = new Produto(1, "Cerveja Stannis",
				"Cerveja feito artesanalmente com toque Irlandês", "litro",
				"dm3", 50, 7.00);

		Produto cerveja2 = new Produto(2, "Cerveja Heineken",
				"Heineken International é uma cervejaria holandesa, fundada em 1863 por Wandscheer Heineken na cidade de Amsterdã.",
				"litro", "dm3", 48, 7.00);

		Produto cerveja3 = new Produto(3, "Cerveja Stella Artois",
				"A Stella Artois é uma cerveja pilsner lager (de baixa fermentação) "
						+ "premium, que tem suas origens em uma tradicional cervejaria chamada "
						+ "Den Hoorn, que data em 1366, uma das mais antigas do mundo.",
				"litro", "dm3", 26, 7.00);

		Produto cerveja4 = new Produto(4, "Cerveja Karavelle", 
				"Cervejas e chopes super premium, puro malte, que utilizam "
				+ "matérias-primas extremamente selecionadas.", "litro", "dm3", 11, 7.00 );

		Produtos.add(cerveja1);
		Produtos.add(cerveja2);
		Produtos.add(cerveja3);
		Produtos.add(cerveja4);

	}

	public List<Produto> obterProdutos() {
		return Produtos;
	}

	public void adicionarProduto(Produto produto) {
		Produtos.add(produto);
	}

	public Produto obterProdutoID(int id) {

		Produto retorno = null;

		for (Produto produto : Produtos) {
			if (produto.getId() == id) {
				retorno = produto;
			}
		}

		return retorno;
	}
	
	public void descontarEstoque(int produtoID, int quantidade){
		for (Produto produto : Produtos) {
			if (produto.getId() == produtoID) {
				produto.setQuantidade(produto.getQuantidade() - quantidade);
			}
		}				
	}

}
