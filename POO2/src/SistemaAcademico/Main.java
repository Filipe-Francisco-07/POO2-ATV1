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
		
		DisciplinaOfertada  POO1_Oferta = new DisciplinaOfertada(POO1.getNome());
		
		//6- os alunos 1 e 2 sao matriculados em disciplinas de diferentes fases.
		
		POO1_Oferta.setAluno(aluno1);
		POO1_Oferta.setAluno(aluno2);
		POO1_Oferta.setAluno(aluno3);
		
		POO1_Oferta.setProfessor(professor2);
		POO1_Oferta.setProfessor(professor1);
		
		fase2.ofertarDisciplina(POO1,bcc);
		
		DisciplinaOfertada  DW1_Oferta = new DisciplinaOfertada(DW1.getNome());
		
		DW1_Oferta.setAluno(aluno1);
		DW1_Oferta.setAluno(aluno2);
		DW1_Oferta.setProfessor(professor1);
		
		fase1.ofertarDisciplina(DW1,bcc);
		
		//1- ver qual curso o aluno está cursando:
		
		System.out.println("O aluno "+aluno1.getNome()+" está cursando "+aluno1.getCurso().getNome()+".\n");
		
		//2- ver as disciplinas de uma fase:
		
		System.out.println("Lista de disciplinas da "+fase2.getNome()+": ");
		
		List<Disciplina> disciplinas_fase1 = fase2.getDisciplinas();
	
		for (Disciplina disciplina : disciplinas_fase1) {
            System.out.println(disciplina.getNome()); 
		}	
		
		//3- ver quais professores lessionam determinada matéria:
		System.out.println("\nLista de professores que lessionam a matéria: "+POO1_Oferta.getNome());
		
		List<Professor> lista_pro = POO1_Oferta.getProfessores();		
		for (Professor professor : lista_pro) {
	            System.out.println(professor.getNome()); 
	    }				
		System.out.println("");
		
		//4- qual professor colocou a frequencia/avaliacao
		
		Avaliacao aval1 = new Avaliacao("9.5",aluno3, professor1, DW1);
		Frequencia freq1 = new Frequencia("80%",aluno3, professor1, DW1);
		
		POO1_Oferta.setAvaliacoes(aval1);
		POO1_Oferta.setFrequencias(freq1);
		
		// ver freq / aval
		List<Avaliacao> lista_aval = POO1_Oferta.getAvaliacoes();
		
		for(Avaliacao avaliacao : lista_aval) {
			System.out.println("O aluno "+avaliacao.getAluno().getNome()+" teve a pontuação "+avaliacao.getAvaliacao()+" na avaliacao do professor "+avaliacao.getProfessor().getNome()); 
		}
		
		List<Frequencia> lista_freq = POO1_Oferta.getFrequencias();
		
		for(Frequencia frequencia : lista_freq) {
			System.out.println("O aluno "+frequencia.getAluno().getNome()+" teve a frequencia "+frequencia.getFreq()+" com o professor "+frequencia.getProfessor().getNome()); 
		}
		
		
		//5- ver quais disciplinas foram ofertadas no curso:
		
		bcc.verDisciplinasOfertadas();
		
	}

}
