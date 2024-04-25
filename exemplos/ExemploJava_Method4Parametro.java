package exemplos;

public class ExemploJava_Method4Parametro {
	
	static void filhos(String pnome, int idade) {
		System.out.println(pnome + " tem " + idade);
	}

		public static void main(String[] args) {
			filhos("Constantino", 6);
			filhos("Márcia", 10);
			filhos("Jemily", 9);
		}

}
