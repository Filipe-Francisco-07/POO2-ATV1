package SistemaAcademico;
import java.util.ArrayList;
import java.util.List;

public class Fase {
	private String nome;
	private List<Disciplina> disciplinas;
	private List<Disciplina> disciplinas_ofertadas;
	
	public Fase(String nome) {
		this.nome = nome;
		  this.disciplinas = new ArrayList<>();
		  this.disciplinas_ofertadas = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
	
	public void ofertarDisciplina(Disciplina disciplina,Curso curso) {
		curso.ofertarDisciplina(disciplina);
		disciplinas_ofertadas.add(disciplina);
	}
	
	public void verDisciplinasOfertadas() {
		System.out.println("Lista de disciplinas que já foram ofertadas na "+nome+": "); 
		
		for (Disciplina disciplina : disciplinas_ofertadas) {
            System.out.println(disciplina.getNome()); 
		}
	}
	
	
}
