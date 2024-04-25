package exercicios1;

import java.util.Scanner;

public class Tarefa01JavaCore_12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do círculo para calcular sua área: ");
		double valor1 = sc.nextFloat();
		
		double resultado = valor1 * valor1 * Math.PI;
		System.out.println("A área do círculo de raio " + valor1  + " é: " + resultado);
		
			sc.close();
		
	}
}
