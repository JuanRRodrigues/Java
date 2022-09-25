
public class Turma {

	private Aluno[] alunos;
	private int posicao;
	
	public Turma() {
		this.alunos = new Aluno[20];
	}

	
	Disciplina discplina = new Disciplina();
	
	Turma.adicionarAluno(D1);
	Turma.adicionarAluno(D2);
	Turma.adicionarAluno(D3);
	Turma.adicionarAluno(A4);
	
    public boolean adicionarAluno(Aluno aluno) {
    	if(aluno != null) {
    		this.alunos[posicao] = aluno;
    		posicao = posicao + 1;
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
	public boolean removerAluno(Aluno aluno) {
		for (int i = 0; i < alunos.length; )
		
		return false;
	}
}