package SistemaAcademico;

public class Fase {
	private int n_fase;
	private Curso curso;
	
	public Fase(int n_fase, Curso curso) {
		this.n_fase = n_fase;
	}

	public int getN_fase() {
		return n_fase;
	}

	public void setN_fase(int n_fase) {
		this.n_fase = n_fase;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
