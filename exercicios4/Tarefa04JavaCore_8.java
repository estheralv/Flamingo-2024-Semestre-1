package exercicios4;

import java.util.Scanner;

public class Tarefa04JavaCore_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para uma variável \"A\" para descobrir o produto e a soma: ");
		int variavelA = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"B\": ");
		int variavelB = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"C\": ");
		int variavelC = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"D\": ");
		int variavelD = sc.nextInt();
		
		int produtoDeAeC = variavelA * variavelC;
		int somaDeBeD = variavelB + variavelD;
		
		System.out.println("O resultado do produto de \"A\" e \"C\" é: " + produtoDeAeC + " e a soma de \"B\" e \"C\" é: " + somaDeBeD);
		
			sc.close();

	}

}
