package exercicios;

import java.util.Scanner;

public class Tarefa01JavaCore_9 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado para calcular sua área: ");
		int valor1 = sc.nextInt();
		
		int resultado = valor1 * valor1;
		System.out.println("A área do quadrado de lado " + valor1  + " é: " + resultado);
		
	}
}
