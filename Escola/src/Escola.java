//import java.util.ArrayList;

public class Escola {

	public static void main(String[] args) {
		
		
        Curso Curso =  new Curso();
		String Nome = Curso.getCurso();
		 
		Aluno aluno1 = new Aluno("Nelson", 23, "A", Nome);
		Aluno aluno2 = new Aluno("Cleidson", 19, "B", Nome);
		Aluno aluno3 = new Aluno("Roberta", 17, "A", Nome);
		Aluno aluno4 = new Aluno("Ricardo", 33 , "B", Nome);
		Aluno aluno5 = new Aluno("Juan", 25, "A", Nome);
		
		Turma Turma = new Turma();
		
		Turma.MatricularAluno(aluno1);
		Turma.MatricularAluno(aluno2);
		Turma.MatricularAluno(aluno3);
		Turma.MatricularAluno(aluno4);
		Turma.MatricularAluno(aluno5);
		
		Turma.ListarAlunos();
		
		
		
	//	System.out.println("Bem Vindo a Universidade Null");
	//	System.out.println("\n(0) - Sair");
	//	System.out.println("\n(1) - Matricular Aluno");
	//	System.out.println("\n(2) - Cadastrar nota dos Alunos");
	//	System.out.println("\n(3) - Mostrar Boletim do Aluno");
	//	System.out.println("\n(4) - Mostrar Alunos de uma Turma");
		
	
		
		
	  
		
		
		
	//	System.out.println(nelson.getTurma());
		
		
		
	}
}
