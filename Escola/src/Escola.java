import java.util.ArrayList;

public class Escola {

	public static void main(String[] args) {
		
		
        Curso Curso =  new Curso();
		String Nome = Curso.getCurso();
		 
		Aluno nelson = new Aluno("Nelson", 23, "A", Nome);
		Aluno a2 = new Aluno("Cleidson", 19, "B");
		Aluno a3 = new Aluno("Roberta", 17, "A");
		Aluno a4 = new Aluno("Ricardo", 33 , "B");
		Aluno a5 = new Aluno("Juan", 25, "A");
		
		
		System.out.println("Bem Vindo a Universidade Null");
		System.out.println("\n(0) - Sair");
		System.out.println("\n(1) - Matricular Aluno");
		System.out.println("\n(2) - Cadastrar nota dos Alunos");
		System.out.println("\n(3) - Mostrar Boletim do Aluno");
		System.out.println("\n(4) - Mostrar Alunos de uma Turma");
		
	
		
		
	  
		
		
		
		System.out.println(nelson.getTurma());
		
		
		
	}
}
