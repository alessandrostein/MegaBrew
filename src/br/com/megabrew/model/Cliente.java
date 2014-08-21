package br.com.megabrew.model;

public class Cliente {

	private int id;	
	private String nome;
	private String telefone;
	private String login;
	private String senha;
	
	public Cliente() {
		super();
	}
	
	public Cliente(int id, String nome, String telefone, String login,
			String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.login = login;
		this.senha = senha;
	}	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
