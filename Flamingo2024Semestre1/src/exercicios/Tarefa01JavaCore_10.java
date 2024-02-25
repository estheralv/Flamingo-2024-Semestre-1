package exercicios;

import java.util.Scanner;

public class Tarefa01JavaCore_10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da diagonal maior do losângo para calcular sua área: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o valor da diagonal menor do losângo para calcular sua área: ");
		int valor2 = sc.nextInt();
		
		int resultado = (valor1 * valor2) / 2;
		System.out.println("A área do losângo de diagonal maior " + valor1 + " e diagonal maior " + valor2 + " é: " + resultado);
		
	}
}
