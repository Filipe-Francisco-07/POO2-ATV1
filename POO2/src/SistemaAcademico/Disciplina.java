package SistemaAcademico;
import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Professor> professores;
    private List<Aluno> alunos;
    
    public Disciplina(String nome) {
        this.nome = nome;
        this.professores = new ArrayList<>();
        this.alunos = new ArrayList<>();
    }
        
    public List<Aluno> getAlunos() {
        return alunos;
    }
    
    public void setAluno(Aluno aluno) {
        this.alunos.add(aluno);
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
}