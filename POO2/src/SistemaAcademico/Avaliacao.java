package SistemaAcademico;

public class Avaliacao {
	
	private String avaliacao;
	private Aluno aluno;
	private Professor professor;
	private Disciplina disciplina;
		
	public Avaliacao(String avaliacao, Aluno aluno, Professor professor, Disciplina disciplina) {
		this.aluno =aluno;
		this.avaliacao = avaliacao;
		this.professor = professor;
		this.disciplina = disciplina;
	}
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public void verAvaliacao() {
		System.out.println("O aluno "+aluno.getNome()+" teve a pontuação "+avaliacao+" na avaliação segundo o professor "+professor.getNome());
	}
	
}
