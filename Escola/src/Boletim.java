
public class Boletim {
	
	private int Nota1;
	
	
	
	public Boletim (int Nota1) {
		setNota1(Nota1);
		
		
	}
	public void setNota1(int notaUm) {
		this.Nota1 = notaUm;
		
		
	}
	public int getNota1() {
		return Nota1;
		
	}
	
	
	public String informarNotas() {
		return "Nota 1: "+ getNota1();
			  
			 
		
	}
}