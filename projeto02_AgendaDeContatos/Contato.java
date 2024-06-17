package projeto02_AgendaDeContatos;

public class Contato {
	
	private String nome;
	private long telefone;
	private String email;
	private long cpf;

		public Contato(String nome, long telefone, String email, long cpf) {
			this.nome = nome;
			this.telefone = telefone;
			this.email = email;
			this.cpf = cpf;
		}

		public String getNome() {
			return nome;
		}
	
		public long getTelefone() {
			return telefone;
		}
	
		public String getEmail() {
			return email;
		}
		
		public long getCpf() {
			return cpf;
		}
	
		@Override
	
		public String toString() {
			return "Contato{" + "nome='" + nome + '\'' + ", telefone='" + telefone + '\'' + ", email='" + email + '\'' + ", cpf='" + cpf + '\'' + '}';
		}

}

