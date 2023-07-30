package SistemaAcademico;

public class Professor extends Pessoa {
	public Pessoa pessoa;
	
	public Professor(String cpf, String nome) {
		super(cpf,nome);
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
