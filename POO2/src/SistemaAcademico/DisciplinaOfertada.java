package SistemaAcademico;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaOfertada extends Disciplina {
	private String nome;
	private List<Professor> professores;
	private List<Aluno> alunos;
	
	public DisciplinaOfertada(String nome) {
		super(nome);
		this.nome = nome;
	    this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();	
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	 public void setProfessor(Professor professor) {
	    	if(professores.size() <= 4) {
	    		this.professores.add(professor);
	    	}else {
	    		System.out.println("O limite máximo de professores lessionando esta matéria foi atingido.");
	    		return;
	    	}

	    }

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(Aluno aluno) {
		this.alunos.add(aluno);
	}
	
}
