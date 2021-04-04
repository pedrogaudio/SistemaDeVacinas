package sistemadevacinas;

public class Paciente extends Pessoa {

	private String cartaoDeAgendamento;
	private int cartaoDoSus;

	public Paciente(String nome, int idade, int cpf, String eMail, String login, String senha, Endereco endereco,
			String cartaoDeAgendamento, int cartaoDoSus) {
		super(nome, idade, cpf, eMail, login, senha, endereco);
		this.cartaoDeAgendamento = cartaoDeAgendamento;
		this.cartaoDoSus = cartaoDoSus;
	}

	public String getCartaoDeAgendamento() {
		return cartaoDeAgendamento;
	}

	public void setCartaoDeAgendamento(String cartaoDeAgendamento) {
		this.cartaoDeAgendamento = cartaoDeAgendamento;
	}

	public int getCartaoDoSus() {
		return cartaoDoSus;
	}

	public void setCartaoDoSus(int cartaoDoSus) {
		this.cartaoDoSus = cartaoDoSus;
	}

}
