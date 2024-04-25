package exercicio13;

import java.util.Scanner;

public class Tarefa13JavaCore_1 {
	
	public static boolean verificacao(int numero) {
		return numero % 2 == 0;
	}

	public static void main(String[] args) {
		
		System.out.println("Digite um valor para descobrir se ele é par ou ímpar: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if (verificacao(numero)) {
			System.out.println("O número: " + numero + " é par!");
		} else {
			System.out.println("O número: " + numero + " é ímpar!");
		}
		
			sc.close();
		
	}

}
