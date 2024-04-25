package exercicios5;

import java.util.Scanner;

public class Tarefa05JavaCore_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a nota da primeira avaliação: ");
		float avaliacao1 = sc.nextFloat();
		
		System.out.println("Digite a nota da segunda avaliação: ");
		float avaliacao2 = sc.nextFloat();
		
		float mediaNotas = (avaliacao1 + avaliacao2) / 2;
		
		if (mediaNotas >= 6) {
			System.out.println("O aluno foi aprovado!");
		} else {
			System.out.println("O aluno foi reprovado!");
		}
		
			sc.close();

	}

}
