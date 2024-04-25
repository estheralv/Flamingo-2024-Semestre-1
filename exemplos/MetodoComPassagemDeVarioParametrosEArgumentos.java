package exemplos;

public class MetodoComPassagemDeVarioParametrosEArgumentos {
	
	static void meusDados(String nome, int idade, String profissao) {
		System.out.println("Meu nome é: " + nome + ", minha idade é: " + idade + " anos e minha profissão é: " + profissao + ".");
	}

		public static void main(String[] args) {
			meusDados("Esther", 18, "Auxiliar Administrativo");
		}

}
