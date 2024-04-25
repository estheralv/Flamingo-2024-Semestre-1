package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que deseja: ");
		int valor = sc.nextInt();
		
		if (valor >= 0) {
			System.out.println("É positivo!");
		} else {
			System.out.println("É negativo!");
		}
		
			sc.close();

	}

}
