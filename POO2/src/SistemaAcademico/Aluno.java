package SistemaAcademico;

public class Aluno extends Pessoa {
	private Pessoa pessoa;
	private int matricula;
	private Curso curso;
	
	public Aluno(String cpf, String nome,int matricula) {
		super(cpf, nome);
		this.matricula = matricula;
	}
	
	public Curso getCurso() {
		if(curso != null) {
			return curso;
		}else {
			return null;
		}
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public void fazerMatricula(Curso curso) {
		this.curso = curso;
	}
	
	
}
