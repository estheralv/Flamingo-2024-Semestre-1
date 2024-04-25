package exemplos;

public class RecursaoDeMetodo_HaltingCondition {
	
	public static void main(String[] args) {
		int resultado = sum(5, 10);
		System.out.println(resultado);
	}
	
	public static int sum(int inicio, int fim) {
		if (fim > inicio) {
			return fim + sum(inicio, fim - 1);
		} else {
			return fim;
		}
		
	}

}
