package SistemaAcademico;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Curso bcc = new Curso("Bacharelado em Ciência da Computação");
		
		Fase fase1  = new Fase("Fase 1");
		Fase fase2  = new Fase("Fase 2");
		Fase fase3  = new Fase("Fase 3");
		Fase fase4  = new Fase("Fase 4");
		
		Disciplina POO1 = new Disciplina("Programação Orientada a Objetos I");
		Disciplina DW1 = new Disciplina("Desenvolvimento Web I");
		Disciplina POO2 = new Disciplina("Programação Orientada a Objetos II");
		Disciplina ED1 = new Disciplina("Estrutura de Dados I");
		
		Pessoa pessoa1 = new Pessoa("231.213.123-23","Bárbara");
		Pessoa pessoa2 = new Pessoa("874.275.632-72","Curvas");
		Pessoa pessoa3 = new Pessoa("783.238.174-64","Filipe");
		Pessoa pessoa4 = new Pessoa("353.734.156-37","Duda");
		Pessoa pessoa5 = new Pessoa("456.114.723-84","Robson");
		
		Professor professor1 =  new Professor(pessoa1.getCpf(), pessoa1.getNome());
		Professor professor2 =  new Professor(pessoa2.getCpf(), pessoa2.getNome());
		
		Aluno aluno1 = new Aluno(pessoa3.getCpf(),pessoa3.getNome(),12312541);
		Aluno aluno2 = new Aluno(pessoa4.getCpf(),pessoa4.getNome(),53123441);
		Aluno aluno3 = new Aluno(pessoa5.getCpf(),pessoa5.getNome(),63452344);
		
		fase1.setDisciplinas(DW1);
		fase2.setDisciplinas(POO1);
		fase3.setDisciplinas(ED1);
		fase4.setDisciplinas(POO2);
		
		bcc.setFases(fase1);
		bcc.setFases(fase2);
		bcc.setFases(fase3);
		bcc.setFases(fase4);
		
		aluno1.setCurso(bcc);
		aluno2.setCurso(bcc);
		aluno3.setCurso(bcc);
		
		POO1.setAluno(aluno1);
		POO1.setAluno(aluno2);
		POO1.setAluno(aluno3);
		
		POO1.setProfessor(professor1);
		POO1.setProfessor(professor2);
		
		fase2.ofertarDisciplina(POO1,bcc);
		
		DW1.setAluno(aluno1);
		DW1.setAluno(aluno2);
		DW1.setProfessor(professor2);
		
		fase1.ofertarDisciplina(DW1,bcc);
		
		//ver qual curso o aluno está cursando:
		
		System.out.println("O aluno "+aluno1.getNome()+" está cursando "+aluno1.getCurso().getNome()+".\n");
		
		//ver as disciplinas de uma fase:
		
		System.out.println("Lista de disciplinas da "+fase2.getNome()+": ");
		
		List<Disciplina> disciplinas_fase1 = fase2.getDisciplinas();
	
		for (Disciplina disciplina : disciplinas_fase1) {
            System.out.println(disciplina.getNome()); 
		}	
		
		//ver quais professores lessionam determinada matéria:
		System.out.println("\nLista de professores que lessionam a matéria: "+POO1.getNome());
		
		List<Professor> lista_pro = POO1.getProfessores();		
		for (Professor professor : lista_pro) {
	            System.out.println(professor.getNome()); 
	    }							
		
		//ver quais disciplinas foram ofertadas no curso:
		
		bcc.verDisciplinasOfertadas();
		
	}

}
