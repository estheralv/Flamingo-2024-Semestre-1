package projeto01_CadastroDeAlunos;

	public class Aluno {
		
		private String nome;
		private int idade;
		private double nota;
		private String turma;
		private int ra;
		private String modalidade;
	
			public Aluno(String nome, int idade, double nota, String turma, int ra, String modalidade) {
				this.nome = nome;
				this.idade = idade;
				this.nota = nota;
				this.turma = turma;
				this.ra = ra;
				this.modalidade = modalidade;
				
			}
	
			public String getNome() {
				return nome;
			}
	
			public int getIdade() {
				return idade;
			}
	
			public double getNota() {
				return nota;
			}
			
			public String getTurma() {
				return turma;
			}
			
			public int getRa() {
				return ra;
			}
			
			public String getModalidade() {
				return modalidade;
			}
	
				@Override
	
			public String toString() {
				return "Aluno{" + "nome=' " + nome + '\'' + ", idade= " + idade + ", nota= " + nota + ", turma= " + turma + ", ra= " + ra + " e modalidade= " + modalidade + '}';
			}

}
