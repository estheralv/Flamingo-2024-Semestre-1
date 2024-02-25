package exercicios;

import java.util.Scanner;

public class Tarefa01JavaCore_7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da base do retângulo para calcular sua área: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o valor da altura do retângulo para calcular sua área: ");
		int valor2 = sc.nextInt();
		
		int resultado = valor1 * valor2;
		System.out.println("A área do retângulo de base " + valor1 + " e altura " + valor2 + " é: " + resultado);
		
	}
}
