
public class Disciplina {
	
	private String NomeDisciplina;
	private int Semestre;
	private int Nota;
	
	
	public Disciplina () {
		setNomeDisciplina(NomeDisciplina);
		setSemestre( Semestre);
		setNota(Nota);
		
	}
	public void setNomeDisciplina(String Nomed) {
		this.NomeDisciplina = Nomed;
		
		
	}
	public String getNomeDisciplina() {
		return this.NomeDisciplina;
		
	}
	public void setSemestre(int Semestred) {
		this.Semestre = Semestred;
			
	}
	public int getSemestre() {
		return this.Semestre;
		
	}
	public void setNota(int Notad) {
		this.Nota = Notad;
	}
	
	public int getNota() {
		return this.Nota;
	}
   
}