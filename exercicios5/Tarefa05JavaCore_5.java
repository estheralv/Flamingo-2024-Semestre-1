package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		
		System.out.println("Digite o ano de seu nascimento: ");
		int anoNascimento = sc.nextInt();
		
		int diferencaOuIdade = anoAtual - anoNascimento;
		
		if (diferencaOuIdade >= 16) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você não pode votar!");
		}
		
			sc.close();


	}

}
