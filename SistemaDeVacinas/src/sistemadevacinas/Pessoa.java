package sistemadevacinas;

public class Pessoa {

	private String nome;
	private int idade;
	private int cpf;
	private String eMail;
	private String login;
	private String senha;
	Endereco endereco;
	
	public Pessoa()
	{
		
	}
	
	public Pessoa(String nome, int idade, int cpf, String eMail, String login, String senha, Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.eMail = eMail;
		this.login = login;
		this.senha = senha;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
