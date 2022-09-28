
public class Turma {

	private Aluno[] alunos;
	private int posicao;
	
	
	public Turma() {
		this.alunos = new Aluno[20];
	}

	
	
    public boolean MatricularAluno(Aluno aluno) {
    	if(aluno != null) {
    		this.alunos[posicao] = aluno;
    		posicao = posicao + 1;
    		return true;
    	}
    	else {
    		return false;
    	}	
    }
    public void ListarAlunos() {
    	for(int i = 0; i < alunos.length; i++) {
    		if(alunos[i] != null) {
    			System.out.println(alunos[i].DadosDoAluno());
    			System.out.println("-------------------");
    		}
    		
    	}
    }

public void ListarNotas() {
	for(int i = 0; i < alunos.length; i++) {
		if(alunos[i] != null) {
			System.out.println(alunos[i].DadosDoAluno());
			System.out.println("-------------------");
		}
		
	}
}
    
    
}
	