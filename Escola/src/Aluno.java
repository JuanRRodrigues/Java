

public class Aluno {
	private String Nome;
	private int Idade;
	private String Curso;
	
	
	
	public Aluno (String Nome, int Idade, String Curso) {
		setNome(Nome);
		setIdade(Idade);
		setCurso(Curso);
		
	}
	

	public void setNome(String nome) {
		this.Nome = nome;
		
		
	}
	public String getNome() {
		return this.Nome;
		
	}
	public void setIdade(int Idade) {
		this.Idade = Idade;
			
	}
	public int getIdade() {
		return this.Idade;
		
	}
	public void setCurso(String Curso) {
		this.Curso = Curso;
	}
	
	public String getCurso() {
		return this.Curso;
	}
	
	public String DadosDoAluno() {
		return "Nome: "+ getNome() +
			 "\nIdade: "+ getIdade() +
			 "\nCurso " + getCurso();
			 
	
		 
		
	}
}
	
	
	
	
	
	
	
