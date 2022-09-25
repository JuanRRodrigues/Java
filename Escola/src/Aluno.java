

public class Aluno {
	private String Nome;
	private int Idade;
	private String Turma;
	
	public Aluno (String Nome, int Idade, String Turma, String Curso) {
		setNome(Nome);
		setIdade(Idade);
		setTurma(Turma);
		setTurma(Curso);
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
	public void setTurma(String Turma) {
		this.Turma = Turma;
	}
	
	public String getTurma() {
		return this.Turma;
	}
	
	public String DadosDoAluno() {
		return "Nome: "+ getNome() +
			 "\nIdade: "+ getIdade() +
			 "\nTurma " + getTurma();
		
		
	}
}
	
	
	
	
	
	
	
