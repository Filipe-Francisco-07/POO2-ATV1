package SistemaAcademico;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaOfertada extends Disciplina {
	private String nome;
	private List<Professor> professores;
	private List<Aluno> alunos;
	private List<Frequencia>frequencias;
	private List<Avaliacao> avaliacoes;
	
	public DisciplinaOfertada(String nome) {
		super(nome);
		this.nome = nome;
	    this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();	
        this.avaliacoes = new ArrayList<>();	
        this.frequencias = new ArrayList<>();	
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

	public void setFrequencias(Frequencia frequencia) {
		this.frequencias.add(frequencia);
	}
	
	public void setAvaliacoes(Avaliacao avaliacao) {
		this.avaliacoes.add(avaliacao);
	}

	public List<Frequencia> getFrequencias() {
		return frequencias;
	}

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}	
	
}
