package exercicios4;

import java.util.Scanner;

public class Tarefa04JavaCore_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro para uma variável \"A\" para descobrir o valor do quadrado da soma: ");
		int variavelA = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"B\": ");
		int variavelB = sc.nextInt();
		
		System.out.println("Digite um número inteiro para uma variável \"C\": ");
		int variavelC = sc.nextInt();
		
		int somaDasVariaveisABC = variavelA + variavelB + variavelC;
		
		int quadradoDaSoma = somaDasVariaveisABC * somaDasVariaveisABC;
		
		System.out.println("A soma dos quadrados dos três valores é: " + quadradoDaSoma);
		
			sc.close();
		
	}

}
