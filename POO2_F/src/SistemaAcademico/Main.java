package SistemaAcademico;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Curso bcc = new Curso("Bacharelado em Ciência da Computação.");		
		Fase fase = new Fase(8,bcc);
		
		Disciplina POO2 = new Disciplina("Programação Orientada a Objetos II");
		Disciplina MN = new Disciplina("Métodos Numéricos");
		Disciplina DB2 = new Disciplina("Banco de Dados II");
		Disciplina DS2 = new Disciplina("Estrutura de Dados II");
		Disciplina ES2 = new Disciplina("Engenharia de Software II");
		Disciplina C = new Disciplina("Compiladores");
		
	}

}
