package exercicios1;

import java.util.Scanner;

public class Tarefa01JavaCore_7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do retângulo para calcular sua área: ");
		float valor1 = sc.nextFloat();
		
		System.out.println("Digite o valor da altura do retângulo para calcular sua área: ");
		float valor2 = sc.nextFloat();
		
		float resultado = valor1 * valor2;
		System.out.println("A área do retângulo de base " + valor1 + " e altura " + valor2 + " é: " + resultado);
		
			sc.close();
		
	}
}
