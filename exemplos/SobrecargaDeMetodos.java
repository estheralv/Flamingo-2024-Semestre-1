package exemplos;

public class SobrecargaDeMetodos {
	
	static int meuMetodoSomaInteiro(int num1, int num2) {
		return num1 + num2;
	}
	
	static double meuMetodoSomaFlutuante(double num1, double num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		int numero1 = meuMetodoSomaInteiro(2, 4);
		double numero2 = meuMetodoSomaFlutuante(2.23, 4.45);
		System.out.println("O valor da soma dos números inteiros é de: " + numero1);
		System.out.println("O valor da soma dos números flutuantes é de: " + numero2);
	}

}
