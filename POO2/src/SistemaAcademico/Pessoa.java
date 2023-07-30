package SistemaAcademico;

public class Pessoa {
	protected String cpf;
	protected String nome;
	
	public Pessoa(String cpf, String nome) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
