package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor que deseja: ");
		int valor = sc.nextInt();
		
		if (valor > 10) {
			System.out.println("É maior que 10!");
		} else {
			System.out.println("Não é maior que 10!");
		}
		
			sc.close();

	}

}
