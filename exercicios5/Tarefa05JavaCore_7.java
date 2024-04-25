package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor desejado: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor desejado: ");
		int valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.println("Os valores em ordem crescente ficam assim: " + valor1 + ", " + valor2);
		} else {
			System.out.println("Os valores em ordem crescente ficam assim: " + valor2 + ", " + valor1);
		}
		
			sc.close();

	}

}
