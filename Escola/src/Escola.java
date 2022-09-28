import java.util.Scanner;

//import java.util.ArrayList;


public class Escola {
	
	
	public static void main(String[] args) {
		
		    // Rotina
			System.out.println("Bem Vindo a Universidade Null");
			System.out.println("\n(0) - Sair");
			System.out.println("\n(1) - Matricular Aluno");
			System.out.println("\n(2) - Cadastrar nota dos Alunos");
			System.out.println("\n(3) - Mostrar Boletim do Aluno");
			System.out.println("\n(4) - Mostrar Alunos de uma Turma");
			
			// Curso e Professor
			Curso Curso =  new Curso();
			Disciplina Disciplina =  new Disciplina();
			Disciplina.setNomeDisciplina("SOPA");
			String Notad = Disciplina.getNomeDisciplina();
			String NomeDoCurso = Curso.getCurso();
			
			Aluno aluno1 = new Aluno(null, 0, null);
			Aluno aluno2 = new Aluno(null, 0, null);
			Aluno aluno3 = new Aluno(null, 0, null);
			Aluno aluno4 = new Aluno(null, 0, null);
			Aluno aluno5 = new Aluno(null, 0, null);
			
			Prof nomeProf1 = new Prof("Leo", 58, Notad);
			
			Boletim notaAluno1 = new Boletim( 0);
			Boletim notaAluno2 = new Boletim( 0);
			Boletim notaAluno3 = new Boletim( 0);
			Boletim notaAluno4 = new Boletim( 0);
			Boletim notaAluno5 = new Boletim( 0);
			
			Turma Turma = new Turma();
			int op;
			    
					do {
						@SuppressWarnings("resource")		
						Scanner scan = new Scanner(System.in); 
						
						int num = scan.nextInt();
						switch (num){
						case 1:
							System.out.println("Alunos Matriculados com sucesso");
							
							 aluno1 = new Aluno("Nelson", 23,  NomeDoCurso);
							 aluno2 = new Aluno("Cleidson", 19, NomeDoCurso);
							 aluno3 = new Aluno("Roberta", 17, NomeDoCurso);
							 aluno4 = new Aluno("Ricardo", 33 , NomeDoCurso);
							 aluno5 = new Aluno("Juan", 25, NomeDoCurso);	
							
							Turma.MatricularAluno(aluno1);
							Turma.MatricularAluno(aluno2);
							Turma.MatricularAluno(aluno3);
							Turma.MatricularAluno(aluno4);
							Turma.MatricularAluno(aluno5);
							break;
						case 2: 
							
							if(aluno1.getNome() == null) {
								System.out.println("Sem Alunos Matriculados");
								break;
							}else {
								System.out.println("Notas atualizadas com sucesso");
								notaAluno1 = new Boletim( 5);
								notaAluno2 = new Boletim( 4);
								notaAluno3 = new Boletim( 6);
								notaAluno4 = new Boletim( 4);
								notaAluno5 = new Boletim( 9);
							}
							
							
							break;
						case 3: 
							if(aluno1.getNome() == null) {
								System.out.println("Sem Alunos Matriculados");
								break;
							}else {
								System.out.println(aluno1.getNome()+" Nota: "+ notaAluno1.getNota1());
								System.out.println(aluno2.getNome()+" Nota: "+ notaAluno2.getNota1());
								System.out.println(aluno3.getNome()+" Nota: "+ notaAluno3.getNota1());
								System.out.println(aluno4.getNome()+" Nota: "+ notaAluno4.getNota1());
								System.out.println(aluno5.getNome()+" Nota: "+ notaAluno5.getNota1());
							}
							
							break;
						case 4:		
							if(Turma == null) {
								System.out.println("Sem Alunos Matriculados");
							}else {
								System.out.println(" Professor: "+nomeProf1.getNome());
								Turma.ListarAlunos();
							}
							
							break;
							
							
						}
						
                          
						op = num;
						
					}while(op != 0);
					
					
					
				
					
			
		}
		
		
		
		
		}
		
		// Alunos possiveis para Matricula
		
		
		
	
	
		
	
	  
		
		
		
	//	System.out.println(nelson.getTurma());
		
		
		
	

