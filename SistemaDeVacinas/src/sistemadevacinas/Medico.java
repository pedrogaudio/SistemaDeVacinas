package sistemadevacinas;

public class Medico extends Pessoa {

	private int CRM;
	private String especilidade;
	private boolean residente;
        
        public Medico()
        {}
        

	public Medico(String nome, int idade, int cpf, String eMail, String login, String senha, Endereco endereco, int CRM, String esp, boolean res) {
		super(nome, idade, cpf, eMail, login, senha, endereco);
		this.CRM = CRM;
		this.residente = res;
		this.especilidade = esp;
	}

	public int getCRM() {
		return CRM;
	}

	public void setCRM(int cRM) {
		CRM = cRM;
	}

	public String getEspecilidade() {
		return especilidade;
	}

	public void setEspecilidade(String especilidade) {
		this.especilidade = especilidade;
	}

	public boolean isResidente() {
		return residente;
	}

	public void setResidente(boolean residente) {
		this.residente = residente;
	}

}
