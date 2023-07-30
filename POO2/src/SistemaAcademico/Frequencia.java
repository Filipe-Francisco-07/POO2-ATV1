package SistemaAcademico;

public class Frequencia {
	private String freq;
	private Aluno aluno;
	private Professor professor;
	private Disciplina disciplina;
	
	public Frequencia(String freq, Aluno aluno, Professor professor,Disciplina disciplina) {
		this.aluno =aluno;
		this.freq = freq;
		this.professor = professor;
		this.disciplina = disciplina;
	}

	public String getFreq() {
		return freq;
	}
	public void setFreq(String freq) {
		this.freq = freq;
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
	public void setFrequencia(String freq, Aluno aluno, Professor professor){
		
	}	

	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public void verFrequencia() {
		System.out.println("O aluno "+aluno.getNome()+" teve a pontuação "+freq+" na avaliação segundo o professor "+professor.getNome());
	}
	
	
	
}
