package exemplos;

public class MetodoComPassagemDeParametroComRetorno {
	
	static int idade(int age) {
		return ++age;
	}

		public static void main(String[] args) {
			System.out.println("Após meu próximo aniversário terei: " + idade(89) + " anos!");
		}

}
