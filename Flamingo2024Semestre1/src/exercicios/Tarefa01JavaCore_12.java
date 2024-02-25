package exercicios;

import java.util.Scanner;

public class Tarefa01JavaCore_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo para calcular sua área: ");
		int valor1 = sc.nextInt();
		
		float pi = 3.14f;
		
		float resultado = pi * (valor1 * valor1);
		System.out.println("A área do círculo de raio " + valor1  + " é: " + resultado);
		
	}
}
