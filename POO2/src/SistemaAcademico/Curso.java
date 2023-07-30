package SistemaAcademico;
import java.util.ArrayList;
import java.util.List;

public class Curso {
	private String nome;
	private List<Fase> fases;
	private List<Disciplina> disciplinas_ofertadas;
	
	public Curso(String nome) {
		this.nome = nome;
		this.fases = new ArrayList<>();
		this.disciplinas_ofertadas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Fase> getFases() {
		return fases;
	}

	public void setFases(Fase fase) {
		this.fases.add(fase);
	}
	
	public void ofertarDisciplina(Disciplina disciplina) {

		disciplinas_ofertadas.add(disciplina);
	}
	
	public void verDisciplinasOfertadas() {
		System.out.println("\nLista de disciplinas que já foram ofertadas no curso "+nome+": "); 
		
		for (Disciplina disciplina : disciplinas_ofertadas) {
            System.out.println(disciplina.getNome()); 
		}
	}

	@Override
	public String toString() {
		return "Curso [nome=" + nome + ", fases=" + fases + ", getNome()=" + getNome() + ", getFases()=" + getFases()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
}
